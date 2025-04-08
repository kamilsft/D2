package test.manual_tests.unit_tests;

import logic.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookingSystemTest {
    private BookingSystem bookingSystem;
    private User user;
    private ParkingSpot spot;

    @BeforeEach
    public void setup() {
        bookingSystem = new BookingSystem();
        user = new User("TestUser", 1, "test@my.yorku.ca", "pass");
        spot = new ParkingSpot("A1", false, true);
    }

    @Test
    public void testBookCreatesBooking() {
        Booking booking = bookingSystem.book(user, spot);
        assertNotNull(booking);
        assertEquals(user, booking.getUser());
    }

    @Test
    public void testGetCurrentBookingAfterBook() {
        bookingSystem.book(user, spot);
        assertNotNull(bookingSystem.getCurrentBooking());
    }

    @Test
    public void testCancelBookingRemovesCurrent() {
        Booking booking = bookingSystem.book(user, spot);
        bookingSystem.cancel(booking);
        assertNull(bookingSystem.getCurrentBooking());
    }

    @Test
    public void testCancelWithoutBookingDoesNothing() {
        bookingSystem.cancel(null);  // no booking created
        assertNull(bookingSystem.getCurrentBooking());
    }

    @Test
    public void testCancelIgnoresPassedInstanceIfNoneCurrent() {
        Booking dummy = new Booking(user, spot);
        bookingSystem.cancel(dummy);
        assertNull(bookingSystem.getCurrentBooking());
    }

    @Test
    public void testCancelAfterMultipleBookings() {
        Booking first = bookingSystem.book(user, spot);
        Booking second = bookingSystem.book(user, new ParkingSpot("B1", false, true));
        bookingSystem.cancel(second);
        assertNull(bookingSystem.getCurrentBooking());
    }

    @Test
    public void testCancelOnlyAffectsCurrentBooking() {
        Booking b1 = bookingSystem.book(user, spot);
        bookingSystem.cancel(new Booking(user, spot));  // pass different instance
        assertNull(bookingSystem.getCurrentBooking());
    }

    @Test
    public void testCancelTwice() {
        Booking booking = bookingSystem.book(user, spot);
        bookingSystem.cancel(booking);
        bookingSystem.cancel(booking);
        assertNull(bookingSystem.getCurrentBooking());
    }

    @Test
    public void testCancelDoesNotThrow() {
        assertDoesNotThrow(() -> bookingSystem.cancel(null));
    }

    @Test
    public void testBookUpdatesCurrentBooking() {
        Booking first = bookingSystem.book(user, spot);
        Booking second = bookingSystem.book(user, new ParkingSpot("B2", false, true));
        assertEquals("B2", bookingSystem.getCurrentBooking().getSpot().getSpotId());
    }
}