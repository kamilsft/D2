package test.manual_tests.unit_tests;



import logic.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ValidStateTest {

    private ValidState validState;
    private ParkingBooking booking;
    private User user;
    private ParkingSpot spot;
    private static final int TEST_DURATION = 120; // 2 hours

    @Before
    public void setUp() {
        validState = new ValidState(TEST_DURATION);
        user = new User("testUser", 1, "user@test.com", "password");
        spot = new ParkingSpot("A1", false, true,"A",123);
        booking = new ParkingBooking(user, spot, TEST_DURATION);
        // Reset the state to a new ValidState to control test environment
        booking.setState(new ValidState(TEST_DURATION));
    }

    @Test
    public void testConstructor() {
        assertNotNull(validState);

        // Check that expiration time is set correctly
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime expTime = validState.getExpirationTime();

        long diffMinutes = ChronoUnit.MINUTES.between(now, expTime);
        assertTrue(Math.abs(diffMinutes - TEST_DURATION) <= 1); // Allow for 1 minute difference due to test execution time
    }

    @Test
    public void testExtendBookingNotExpired() {
        // Ensure booking state is ValidState
        assertTrue(booking.getState() instanceof ValidState);

        // Get the current expiration time before extending
        LocalDateTime originalExpTime = booking.getExpirationTime();

        // Extend the booking
        validState.extendBooking(booking);

        // Check that state is now ExtendedState
        assertTrue(booking.getState() instanceof ExtendedState);

        // Check that new expiration time is original time + 60 minutes (default extension)
        LocalDateTime newExpTime = booking.getExpirationTime();
        long diffMinutes = ChronoUnit.MINUTES.between(originalExpTime, newExpTime);
        assertEquals(60, diffMinutes);
    }

    @Test
    public void testExtendBookingAlreadyExpired() {
        // Create an expired validState
        ValidState expiredState = new ValidState(-10); // -10 minutes, already expired
        booking.setState(expiredState);

        // Ensure booking is in expired state
        assertTrue(booking.isExpired());

        // Store original state
        BookingState originalState = booking.getState();

        // Try to extend
        expiredState.extendBooking(booking);

        // State should remain unchanged since it's expired
        assertEquals(originalState, booking.getState());
    }

    @Test
    public void testIsExpiredWhenNotExpired() {
        // New ValidState with future expiration should not be expired
        assertFalse(validState.isExpired());
    }

    @Test
    public void testIsExpiredWhenExpired() {
        // Create an expired ValidState
        ValidState expiredState = new ValidState(-10); // -10 minutes
        assertTrue(expiredState.isExpired());
    }

    @Test
    public void testGetStateName() {
        assertEquals("Valid", validState.getStateName());
    }

    @Test
    public void testGetExpirationTime() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime expTime = validState.getExpirationTime();

        long diffMinutes = ChronoUnit.MINUTES.between(now, expTime);
        assertTrue(Math.abs(diffMinutes - TEST_DURATION) <= 1); // Allow for 1 minute difference due to test execution time
    }

    @Test
    public void testBoundaryConditionJustExpired() {
        // Create a ValidState that is about to expire (1 second ago)
        ValidState justExpiredState = new ValidState(0);

        // Should be expired
        assertTrue(justExpiredState.isExpired());
    }

    @Test
    public void testBoundaryConditionJustNotExpired() {
        // Create a ValidState that is about to expire but not yet (1 minute from now)
        ValidState aboutToExpireState = new ValidState(1);

        // Should not be expired yet
        assertFalse(aboutToExpireState.isExpired());
    }

    @Test
    public void testExtendBookingStateTransition() {
        // Get original expiration time
        LocalDateTime originalExpTime = validState.getExpirationTime();

        // Extend booking
        validState.extendBooking(booking);

        // Verify state change
        assertTrue(booking.getState() instanceof ExtendedState);

        // Verify the new expiration time matches
        ExtendedState extendedState = (ExtendedState) booking.getState();
        long diffMinutes = ChronoUnit.MINUTES.between(originalExpTime, extendedState.getExpirationTime());
        assertEquals(60, diffMinutes); // Default extension is 60 minutes
    }
}