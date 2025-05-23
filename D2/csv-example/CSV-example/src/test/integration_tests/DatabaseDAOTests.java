package test.integration_tests;

import main.Connections.DatabaseConnection;
import main.Connections.DatabaseDAO;
import main.logic.Booking;
import main.logic.FacultyMember;
import main.logic.GeneralManager;
import main.logic.Manager;
import main.logic.NonFacultyStaff;
import main.logic.ParkingLot;
import main.logic.ParkingSpot;
import main.logic.Sensor;
import main.logic.Student;
import main.logic.Visitor;
import main.logic.User;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.ZonedDateTime;
import java.util.List;

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
            stmt.executeUpdate("DELETE FROM ParkingSpot");
            stmt.executeUpdate("DELETE FROM Sensor");
            stmt.executeUpdate("DELETE FROM FacultyMember");
            stmt.executeUpdate("DELETE FROM NonFacultyStaff");
            stmt.executeUpdate("DELETE FROM Manager");
            stmt.executeUpdate("DELETE FROM Student");
            stmt.executeUpdate("DELETE FROM Visitor");
            stmt.executeUpdate("DELETE FROM User");
            stmt.executeUpdate("DELETE FROM ParkingLot");
        }
    }

    @AfterEach
    void cleanDatabaseAfterTest() throws SQLException {
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate("DELETE FROM Booking");
            stmt.executeUpdate("DELETE FROM ParkingSpot");
            stmt.executeUpdate("DELETE FROM Sensor");
            stmt.executeUpdate("DELETE FROM FacultyMember");
            stmt.executeUpdate("DELETE FROM NonFacultyStaff");
            stmt.executeUpdate("DELETE FROM Manager");
            stmt.executeUpdate("DELETE FROM Student");
            stmt.executeUpdate("DELETE FROM Visitor");
            stmt.executeUpdate("DELETE FROM User");
            stmt.executeUpdate("DELETE FROM ParkingLot");
        }
    }

    @AfterAll
    void closeDatabaseConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

//    @Test
//    void testAddAndGetSensor() throws SQLException {
//        Sensor sensor = new Sensor(1);
//        sensor.setSensorOn(true);
//        sensor.activateSensor(ZonedDateTime.now());
//        sensor.setCurrentCarPlate("ABC123");
//        sensor.setCurrentCarBrand("Toyota");
//        sensor.setCurrentCarModel("Corolla");
//        sensor.setCurrentCarColor("Red");
//        sensor.setCarArrived(true);
//
//        databaseDAO.addSensor(sensor);
//
//        Sensor retrievedSensor = databaseDAO.getSensorById(1);
//        assertNotNull(retrievedSensor);
//        assertEquals(1, retrievedSensor.getSensorId());
//        assertTrue(retrievedSensor.isSensorOn(), "Sensor should be on.");
//        assertEquals("ABC123", retrievedSensor.getCurrentCarPlate());
//        assertEquals("Toyota", retrievedSensor.getCurrentCarBrand());
//        assertEquals("Corolla", retrievedSensor.getCurrentCarModel());
//        assertEquals("Red", retrievedSensor.getCurrentCarColor());
//        assertTrue(retrievedSensor.isCarArrived(), "Car should have arrived.");
//    }

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
    void testAddBooking() throws SQLException {
        Sensor sensor = new Sensor(1);
        sensor.setSensorOn(true);
        databaseDAO.addSensor(sensor);

        ParkingSpot spot = new ParkingSpot("A1", "North Lot", false, true, 1);
        databaseDAO.addParkingSpot(spot);

        User user = new User("Test User", 1001, "test@example.com", "password");
        databaseDAO.addUser(user);

        Booking booking = new Booking(ZonedDateTime.now(), ZonedDateTime.now().plusHours(1), "XYZ789", true, spot, user, 1);
        databaseDAO.addBooking(booking);

        assertNotNull(booking.getBookingId(), "Booking ID should not be null after adding.");
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
        Manager manager = new GeneralManager("Eve", 5001, "eve@example.com", "password123");
        databaseDAO.addUser(manager);

        User retrievedUser = databaseDAO.getUserById(5001);
        assertNotNull(retrievedUser);
        assertTrue(retrievedUser instanceof Manager);
        assertEquals("Eve", retrievedUser.getName());
    }


    @Test
    void testGetAvailableParkingSpots() throws SQLException {
        ParkingLot lot = new ParkingLot("North Lot");
        databaseDAO.addParkingLot(lot);

        Sensor sensor1 = new Sensor(1);
        Sensor sensor2 = new Sensor(2);
        databaseDAO.addSensor(sensor1);
        databaseDAO.addSensor(sensor2);

        ParkingSpot spot1 = new ParkingSpot("A1", "North Lot", false, true, 1);
        ParkingSpot spot2 = new ParkingSpot("A2", "North Lot", false, true, 2);
        databaseDAO.addParkingSpot(spot1);
        databaseDAO.addParkingSpot(spot2);

        databaseDAO.updateParkingSpotStatus(1, true); // Mark one spot as occupied

        List<String> availableSpots = databaseDAO.getAvailableParkingSpots("North Lot");
        assertEquals(1, availableSpots.size(), "Only one spot should be available.");
        assertEquals("A2", availableSpots.get(0), "Spot A2 should be available.");
    }

