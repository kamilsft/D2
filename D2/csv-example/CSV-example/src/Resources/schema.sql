-- Table for User
CREATE TABLE User (
    userId INT PRIMARY KEY CHECK (
        userId LIKE '1%' OR 
        userId LIKE '2%' OR 
        userId LIKE '3%' OR 
        userId LIKE '4%' OR 
        userId LIKE '5%'
    )
);

-- Table for Booking
CREATE TABLE Booking (
    bookingId INT PRIMARY KEY,
    bookingStartTime TIMESTAMP,
    bookingEndTime TIMESTAMP,
    carLicensePlate VARCHAR(50),
    isValid BOOLEAN,
    sensorId INT,
    userId INT,
    showUp BOOLEAN,
    FOREIGN KEY (sensorId) REFERENCES ParkingSpot(sensorId),
    FOREIGN KEY (userId) REFERENCES User(userId)
);

-- Table for FacultyMember
CREATE TABLE FacultyMember (
    userId INT PRIMARY KEY CHECK (userId LIKE '1%'),
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    FOREIGN KEY (userId) REFERENCES User(userId)
);

-- Table for NonFacultyStaff
CREATE TABLE NonFacultyStaff (
    userId INT PRIMARY KEY CHECK (userId LIKE '2%'),
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    FOREIGN KEY (userId) REFERENCES User(userId)
);

-- Table for Manager
CREATE TABLE Manager (
    userId INT PRIMARY KEY CHECK (userId LIKE '5%'),
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    FOREIGN KEY (userId) REFERENCES User(userId)
);

-- Table for Student
CREATE TABLE Student (
    userId INT PRIMARY KEY CHECK (userId LIKE '3%'),
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    FOREIGN KEY (userId) REFERENCES User(userId)
);

-- Table for Visitor
CREATE TABLE Visitor (
    userId INT PRIMARY KEY CHECK (userId LIKE '4%'),
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    FOREIGN KEY (userId) REFERENCES User(userId)
);

-- Table for ParkingLot
CREATE TABLE ParkingLot (
    lotId INT PRIMARY KEY
);

-- Table for ParkingSpot
CREATE TABLE ParkingSpot (
    sensorId INT PRIMARY KEY,
    isOccupied BOOLEAN,
    lotId INT,
    FOREIGN KEY (lotId) REFERENCES ParkingLot(lotId)
);