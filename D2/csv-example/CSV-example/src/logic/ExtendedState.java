package logic;

import java.time.LocalDateTime;
 
public class ExtendedState implements BookingState {
    private LocalDateTime expirationTime;
    private int extensionMinutes;

    public ExtendedState(LocalDateTime originalExpirationTime) {
        // Default extension adds 60 minutes
        this.extensionMinutes = 60;
        this.expirationTime = originalExpirationTime.plusMinutes(extensionMinutes);
    }

    public ExtendedState(LocalDateTime originalExpirationTime, int additionalMinutes) {
        this.extensionMinutes = additionalMinutes;
        this.expirationTime = originalExpirationTime.plusMinutes(additionalMinutes);
    }

    @Override
    public void extendBooking(ParkingBooking booking) {
        if (!isExpired()) {
            // When extending from an already extended state, add more time
            booking.setDurationMinutes(booking.getDurationMinutes() + extensionMinutes);
            booking.setState(new ExtendedState(expirationTime, 60));
        }
    }

    @Override
    public boolean isExpired() {
        return LocalDateTime.now().isAfter(expirationTime);
    }

    @Override
    public String getStateName() {
        return "Extended";
    }

    public LocalDateTime getExpirationTime() {
        return expirationTime;
    }

    public int getExtensionMinutes() {
        return extensionMinutes;
    }
}