//    @Test
//    void testInvalidateBooking() throws SQLException {
//        Sensor sensor = new Sensor(1);
//        sensor.setSensorOn(true);
//        databaseDAO.addSensor(sensor);
//
//        ParkingSpot spot = new ParkingSpot("A1", "North Lot", false, true, 1);
//        databaseDAO.addParkingSpot(spot);
//
//        User user = new User("Test User", 1001, "test@example.com", "password");
//        databaseDAO.addUser(user);
//
//        Booking booking = new Booking(ZonedDateTime.now(), ZonedDateTime.now().plusHours(1), "XYZ789", true, spot, user, 1);
//        databaseDAO.addBooking(booking);
//
//        databaseDAO.invalidateBooking(booking.getBookingId());
//        Booking invalidatedBooking = databaseDAO.getBookingById(booking.getBookingId());
//        assertFalse(invalidatedBooking.isValid(), "Booking should be invalidated.");
//    }

//    @Test
//    void testValidateBooking() throws SQLException {
//        Sensor sensor = new Sensor(1);
//        sensor.setSensorOn(false);
//        databaseDAO.addSensor(sensor);
//
//        ParkingSpot spot = new ParkingSpot("A1", "North Lot", false, true, 1);
//        databaseDAO.addParkingSpot(spot);
//
//        User user = new User("Test User", 1001, "test@example.com", "password");
//        databaseDAO.addUser(user);
//
//        Booking booking = new Booking(ZonedDateTime.now(), ZonedDateTime.now().plusHours(1), "XYZ789", false, spot, user, 1);
//        databaseDAO.addBooking(booking);
//
//        databaseDAO.validateBooking(booking.getBookingId(), true);
//        Booking validatedBooking = databaseDAO.getBookingById(booking.getBookingId());
//        assertTrue(validatedBooking.isValid(), "Booking should be validated.");
//    }


    @Test
    void testGetAllParkingLots() throws SQLException {
        ParkingLot lot1 = new ParkingLot("North Lot");
        ParkingLot lot2 = new ParkingLot("South Lot");
        databaseDAO.addParkingLot(lot1);
        databaseDAO.addParkingLot(lot2);

        List<String> parkingLots = databaseDAO.getAllParkingLots();
        assertEquals(2, parkingLots.size(), "There should be two parking lots.");
        assertTrue(parkingLots.contains("North Lot"), "North Lot should be in the list.");
        assertTrue(parkingLots.contains("South Lot"), "South Lot should be in the list.");
    }
}
