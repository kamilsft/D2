package main.logic;
 
import java.time.LocalDateTime;

public class ValidState implements BookingState {
    private LocalDateTime expirationTime;

    public ValidState(int durationMinutes) {
        this.expirationTime = LocalDateTime.now().plusMinutes(durationMinutes);
    }

    @Override
    public void extendBooking(ParkingBooking booking) {
        if (!isExpired()) {
            booking.setState(new ExtendedState(expirationTime));
        }
    }

    @Override
    public boolean isExpired() {
        return LocalDateTime.now().isAfter(expirationTime);
    } 
 
    @Override
    public String getStateName() {
        return "Valid";
    }

    public LocalDateTime getExpirationTime() {
        return expirationTime;
    }
}
