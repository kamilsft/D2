package main.logic;
import java.time.ZonedDateTime;

public class FacultyMember extends User {
	
	
	public FacultyMember(String facultyMemberName, int facultyMemberID, String email, String password) {
		super(facultyMemberName, facultyMemberID, email, password);
		
	}

	 
	public Booking bookParkingLot(ParkingSpot spot, int hours) {
		ZonedDateTime startTime = ZonedDateTime.now();
		ZonedDateTime endTime = startTime.plusHours(hours);
		
		return new Booking(startTime, endTime, this.getEmail(), true, spot, this);
	}

	 

	// PAYMENT SERVICE
//	public void ParkingPayment(double amount) {
//		PaymentService.processTransaction(this, amount);
//	}
	
	public boolean validateRegistration() {
		return true; // since faculty members are auto validated
	}

	
	
	
	
	
}
