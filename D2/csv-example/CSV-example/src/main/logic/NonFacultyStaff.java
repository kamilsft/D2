package logic;
import java.time.ZonedDateTime;

public class NonFacultyStaff extends User {
	  
	
	public NonFacultyStaff(String name, int id, String email, String password) {
		super(name, id, email, password);
		
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

}
