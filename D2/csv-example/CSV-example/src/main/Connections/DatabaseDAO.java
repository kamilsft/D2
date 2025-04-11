package main.Connections;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import main.logic.*;

// Class to interact with the database
//How to use
/*
 * make new DatabaseDEO object with a connection as the constructor argument: ===> DatabaseDEO db = new DatabaseDEO(DatabaseConnection.getConnection());
 * use any of its methods to interact with the database. Example ===> db.addBooking(1, Timestamp.valueOf("2021-04-01 10:00:00"), Timestamp.valueOf("2021-04-01 11:00:00"), "1234", true, 1, 1, true);
 * or an even easier way  ===> db.addBooking(bookingObject);
 * 
 * 
 */
public class DatabaseDAO {
    private Connection connection;

    public DatabaseDAO(Connection connection) {
        this.connection = connection;
    }

    // Method to add a booking
//    public void addBooking(int bookingId, Timestamp startTime, Timestamp endTime, String carLicensePlate, boolean isValid, int sensorId, int userId, boolean showUp) throws SQLException {
//        String query = "INSERT INTO Booking (bookingId, bookingStartTime, bookingEndTime, carLicensePlate, isValid, sensorId, userId, showUp) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//        try (PreparedStatement stmt = connection.prepareStatement(query)) {
//            stmt.setInt(1, bookingId);
//            stmt.setTimestamp(2, startTime);
//            stmt.setTimestamp(3, endTime);
//            stmt.setString(4, carLicensePlate);
//            stmt.setBoolean(5, isValid);
//            stmt.setInt(6, sensorId);
//            stmt.setInt(7, userId);
//            stmt.setBoolean(8, showUp);
//            stmt.executeUpdate();
//        }
//    }

    // Add a User
    public void addUser(User user) throws SQLException {
        String query = "INSERT INTO User (userId) VALUES (?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, user.getId());
            stmt.executeUpdate();
        }

