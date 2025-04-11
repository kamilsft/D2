package test.unit_tests;


import logic.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ParkingBookingTest {

    private User user;
    private ParkingSpot spot;
    private ParkingBooking booking;
    private static final int TEST_DURATION = 120; // 2 hours

    @Before
    public void setUp() {
        user = new User("testUser", 1, "user@test.com", "password");
        spot = new ParkingSpot("A1", false, true,"A",123);
        booking = new ParkingBooking(user, spot, TEST_DURATION);
    }

    @Test
    public void testParkingBookingConstructor() {
        assertNotNull(booking);
        assertEquals(user, booking.getUser());
        assertEquals(spot, booking.getSpot());
        assertEquals(TEST_DURATION, booking.getDurationMinutes());
        assertTrue(booking.getState() instanceof ValidState);
        assertEquals(123, booking.getSensorId());
        assertTrue(booking.isShowUp());
    }

    @Test
    public void testSetState() {
        BookingState newState = new ExtendedState(LocalDateTime.now());
        booking.setState(newState);
        assertEquals(newState, booking.getState());
    }

    @Test
    public void testExtendBookingWhenNotExpired() {
        assertTrue(booking.getState() instanceof ValidState);
        booking.extendBooking();
        assertTrue(booking.getState() instanceof ExtendedState);
    }

    @Test
    public void testExtendBookingWhenExpired() {
        // Create a booking that is already expired
        ParkingBooking expiredBooking = new ParkingBooking(user, spot, -10); // -10 minutes

        // The booking should be in expired state
        assertTrue(expiredBooking.isExpired());

        // Store the current state
        BookingState initialState = expiredBooking.getState();

        // Try to extend the expired booking
        expiredBooking.extendBooking();

        // State should not change
        assertEquals(initialState, expiredBooking.getState());
    }

    @Test
    public void testIsExpired() {
        // New booking should not be expired
        assertFalse(booking.isExpired());

        // Create an expired booking
        ParkingBooking expiredBooking = new ParkingBooking(user, spot, -10); // -10 minutes
        assertTrue(expiredBooking.isExpired());
    }

    @Test
    public void testGetUser() {
        assertEquals(user, booking.getUser());
    }

    @Test
    public void testGetSpot() {
        assertEquals(spot, booking.getSpot());
    }

    @Test
    public void testGetState() {
        assertTrue(booking.getState() instanceof ValidState);

        booking.extendBooking();
        assertTrue(booking.getState() instanceof ExtendedState);
    }

    @Test
    public void testGetBookingTime() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime bookingTime = booking.getBookingTime();

        // Check that booking time is within 1 second of current time
        long diffSeconds = ChronoUnit.SECONDS.between(now, bookingTime);
        assertTrue(Math.abs(diffSeconds) < 1);
    }

    @Test
    public void testGetAndSetDurationMinutes() {
        assertEquals(TEST_DURATION, booking.getDurationMinutes());

        booking.setDurationMinutes(180);
        assertEquals(180, booking.getDurationMinutes());
    }

    @Test
    public void testGetExpirationTime() {
        // For a valid state booking
        LocalDateTime expectedExpTime = booking.getBookingTime().plusMinutes(TEST_DURATION);

        // Allow for small timing differences (within 1 second)
        long diffSeconds = ChronoUnit.SECONDS.between(expectedExpTime, booking.getExpirationTime());
        assertTrue(Math.abs(diffSeconds) < 1);

        // For an extended state booking
        booking.extendBooking();
        assertTrue(booking.getState() instanceof ExtendedState);

        // Extended state adds 60 minutes
        expectedExpTime = expectedExpTime.plusMinutes(60);

        // Check with allowance for small timing differences
        diffSeconds = ChronoUnit.SECONDS.between(expectedExpTime, booking.getExpirationTime());
        assertTrue(Math.abs(diffSeconds) < 1);
    }

    @Test
    public void testGetExpirationTimeString() {
        // Get the expected expiration time
        LocalDateTime expTime = booking.getExpirationTime();
        String expectedString = expTime.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        assertEquals(expectedString, booking.getExpirationTimeString());
    }

    @Test
    public void testGetStatus() {
        assertEquals("Valid", booking.getStatus());

        booking.extendBooking();
        assertEquals("Extended", booking.getStatus());

        // Create an expired booking
        ParkingBooking expiredBooking = new ParkingBooking(user, spot, -10); // -10 minutes
        assertEquals("Expired", expiredBooking.getStatus());
    }

    @Test
    public void testGetRemainingTimeString() {
        String timeString = booking.getRemainingTimeString();
        assertTrue(timeString.matches("\\d+ hours, \\d+ minutes"));

        // Create an expired booking
        ParkingBooking expiredBooking = new ParkingBooking(user, spot, -10); // -10 minutes
        assertEquals("Expired", expiredBooking.getRemainingTimeString());
    }
}