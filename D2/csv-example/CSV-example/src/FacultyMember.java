import java.time.ZonedDateTime;

public class FacultyMember extends User {
	private int facultyID;
	private String facultyName;
	public String carLicensePlate;
	
	public FacultyMember(String facultyMemberName, int facultyMemberID, String email, String password, int facultyID, String facultyName) {
		super(facultyName, facultyID, email, password);
		this.facultyID = facultyID;
		this.facultyName = facultyName;
	}

	public int getFacultyID() {
		return facultyID;
	}

	public void setFacultyID(int facultyID) {
		this.facultyID = facultyID;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	
	public Booking bookParkingLot(ParkingSpot spot, int hours) {
		ZonedDateTime startTime = ZonedDateTime.now();
		ZonedDateTime endTime = startTime.plusHours(hours);
		
		return new Booking(startTime, endTime, this.getEmail(), true, spot, this);
	}

	private String getCarLicensePlate() {
		return carLicensePlate;
	}
	
	public void setCarLicensePlate(String plate) {
		this.carLicensePlate = plate;
	}

	// PAYMENT SERVICE
//	public void ParkingPayment(double amount) {
//		PaymentService.processTransaction(this, amount);
//	}
	
	public boolean validateRegistration() {
		return true; // since faculty members are auto validated
	}

	@Override
	public String toString() {
		return "FacultyMember [facultyID=" + facultyID + ", facultyName=" + facultyName + "]";
	}
	
	
	
	
}
