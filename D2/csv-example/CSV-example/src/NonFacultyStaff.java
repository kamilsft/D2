import java.time.ZonedDateTime;

public class NonFacultyStaff extends User {
	private int NonFacultyStaffID;
	private String NonFacultyStaffName;
	
	public NonFacultyStaff(String name, int id, String email, String password, int NonFacultyStaffID, String NonFacultyStaffName) {
		super(name, id, email, password);
		this.NonFacultyStaffID = NonFacultyStaffID;
		this.NonFacultyStaffName = NonFacultyStaffName;
	}

	public int getNonFacultyStaffID() {
		return NonFacultyStaffID;
	}

	public void setNonFacultyStaffID(int nonFacultyStaffID) {
		NonFacultyStaffID = nonFacultyStaffID;
	}

	public String getNonFacultyStaffName() {
		return NonFacultyStaffName;
	}

	public void setNonFacultyStaffName(String nonFacultyStaffName) {
		NonFacultyStaffName = nonFacultyStaffName;
	}
	
	public Booking bookParkingLot(ParkingSpot spot, int hours) {
		ZonedDateTime startTime = ZonedDateTime.now();
		ZonedDateTime endTime = startTime.plusHours(hours);
		
		return new Booking(startTime, endTime, this.getEmail(), true, spot, this);
	}
	
	
	// PAYMENT SERVICE
//	public void ParkingPayment(double amount) {
//		return PaymentService.processTransaction(this, amount);
//	}
	
	public boolean validateRegistration() {
		return false; // NonFaculty are not auto approved
	}

	@Override
	public String toString() {
		return "NonFacultyStaff [NonFacultyStaffID=" + NonFacultyStaffID + ", NonFacultyStaffName="
				+ NonFacultyStaffName + "]";
	}
}
