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

CREATE TABLE Sensor (
    sensorId INT PRIMARY KEY,
    sensorOn BOOLEAN NOT NULL DEFAULT FALSE,
    sensorActivationTime TIMESTAMP NULL,
    sensorDeactivationTime TIMESTAMP NULL,
    currentCarPlate VARCHAR(20) DEFAULT '',
    currentCarBrand VARCHAR(50) DEFAULT '',
    currentCarModel VARCHAR(50) DEFAULT '',
    currentCarColor VARCHAR(30) DEFAULT '',
    carArrived BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE ParkingSpot (
    spotId VARCHAR(3) PRIMARY KEY,
    sensorId INT,
    isOccupied BOOLEAN,
    lotId VARCHAR(10),
    FOREIGN KEY (sensorId) REFERENCES Sensor(sensorId)
    FOREIGN KEY (lotId) REFERENCES ParkingLot(lotId)
);
 

CREATE TABLE Booking (
    bookingId INTEGER PRIMARY KEY AUTOINCREMENT,
    bookingStartTime TIMESTAMP,
    bookingEndTime TIMESTAMP,
    carLicensePlate VARCHAR(50),
    isValid BOOLEAN,
    sensorId INT,
    userId INT,
    spotId VARCHAR(3),
    showUp BOOLEAN,
    FOREIGN KEY (sensorId) REFERENCES Sensor(sensorId),
    FOREIGN KEY (userId) REFERENCES User(userId),
    FOREIGN KEY (spotId) REFERENCES ParkingSpot(spotId)
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

