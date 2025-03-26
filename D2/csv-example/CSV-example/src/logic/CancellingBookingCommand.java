package logic;

public class CancellingBookingCommand implements Command{
	private BookingSystem bookingSystem;
	private Booking booking;
  

	public CancellingBookingCommand(BookingSystem bookingSystem, Booking booking) {
		this.bookingSystem = bookingSystem;
		this.booking = booking;
	}
	@Override
	public void undo() {
		System.out.println("Undo not supported for add.");
	}

	@Override
	public void execute() {
		if(booking != null) {
			bookingSystem.cancel(booking);
		}else {
			System.out.println("You have no booking to cancel.");
		}
	}
}