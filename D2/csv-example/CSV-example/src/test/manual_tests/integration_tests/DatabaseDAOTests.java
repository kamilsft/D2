package test.manual_tests.integration_tests;

import Connections.DatabaseConnection;
import Connections.DatabaseDAO;
import logic.*;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DatabaseDAOTests {

    private Connection connection;
    private DatabaseDAO databaseDAO;

    @BeforeAll
    void setUpDatabaseConnection() throws SQLException {
        connection = DatabaseConnection.getConnection();
        databaseDAO = new DatabaseDAO(connection);
    }

    @BeforeEach
    void cleanDatabaseBeforeTest() throws SQLException {
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate("DELETE FROM Booking");
            stmt.executeUpdate("DELETE FROM Sensor");
            stmt.executeUpdate("DELETE FROM User");
        }
    }

    @AfterEach
    void cleanDatabaseAfterTest() throws SQLException {
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate("DELETE FROM Booking");
            stmt.executeUpdate("DELETE FROM Sensor");
            stmt.executeUpdate("DELETE FROM User");
        }
    }

    @AfterAll
    void closeDatabaseConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    @Test
    void testAddAndGetSensor() throws SQLException {
        Sensor sensor = new Sensor(1);
        sensor.setSensorOn(true);
        sensor.activateSensor(ZonedDateTime.now());
        sensor.setCurrentCarPlate("ABC123");
        sensor.setCurrentCarBrand("Toyota");
        sensor.setCurrentCarModel("Corolla");
        sensor.setCurrentCarColor("Red");
        sensor.setCarArrived(true);

        databaseDAO.addSensor(sensor);

        Sensor retrievedSensor = databaseDAO.getSensorById(1);
        assertNotNull(retrievedSensor);
        assertEquals(1, retrievedSensor.getSensorId());
        assertTrue(retrievedSensor.isSensorOn());
        assertEquals("ABC123", retrievedSensor.getCurrentCarPlate());
        assertEquals("Toyota", retrievedSensor.getCurrentCarBrand());
        assertEquals("Corolla", retrievedSensor.getCurrentCarModel());
        assertEquals("Red", retrievedSensor.getCurrentCarColor());
        assertTrue(retrievedSensor.isCarArrived());
    }

    @Test
    void testAddAndGetUser() throws SQLException {
        User user = new User();
        user.setId(1001);
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        user.setPassword("password123");

        databaseDAO.addUser(user);

        User retrievedUser = databaseDAO.getUserById(1001);
        assertNotNull(retrievedUser);
        assertEquals(1001, retrievedUser.getId());
        assertEquals("John Doe", retrievedUser.getName());
        assertEquals("john.doe@example.com", retrievedUser.getEmail());
        assertEquals("password123", retrievedUser.getPassword());
    }

    @Test
    void testAddAndDeleteBooking() throws SQLException {
        Booking booking = new Booking();
        booking.setBookingStartTime(ZonedDateTime.now());
        booking.setBookingEndTime(ZonedDateTime.now().plusHours(1));
        booking.setCarLicensePlate("XYZ789");
        booking.setValid(true);
        booking.setSensorId(1);
        booking.setUserId(1001);
        booking.setShowUp(true);

        databaseDAO.addBooking(booking);

        assertNotNull(booking.getBookingId());

        databaseDAO.deleteBooking(booking.getBookingId());

        SQLException exception = assertThrows(SQLException.class, () -> {
            databaseDAO.getUserById(booking.getBookingId());
        });
        assertTrue(exception.getMessage().contains("not found"));
    }

    @Test
    void testAddFacultyMember() throws SQLException {
        FacultyMember facultyMember = new FacultyMember("Alice", 1001, "alice@example.com", "password123");
        databaseDAO.addUser(facultyMember);

        User retrievedUser = databaseDAO.getUserById(1001);
        assertNotNull(retrievedUser);
        assertTrue(retrievedUser instanceof FacultyMember);
        assertEquals("Alice", retrievedUser.getName());
    }

    @Test
    void testAddNonFacultyStaff() throws SQLException {
        NonFacultyStaff staff = new NonFacultyStaff("Bob", 2001, "bob@example.com", "password123");
        databaseDAO.addUser(staff);

        User retrievedUser = databaseDAO.getUserById(2001);
        assertNotNull(retrievedUser);
        assertTrue(retrievedUser instanceof NonFacultyStaff);
        assertEquals("Bob", retrievedUser.getName());
    }

    @Test
    void testAddStudent() throws SQLException {
        Student student = new Student("Charlie", 3001, "charlie@example.com", "password123");
        databaseDAO.addUser(student);

        User retrievedUser = databaseDAO.getUserById(3001);
        assertNotNull(retrievedUser);
        assertTrue(retrievedUser instanceof Student);
        assertEquals("Charlie", retrievedUser.getName());
    }

    @Test
    void testAddVisitor() throws SQLException {
        Visitor visitor = new Visitor("Dave", 4001, "dave@example.com", "password123");
        databaseDAO.addUser(visitor);

        User retrievedUser = databaseDAO.getUserById(4001);
        assertNotNull(retrievedUser);
        assertTrue(retrievedUser instanceof Visitor);
        assertEquals("Dave", retrievedUser.getName());
    }

    @Test
    void testAddManager() throws SQLException {
        Manager manager = new Manager("Eve", 5001, "eve@example.com", "password123");
        databaseDAO.addUser(manager);

        User retrievedUser = databaseDAO.getUserById(5001);
        assertNotNull(retrievedUser);
        assertTrue(retrievedUser instanceof Manager);
        assertEquals("Eve", retrievedUser.getName());
    }
}
