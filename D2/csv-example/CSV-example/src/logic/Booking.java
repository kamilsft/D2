package logic;
import java.time.ZonedDateTime;

public class Booking {
	public int bookingId;
	public ZonedDateTime bookingStartTime;
	public ZonedDateTime bookingEndTime;
	private String carLicensePlate;
	public boolean isValid;
	public ParkingSpot spot;
	public User user;
	
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
	
	
	
	
	
}