        // Call the appropriate method to add the user to the specific table
        if (String.valueOf(user.getId()).startsWith("1")) {
            addFacultyMember((FacultyMember) user);
        } else if (String.valueOf(user.getId()).startsWith("2")) {
            addNonFacultyStaff((NonFacultyStaff) user);
        } else if (String.valueOf(user.getId()).startsWith("3")) {
            addStudent((Student) user);
        } else if (String.valueOf(user.getId()).startsWith("4")) {
            addVisitor((Visitor) user);
        } else if (String.valueOf(user.getId()).startsWith("5")) {
            addManager((Manager) user);
        } else {
            throw new IllegalArgumentException("Invalid user ID: " + user.getId());
        }
    }

    // Add a ParkingLot
    public void addParkingLot(ParkingLot parkingLot) throws SQLException {
        String query = "INSERT INTO ParkingLot (lotId) VALUES (?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, parkingLot.getId());
            stmt.executeUpdate();
        }
    }

    // Updated method to add a ParkingSpot
    public void addParkingSpot(ParkingSpot parkingSpot) throws SQLException {
        String query = "INSERT INTO ParkingSpot (spotId, sensorId, isOccupied, lotId) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, parkingSpot.getSpotId());
            stmt.setInt(2, parkingSpot.getSensorId());
            stmt.setBoolean(3, parkingSpot.isOccupied());
            stmt.setString(4, parkingSpot.getLotId());
            stmt.executeUpdate();
        }
    }

    // Add a Booking
    public void addBooking(Booking booking) throws SQLException {
        String query = "INSERT INTO Booking (bookingStartTime, bookingEndTime, carLicensePlate, isValid, sensorId, userId, showUp) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
           // stmt.setInt(1, booking.getBookingId());
        	stmt.setTimestamp(1, Timestamp.from(booking.getBookingStartTime().toInstant()));
            stmt.setTimestamp(2, Timestamp.from(booking.getBookingEndTime().toInstant()));
            stmt.setString(3, booking.getCarLicensePlate());
            stmt.setBoolean(4, booking.isValid());
            stmt.setInt(5, booking.getSensorId());
            stmt.setInt(6, booking.getUserId());
            stmt.setBoolean(7, booking.isShowUp());
            stmt.executeUpdate();
            
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int generatedId = generatedKeys.getInt(1);
                    booking.setBookingId(generatedId);  // store it if you want to show it
                    System.out.println("Booking inserted with ID: " + generatedId);
                }
            }
            
        }
    }
    
    // Add a FacultyMember
    public void addFacultyMember(FacultyMember facultyMember) throws SQLException {
        String query = "INSERT INTO FacultyMember (userId, name, email, password) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, facultyMember.getId());
            stmt.setString(2, facultyMember.getName());
            stmt.setString(3, facultyMember.getEmail());
            stmt.setString(4, facultyMember.getPassword());
            stmt.executeUpdate();
        }
    }

    // Add a NonFacultyStaff
    public void addNonFacultyStaff(NonFacultyStaff nonFacultyStaff) throws SQLException {
        String query = "INSERT INTO NonFacultyStaff (userId, name, email, password) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, nonFacultyStaff.getId());
            stmt.setString(2, nonFacultyStaff.getName());
            stmt.setString(3, nonFacultyStaff.getEmail());
            stmt.setString(4, nonFacultyStaff.getPassword());
            stmt.executeUpdate();
        }
    }

    // Add a Manager
    public void addManager(Manager manager) throws SQLException {
        String query = "INSERT INTO Manager (userId, name, email, password) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, manager.getId());
            stmt.setString(2, manager.getName());
            stmt.setString(3, manager.getEmail());
            stmt.setString(4, manager.getPassword());
            stmt.executeUpdate();
        }
    }

    // Add a Student
    public void addStudent(Student student) throws SQLException {
        String query = "INSERT INTO Student (userId, name, email, password) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, student.getId());
            stmt.setString(2, student.getName());
            stmt.setString(3, student.getEmail());
            stmt.setString(4, student.getPassword());
            stmt.executeUpdate();
        }
    }

    // Add a Visitor
    public void addVisitor(Visitor visitor) throws SQLException {
        String query = "INSERT INTO Visitor (userId, name, email, password) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, visitor.getId());
            stmt.setString(2, visitor.getName());
            stmt.setString(3, visitor.getEmail());
            stmt.setString(4, visitor.getPassword());
            stmt.executeUpdate();
        }
    }

    // Method to insert a user into the appropriate table based on their ID
    public void addUserToSpecificTable(User user) throws SQLException {
        int userId = user.getId();
        
        // first inserting into the User table
        String baseUserQuery = "INSERT INTO User (userId) VALUES (?)";
        try(PreparedStatement stmt = connection.prepareStatement(baseUserQuery)){
        	stmt.setInt(1, userId);
        	stmt.executeUpdate();
        }
        
        String query;
        // debugging 
        System.out.println("Trying to insert user into DB: " + user.getName() + ", ID: " + user.getId());

        
        if (String.valueOf(userId).startsWith("1")) {
            query = "INSERT INTO FacultyMember (userId, name, email, password) VALUES (?, ?, ?, ?)";
        } else if (String.valueOf(userId).startsWith("2")) {
            query = "INSERT INTO NonFacultyStaff (userId, name, email, password) VALUES (?, ?, ?, ?)";
        } else if (String.valueOf(userId).startsWith("3")) {
            query = "INSERT INTO Student (userId, name, email, password) VALUES (?, ?, ?, ?)";
        } else if (String.valueOf(userId).startsWith("4")) {
            query = "INSERT INTO Visitor (userId, name, email, password) VALUES (?, ?, ?, ?)";
        } else if (String.valueOf(userId).startsWith("5")) {
            query = "INSERT INTO Manager (userId, name, email, password) VALUES (?, ?, ?, ?)";
        } else {
            throw new IllegalArgumentException("Invalid user ID: " + userId);
        }

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, user.getId());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPassword());
            stmt.executeUpdate();
        }
    }

    // Method to fetch a FacultyMember by userId
    public FacultyMember getFacultyMember(int userId) throws SQLException {
        String query = "SELECT * FROM FacultyMember WHERE userId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new FacultyMember(
                        rs.getString("name"),
                        rs.getInt("userId"),
                        rs.getString("email"),
                        rs.getString("password")
                    );
                }
            }
        }
        return null;
    }

    // Method to fetch a NonFacultyStaff by userId
    public NonFacultyStaff getNonFacultyStaff(int userId) throws SQLException {
        String query = "SELECT * FROM NonFacultyStaff WHERE userId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new NonFacultyStaff(
                        rs.getString("name"),
                        rs.getInt("userId"),
                        rs.getString("email"),
                        rs.getString("password")
                    );
                }
            }
        }
        return null;
    }

    // Method to fetch a Manager by userId
    public Manager getManager(int userId) throws SQLException {
        if (userId == 0) {
            // Return a SuperManager if the userId is 0
            String query = "SELECT * FROM Manager WHERE userId = ?";
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setInt(1, userId);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        return SuperManager.getInstance();
                    }
                }
            }
        } else if (String.valueOf(userId).startsWith("5")) {
            // Return a GeneralManager if the userId starts with 5
            String query = "SELECT * FROM Manager WHERE userId = ?";
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setInt(1, userId);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        return new GeneralManager(
                            rs.getString("name"),
                            rs.getInt("userId"),
                            rs.getString("email"),
                            rs.getString("password")
                        );
                    }
                }
            }
        }
        throw new IllegalArgumentException("Invalid Manager ID: " + userId);
    }

    // Method to fetch a Student by userId
    public Student getStudent(int userId) throws SQLException {
        String query = "SELECT * FROM Student WHERE userId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Student(
                        rs.getString("name"),
                        rs.getInt("userId"),
                        rs.getString("email"),
                        rs.getString("password")
                    );
                }
            }
        }
        return null;
    }

    // Method to fetch a Visitor by userId
    public Visitor getVisitor(int userId) throws SQLException {
        String query = "SELECT * FROM Visitor WHERE userId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Visitor(
                        rs.getString("name"),
                        rs.getInt("userId"),
                        rs.getString("email"),
                        rs.getString("password")
                    );
                }
            }
        }
        return null;
    }

    // Method to fetch a generic User object by userId
    public User getUserById(int userId) throws SQLException {
        if (String.valueOf(userId).startsWith("1")) {
            return getFacultyMember(userId);
        } else if (String.valueOf(userId).startsWith("2")) {
            return getNonFacultyStaff(userId);
        } else if (String.valueOf(userId).startsWith("3")) {
            return getStudent(userId);
        } else if (String.valueOf(userId).startsWith("4")) {
            return getVisitor(userId);
        } else if (String.valueOf(userId).startsWith("5")) {
            return getManager(userId);
        } else {
            throw new IllegalArgumentException("Invalid user ID: " + userId);
        }
    }

    // // Method to get all bookings for a specific user will be implemented later if needed
    // public List<Booking> getBookingsByUserId(int userId) throws SQLException {
    //     String query = "SELECT * FROM Booking WHERE userId = ?";
    //     List<Booking> bookings = new ArrayList<>();
    //     try (PreparedStatement stmt = connection.prepareStatement(query)) {
    //         stmt.setInt(1, userId);
    //         try (ResultSet rs = stmt.executeQuery()) {
    //             while (rs.next()) {
    //                 bookings.add(new Booking(
    //                     rs.getInt("bookingId"),
    //                     rs.getTimestamp("bookingStartTime"),
    //                     rs.getTimestamp("bookingEndTime"),
    //                     rs.getString("carLicensePlate"),
    //                     rs.getBoolean("isValid"),
    //                     rs.getInt("sensorId"),
    //                     rs.getInt("userId"),
    //                     rs.getBoolean("showUp")
    //                 ));
    //             }
    //         }
    //     }
    //     return bookings;
    // }

    // Method to update the status of a parking spot
    public void updateParkingSpotStatus(int sensorId, boolean isOccupied) throws SQLException {
        String query = "UPDATE ParkingSpot SET isOccupied = ? WHERE sensorId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setBoolean(1, isOccupied);
            stmt.setInt(2, sensorId);
            stmt.executeUpdate();
        }
    }

    // Method to get available parking spots in a specific lot
    public List<Integer> getAvailableParkingSpots(int lotId) throws SQLException {
        String query = "SELECT sensorId FROM ParkingSpot WHERE lotId = ? AND isOccupied = 0";
        List<Integer> availableSpots = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, lotId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    availableSpots.add(rs.getInt("sensorId"));
                }
            }
        }
        return availableSpots;
    }

    // Method to delete a booking
    public void deleteBooking(int bookingId) throws SQLException {
        String query = "DELETE FROM Booking WHERE bookingId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, bookingId);
            stmt.executeUpdate();
        }
    }

    // Method to validate a booking
    public void validateBooking(int bookingId, boolean isValid) throws SQLException {
        String query = "UPDATE Booking SET isValid = ? WHERE bookingId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setBoolean(1, isValid);
            stmt.setInt(2, bookingId);
            stmt.executeUpdate();
        }
    }

    // Method to invalidate a booking by booking ID
    public void invalidateBooking(int bookingId) throws SQLException {
        String query = "UPDATE Booking SET isValid = 0 WHERE bookingId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, bookingId);
            stmt.executeUpdate();
        }
    }

    // Method to get all parking lots
    public List<Integer> getAllParkingLots() throws SQLException {
        String query = "SELECT lotId FROM ParkingLot";
        List<Integer> lots = new ArrayList<>();
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                lots.add(rs.getInt("lotId"));
            }
        }
        return lots;
    }

    // Method to insert a sensor into the table using individual parameters
    public void addSensor(int sensorId, boolean sensorOn, Timestamp sensorActivationTime, Timestamp sensorDeactivationTime, 
                        String currentCarPlate, String currentCarBrand, String currentCarModel, String currentCarColor, 
                        boolean carArrived) throws SQLException {
        String query = "INSERT INTO Sensor (sensorId, sensorOn, sensorActivationTime, sensorDeactivationTime, currentCarPlate, " +
                    "currentCarBrand, currentCarModel, currentCarColor, carArrived) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, sensorId);
            stmt.setBoolean(2, sensorOn);
            stmt.setTimestamp(3, sensorActivationTime);
            stmt.setTimestamp(4, sensorDeactivationTime);
            stmt.setString(5, currentCarPlate);
            stmt.setString(6, currentCarBrand);
            stmt.setString(7, currentCarModel);
            stmt.setString(8, currentCarColor);
            stmt.setBoolean(9, carArrived);
            stmt.executeUpdate();
        }
    }

    // Method to insert a sensor into the table using a Sensor object
    public void addSensor(Sensor sensor) throws SQLException {
        addSensor(sensor.getSensorId(), sensor.isSensorOn(), 
                sensor.getSensorActivationTime() != null ? Timestamp.from(sensor.getSensorActivationTime().toInstant()) : null,
                sensor.getSensorDeactivationTime() != null ? Timestamp.from(sensor.getSensorDeactivationTime().toInstant()) : null,
                sensor.getCurrentCarPlate(), sensor.getCurrentCarBrand(), sensor.getCurrentCarModel(), 
                sensor.getCurrentCarColor(), sensor.isCarArrived());
    }

    // Method to get a Sensor object by sensorId
    public Sensor getSensorById(int sensorId) throws SQLException {
        String query = "SELECT * FROM Sensor WHERE sensorId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, sensorId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Sensor sensor = new Sensor(rs.getInt("sensorId"));
                    sensor.setSensorOn(rs.getBoolean("sensorOn"));
                    sensor.activateSensor(rs.getTimestamp("sensorActivationTime") != null ? 
                                        rs.getTimestamp("sensorActivationTime").toInstant().atZone(java.time.ZoneId.systemDefault()) : null);
                    sensor.deactivateSensor(rs.getTimestamp("sensorDeactivationTime") != null ? 
                                            rs.getTimestamp("sensorDeactivationTime").toInstant().atZone(java.time.ZoneId.systemDefault()) : null);
                    sensor.setCurrentCarPlate(rs.getString("currentCarPlate"));
                    sensor.setCurrentCarBrand(rs.getString("currentCarBrand"));
                    sensor.setCurrentCarModel(rs.getString("currentCarModel"));
                    sensor.setCurrentCarColor(rs.getString("currentCarColor"));
                    sensor.setCarArrived(rs.getBoolean("carArrived"));
                    return sensor;
                }
            }
        }
        return null;
    }

    // Method to get a Sensor object by spotId
    public Sensor getSensorBySpotId(int spotId) throws SQLException {
        String query = "SELECT s.* FROM Sensor s JOIN ParkingSpot ps ON s.sensorId = ps.sensorId WHERE ps.spotId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, spotId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Sensor sensor = new Sensor(rs.getInt("sensorId"));
                    sensor.setSensorOn(rs.getBoolean("sensorOn"));
                    sensor.activateSensor(rs.getTimestamp("sensorActivationTime") != null ? 
                                        rs.getTimestamp("sensorActivationTime").toInstant().atZone(java.time.ZoneId.systemDefault()) : null);
                    sensor.deactivateSensor(rs.getTimestamp("sensorDeactivationTime") != null ? 
                                            rs.getTimestamp("sensorDeactivationTime").toInstant().atZone(java.time.ZoneId.systemDefault()) : null);
                    sensor.setCurrentCarPlate(rs.getString("currentCarPlate"));
                    sensor.setCurrentCarBrand(rs.getString("currentCarBrand"));
                    sensor.setCurrentCarModel(rs.getString("currentCarModel"));
                    sensor.setCurrentCarColor(rs.getString("currentCarColor"));
                    sensor.setCarArrived(rs.getBoolean("carArrived"));
                    return sensor;
                }
            }
        }
        return null;
    }

    // Method to get the sensorOn condition by sensorId
    public boolean isSensorOn(int sensorId) throws SQLException {
        String query = "SELECT sensorOn FROM Sensor WHERE sensorId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, sensorId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getBoolean("sensorOn");
                }
            }
        }
        throw new SQLException("Sensor with ID " + sensorId + " not found.");
    }
    
     // Method to update the carArrived attribute of a sensor
    public void setCarArrived(int sensorId, boolean carArrived) throws SQLException {
        String query = "UPDATE Sensor SET carArrived = ? WHERE sensorId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setBoolean(1, carArrived);
            stmt.setInt(2, sensorId);
            stmt.executeUpdate();
        }
    }
}
