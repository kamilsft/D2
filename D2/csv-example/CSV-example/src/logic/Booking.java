package logic;
import java.time.ZonedDateTime;
import java.util.Stack;

import Connections.DatabaseConnection;
import DesignPatternClasses.Observer;
import Connections.DatabaseDAO;
import java.sql.SQLException;
import DesignPatternClasses.Command; // Adjust the package path if necessary

public class Booking implements Observer{
	public int bookingId;
	public ZonedDateTime bookingStartTime;
	public ZonedDateTime bookingEndTime;
	private String carLicensePlate;
	public boolean isValid;
	public ParkingSpot spot;
	public User user;
	private boolean showUp;
	private int sensorId;
	private EnableSensorCommand enableSensorCommand;
	private DisableSensorCommand disableSensorCommand;
	private Stack<Command> commandStack = new Stack<>();
	public int userId;
	public String email;
	
	// the next new booking id will be 1, then 2 and so on
	private static int bookingCounter = 0;
	
	public Booking(ZonedDateTime bookingStartTime, 
		ZonedDateTime bookingEndTime, String carLicensePlate, 
		boolean isValid, ParkingSpot spot, User user) {
		this.bookingId = generateBookingId();
		this.bookingStartTime = bookingStartTime;
		this.bookingEndTime = bookingEndTime;
		this.carLicensePlate = carLicensePlate;
		this.isValid = isValid;
		this.spot = spot;
		this.user = user;
		this.showUp = false;
		this.email = user.getEmail();
	}
	//different method signature for sensor initialization
	public Booking(ZonedDateTime bookingStartTime, 
		ZonedDateTime bookingEndTime, String carLicensePlate, 
		boolean isValid, ParkingSpot spot, User user, int sensorId) {
		this.bookingId = generateBookingId();
		this.bookingStartTime = bookingStartTime;
		this.bookingEndTime = bookingEndTime;
		this.carLicensePlate = carLicensePlate;
		this.isValid = isValid;
		this.spot = spot;
		this.user = user;
		this.showUp = false;
		this.sensorId = sensorId;
		this.enableSensorCommand = new EnableSensorCommand(spot.getSensor());
		this.disableSensorCommand = new DisableSensorCommand(spot.getSensor());
	}

	public Booking(User user, ParkingSpot spot) {
		this.user = user;
		this.spot = spot;
	}

	// each user at the same time can book
	// generating unique ID's for each new booking 
	private synchronized static int generateBookingId() {
		return bookingCounter++;
	}
	
	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public ZonedDateTime getBookingStartTime() {
		return bookingStartTime;
	}

	public void setBookingStartTime(ZonedDateTime bookingStartTime) {
		this.bookingStartTime = bookingStartTime;
	}

	public ZonedDateTime getBookingEndTime() {
		return bookingEndTime;
	}

	public void setBookingEndTime(ZonedDateTime bookingEndTime) {
		this.bookingEndTime = bookingEndTime;
	}

	public String getCarLicensePlate() {
		return carLicensePlate;
	}

	public void setCarLicensePlate(String carLicensePlate) {
		this.carLicensePlate = carLicensePlate;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		//parking time has expired so use command to turn off the sensor
		if(!isValid) { //checking if the last command on the stack is either null or enableSensorCommand
			if(!commandStack.isEmpty() && commandStack.peek() != null) {
				Command lastCommand = commandStack.peek();
				if(lastCommand instanceof EnableSensorCommand) {
					disableSensorCommand.execute();
					commandStack.pop(); // Remove the last command from the stack

					try {
						DatabaseDAO db = new DatabaseDAO(DatabaseConnection.getConnection());
						db.setCarArrived(sensorId, false);
					} catch (SQLException e) {
						e.printStackTrace(); // Log the exception
					}
				}
			}
			
		}else { //if the last command on the stack is either null or disableSensorCommand
			if(!commandStack.isEmpty() && commandStack.peek() != null) {
				Command lastCommand = commandStack.peek();
				if(lastCommand instanceof DisableSensorCommand) {
					enableSensorCommand.execute();
					commandStack.pop(); // Remove the last command from the stack
					
					try {
						DatabaseDAO db = new DatabaseDAO(DatabaseConnection.getConnection());
						db.setCarArrived(sensorId, true);
					} catch (SQLException e) {
						e.printStackTrace(); // Log the exception
					}
				}
			}
		}
		this.isValid = isValid;
	}

	public ParkingSpot getSpot() {
		return spot;
	}

	public void setSpot(ParkingSpot spot) {
		this.spot = spot;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public boolean isShowUp() {
		return showUp;
	}
  
	public void setShowUp(boolean showUp) {
		this.showUp = showUp;
	} 

	// Method to get the sensor ID associated with the booking
	public int getSensorId() {
		return this.sensorId;
	}
	
	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
	}

	// Method to get the user ID associated with the booking
	public int getUserId() {
		return this.user.getId();
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getEmail() {
		return email;
	}

	// Override the update method from Observer interface
    @Override
	public void update() {
		ParkingSpot spot = this.getSpot();
		Sensor sensor = spot.getSensor();

		//if statement to check if the sensor is on
		if(sensor.isSensorOn()) {
			sensor.setCarArrived(true);
			try {
				DatabaseDAO db = new DatabaseDAO(DatabaseConnection.getConnection());
				db.setCarArrived(sensor.getSensorId(), true);
			} catch (SQLException e) {
				e.printStackTrace(); // Log the exception
			}
		}
	}
}
