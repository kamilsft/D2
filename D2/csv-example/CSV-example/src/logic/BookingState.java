package logic;

public interface BookingState {
    void extendBooking(ParkingBooking booking);
    boolean isExpired();
    String getStateName();
}
 