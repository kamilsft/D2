package main.logic;

import main.DesignPatternClasses.Command;

public class CancellingBookingCommand implements Command {
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
		
		// adding a null check before using the bookingSystem
		if(bookingSystem == null) {
			System.out.println("Booking system is unavailalbe");
			return;
		}
		
		if(booking != null) {
			bookingSystem.cancel(booking);
		}else {
			System.out.println("You have no booking to cancel.");
		}
	}
}