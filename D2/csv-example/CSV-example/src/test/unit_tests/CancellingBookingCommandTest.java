package test.unit_tests;

import logic.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CancellingBookingCommandTest {
    private BookingSystem bookingSystem;
    private User user;
    private ParkingSpot spot;
    private Booking booking;
    private CancellingBookingCommand command;

    @BeforeEach
    public void setup() {
        bookingSystem = new BookingSystem();
        user = new User("TestUser", 100, "test@my.yorku.ca", "pass");
        spot = new ParkingSpot("A1", false, true);
        booking = bookingSystem.book(user, spot);
        command = new CancellingBookingCommand(bookingSystem, booking);
    }

    @Test
    public void testExecuteCancelsBooking() {
        command.execute();
        assertNull(bookingSystem.getCurrentBooking());
    }

    @Test
    public void testExecuteWithNullBooking() {
        CancellingBookingCommand nullCommand = new CancellingBookingCommand(bookingSystem, null);
        nullCommand.execute();
        assertNotNull(bookingSystem.getCurrentBooking());
    }

    @Test
    public void testExecuteTwiceCancelsOnlyOnce() {
        command.execute();
        command.execute();
        assertNull(bookingSystem.getCurrentBooking());
    }

    @Test
    public void testUndoDoesNotAffectBooking() {
        command.undo();
        assertNotNull(bookingSystem.getCurrentBooking());
    }

    @Test
    public void testConstructorStoresArguments() {
        assertNotNull(command);
    }

    @Test
    public void testBookingStillValidBeforeCancel() {
        assertNotNull(bookingSystem.getCurrentBooking());
    }

    @Test
    public void testCancelWithoutBookingInSystem() {
        bookingSystem.cancel(booking); // manually cancel
        command.execute();
        assertNull(bookingSystem.getCurrentBooking());
    }

    @Test
    public void testSystemBookingIsCorrectBeforeCancel() {
        assertEquals(booking, bookingSystem.getCurrentBooking());
    }

    @Test
    public void testNullSystemDoesNotCrash() {
        CancellingBookingCommand safeCommand = new CancellingBookingCommand(null, booking);
        try {
            safeCommand.execute();
        } catch (Exception e) {
            fail("Executing with null system should not throw, but got: " + e.getMessage());
        }
    }

    @Test
    public void testCancelAfterRebook() {
        command.execute();
        Booking newBooking = bookingSystem.book(user, new ParkingSpot("A2", false, true));
        CancellingBookingCommand newCommand = new CancellingBookingCommand(bookingSystem, newBooking);
        newCommand.execute();
        assertNull(bookingSystem.getCurrentBooking());
    }
}
