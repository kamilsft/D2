package logic;
import java.time.ZonedDateTime;

public class Student extends User{
	
	
	public Student(String name, int id, String email, String password, int studentID, String studentName) {
		super(name, id, email, password);
	}

	
	
	public Booking bookParkingLot(ParkingSpot spot, int hours) {
		ZonedDateTime startTime = ZonedDateTime.now();
		ZonedDateTime endTime = startTime.plusHours(hours);
		
		return new Booking(startTime, endTime, this.getEmail(), true, spot, this);
	}
	  
	// PAYMENT SERVICE
//	public void parkingPayment(double amount) {
//		PaymentService.processTransaction(this, amount); // have to call paymetns class
//	} 
	
	public boolean validateRegistration() {
		return true; // Faculty are auto approved
	}

	
	
	
}
