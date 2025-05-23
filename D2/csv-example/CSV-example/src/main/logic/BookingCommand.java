package main.logic;

import main.DesignPatternClasses.Command;

public class BookingCommand implements Command {
	private BookingSystem bookingSystem;
	private User user;
	private ParkingSpot spot;
	private Booking bookingResult;

	public BookingCommand(BookingSystem bookingSystem, User user, ParkingSpot spot) {
		this.bookingSystem = bookingSystem;
		this.user = user;
		this.spot = spot;
	}
  
	@Override
	public void execute() {
		bookingResult = bookingSystem.book(user, spot);
	}
	@Override
	public void undo() {
		System.out.println("Undo not supported for add.");
	}

	public Booking getBookingResult() {
		return bookingResult;
	}
}