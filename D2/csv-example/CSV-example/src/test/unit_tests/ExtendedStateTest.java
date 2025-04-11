package test.unit_tests;



import main.logic.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ExtendedStateTest {

    private ExtendedState extendedState;
    private LocalDateTime originalExpTime;
    private ParkingBooking booking;
    private User user;
    private ParkingSpot spot;
    private static final int TEST_DURATION = 120; // 2 hours
    private static final int DEFAULT_EXTENSION = 60; // Default extension minutes

    @Before
    public void setUp() {
        originalExpTime = LocalDateTime.now().plusMinutes(TEST_DURATION);
        extendedState = new ExtendedState(originalExpTime);

        user = new User("testUser", 1, "user@test.com", "password");
        spot = new ParkingSpot("A1", false, true,"A",123);
        booking = new ParkingBooking(user, spot, TEST_DURATION);
        booking.setState(extendedState);
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(extendedState);

        // Check that extension minutes is set to default
        assertEquals(DEFAULT_EXTENSION, extendedState.getExtensionMinutes());

        // Check that expiration time is correctly calculated
        LocalDateTime expectedExpTime = originalExpTime.plusMinutes(DEFAULT_EXTENSION);
        assertEquals(expectedExpTime, extendedState.getExpirationTime());
    }

    @Test
    public void testConstructorWithCustomExtension() {
        int customExtension = 90;
        ExtendedState customExtendedState = new ExtendedState(originalExpTime, customExtension);

        // Check that extension minutes is set correctly
        assertEquals(customExtension, customExtendedState.getExtensionMinutes());

        // Check that expiration time is correctly calculated
        LocalDateTime expectedExpTime = originalExpTime.plusMinutes(customExtension);
        assertEquals(expectedExpTime, customExtendedState.getExpirationTime());
    }

    @Test
    public void testExtendBookingNotExpired() {
        // Store the original expiration time and duration
        LocalDateTime originalExtendedExpTime = extendedState.getExpirationTime();
        int originalDuration = booking.getDurationMinutes();

        // Extend the booking again
        extendedState.extendBooking(booking);

        // Booking should still have ExtendedState but with updated time
        assertTrue(booking.getState() instanceof ExtendedState);

        // Duration should be increased
        assertEquals(originalDuration + DEFAULT_EXTENSION, booking.getDurationMinutes());

        // New expiration time should be 60 minutes after the previous one
        LocalDateTime newExpTime = booking.getExpirationTime();
        long diffMinutes = ChronoUnit.MINUTES.between(originalExtendedExpTime, newExpTime);
        assertEquals(60, diffMinutes);
    }

    @Test
    public void testExtendBookingAlreadyExpired() {
        // Create an expired ExtendedState
        ExtendedState expiredState = new ExtendedState(LocalDateTime.now().minusMinutes(10));
        booking.setState(expiredState);

        // Ensure booking is in expired state
        assertTrue(booking.isExpired());

        // Store original state and duration
        BookingState originalState = booking.getState();
        int originalDuration = booking.getDurationMinutes();

        // Try to extend
        expiredState.extendBooking(booking);

        // State should remain the same type (still ExtendedState)
        assertTrue(booking.getState() instanceof ExtendedState);

        // But it should be the same instance (not changed)
        assertEquals(originalState, booking.getState());

        // Duration should not change
        assertEquals(originalDuration, booking.getDurationMinutes());
    }

    @Test
    public void testIsExpiredWhenNotExpired() {
        // New ExtendedState with future expiration should not be expired
        assertFalse(extendedState.isExpired());
    }

    @Test
    public void testIsExpiredWhenExpired() {
        // Create an expired ExtendedState
        ExtendedState expiredState = new ExtendedState(LocalDateTime.now().minusMinutes(10));
        assertTrue(expiredState.isExpired());
    }

    @Test
    public void testGetStateName() {
        assertEquals("Extended", extendedState.getStateName());
    }

    @Test
    public void testGetExpirationTime() {
        LocalDateTime expectedExpTime = originalExpTime.plusMinutes(DEFAULT_EXTENSION);
        assertEquals(expectedExpTime, extendedState.getExpirationTime());
    }

    @Test
    public void testGetExtensionMinutes() {
        assertEquals(DEFAULT_EXTENSION, extendedState.getExtensionMinutes());
    }

    @Test
    public void testMultipleExtensions() {
        // Original booking duration
        int originalDuration = booking.getDurationMinutes();

        // First extension already done in setUp()
        LocalDateTime firstExtendedExpTime = booking.getExpirationTime();

        // Second extension
        extendedState.extendBooking(booking);

        // Duration should be increased
        assertEquals(originalDuration + DEFAULT_EXTENSION, booking.getDurationMinutes());

        // Check that expiration time increased again
        LocalDateTime secondExtendedExpTime = booking.getExpirationTime();
        long diffMinutes = ChronoUnit.MINUTES.between(firstExtendedExpTime, secondExtendedExpTime);
        assertEquals(60, diffMinutes);

        // Third extension
        ExtendedState secondExtendedState = (ExtendedState) booking.getState();
        secondExtendedState.extendBooking(booking);

        // Duration should be increased again
        assertEquals(originalDuration + (DEFAULT_EXTENSION * 2), booking.getDurationMinutes());

        // Check that expiration time increased again
        LocalDateTime thirdExtendedExpTime = booking.getExpirationTime();
        diffMinutes = ChronoUnit.MINUTES.between(secondExtendedExpTime, thirdExtendedExpTime);
        assertEquals(60, diffMinutes);
    }
}