package logic;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
  
public class ParkingBooking extends Booking{
    private User user;
    private ParkingSpot spot;
    private BookingState state;
    private LocalDateTime bookingTime;
    private int durationMinutes; // Add this field to store the original duration
    
    public ParkingBooking(User user, ParkingSpot spot, int durationMinutes) {
    	super(ZonedDateTime.now(), ZonedDateTime.now().plusMinutes(durationMinutes),
    			"ABC123", true, spot, user);
        this.user = user;
        this.spot = spot;
        this.durationMinutes = durationMinutes;
        this.bookingTime = LocalDateTime.now();
        this.state = new ValidState(durationMinutes);
        this.setSensorId(spot.getSensorId());
        this.setShowUp(true);
    }

    public void setState(BookingState state) {
        this.state = state;
    }

    public void extendBooking() {
        if (!isExpired()) {
            state.extendBooking(this);
        }
    }

    public boolean isExpired() {
        return state.isExpired();
    }

    public User getUser() {
        return user;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public BookingState getState() {
        return state;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
    

    public LocalDateTime getExpirationTime() {
        if (state instanceof ValidState) {
            return ((ValidState) state).getExpirationTime();
        } else if (state instanceof ExtendedState) {
            return ((ExtendedState) state).getExpirationTime();
        }
        return null;
    }

    public String getExpirationTimeString() {
        LocalDateTime expTime = getExpirationTime();
        if (expTime != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return expTime.format(formatter);
        }
        return "Unknown";
    }

    public String getStatus() {
        if (isExpired()) {
            return "Expired";
        }
        return state.getStateName();
    }

    public String getRemainingTimeString() {
        if (isExpired()) {
            return "Expired";
        }

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime expTime = getExpirationTime();

        if (expTime == null) {
            return "Unknown";
        }

        long minutesDiff = java.time.Duration.between(now, expTime).toMinutes();
        long hours = minutesDiff / 60;
        long minutes = minutesDiff % 60;

        return String.format("%d hours, %d minutes", hours, minutes);
    }

}