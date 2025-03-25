package logic;
import java.time.ZonedDateTime;
import DesignPatternClasses.Observer;

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

	// Method to get the user ID associated with the booking
	public int getUserId() {
		return this.user.getId();
	}

	// Override the update method from Observer interface
    @Override
    public void update() {
		ParkingSpot spot = this.getSpot();
		Sensor sensor = spot.getSensor();

		//if statement to check if the sensor is on
		if(sensor.isSensorOn()) {
			sensor.setCarArrived(true);
		}
    }
}
