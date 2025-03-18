package logic;
import java.time.ZonedDateTime;

public class Student extends User{
	private int studentID; 
	private String studentName;
	
	public Student(String name, int id, String email, String password, int studentID, String studentName) {
		super(name, id, email, password);
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + "]";
	}
	
	
}
