package main.logic;

 
// Receiver class
public class BookingSystem {
	private Booking currentBooking;

	public Booking book(User user, ParkingSpot spot) {
		currentBooking = new Booking(user, spot);
		System.out.println("Booking spot: " + spot.getSpotId());
		//return new Booking(user, spot);
		return currentBooking;
	}
	public void cancel(Booking booking) {
		//System.out.println("Cancelling booking for spot: " + booking.getSpot().getSpotId());
		if(currentBooking != null) {
			System.out.println("Booking is canceled for: " + currentBooking.getSpot().getSpotId());
			currentBooking = null;
		}else {
			System.out.println("You have no active bookings to cancel");
		}
	}

	public Booking getCurrentBooking() {
		return currentBooking;
	}
}