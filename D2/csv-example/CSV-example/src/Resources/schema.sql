
CREATE TABLE User (
    userId INT PRIMARY KEY CHECK (
        userId LIKE '1%' OR 
        userId LIKE '2%' OR 
        userId LIKE '3%' OR 
        userId LIKE '4%' OR 
        userId LIKE '5%'
    )
);


CREATE TABLE ParkingLot (
    lotId VARCHAR(10) PRIMARY KEY
);


CREATE TABLE ParkingSpot (
    spotId VARCHAR(3) PRIMARY KEY,
    sensorId INT,
    isOccupied BOOLEAN,
    lotId VARCHAR(10),
    FOREIGN KEY (lotId) REFERENCES ParkingLot(lotId)
);


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


CREATE TABLE FacultyMember (
    userId INT PRIMARY KEY CHECK (userId LIKE '1%'),
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    FOREIGN KEY (userId) REFERENCES User(userId)
);

CREATE TABLE NonFacultyStaff (
    userId INT PRIMARY KEY CHECK (userId LIKE '2%'),
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    FOREIGN KEY (userId) REFERENCES User(userId)
);


CREATE TABLE Manager (
    userId INT PRIMARY KEY CHECK (userId LIKE '5%'),
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    FOREIGN KEY (userId) REFERENCES User(userId)
);


CREATE TABLE Student (
    userId INT PRIMARY KEY CHECK (userId LIKE '3%'),
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    FOREIGN KEY (userId) REFERENCES User(userId)
);


CREATE TABLE Visitor (
    userId INT PRIMARY KEY CHECK (userId LIKE '4%'),
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    FOREIGN KEY (userId) REFERENCES User(userId)
);

