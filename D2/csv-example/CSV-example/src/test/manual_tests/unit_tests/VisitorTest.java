package test.manual_tests.unit_tests;

import logic.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VisitorTest {
    Visitor visitor = new Visitor("Guest", 4001, "guest@my.yorku.ca", "vis123");

    @Test
    public void testConstructor() {
        assertEquals("Guest", visitor.getName());
        assertEquals(4001, visitor.getId());
        assertEquals("guest@my.yorku.ca", visitor.getEmail());
    }

    @Test
    public void testBookingReturnsCorrectUser() {
        ParkingSpot spot = new ParkingSpot("B1", false, true);
        Booking booking = visitor.bookParkingLot(spot, 1);
        assertEquals(visitor, booking.getUser());
    }

    @Test
    public void testBookingStartBeforeEnd() {
        Booking booking = visitor.bookParkingLot(new ParkingSpot("B2", false, true), 2);
        assertTrue(booking.getBookingStartTime().isBefore(booking.getBookingEndTime()));
    }

    @Test
    public void testBookingSpotMatch() {
        ParkingSpot spot = new ParkingSpot("B3", false, true);
        Booking booking = visitor.bookParkingLot(spot, 1);
        assertEquals("B3", booking.getSpot().getSpotId());
    }

    @Test
    public void testValidateRegistrationFalse() {
        assertFalse(visitor.validateRegistration());
    }

    @Test
    public void testSetName() {
        visitor.setName("NewGuest");
        assertEquals("NewGuest", visitor.getName());
    }

    @Test
    public void testSetId() {
        visitor.setId(4002);
        assertEquals(4002, visitor.getId());
    }

    @Test
    public void testSetEmail() {
        visitor.setEmail("new@my.yorku.ca");
        assertEquals("new@my.yorku.ca", visitor.getEmail());
    }

    @Test
    public void testSetPassword() {
        visitor.setPassword("newpass");
        assertEquals("newpass", visitor.getPassword());
    }

    @Test
    public void testToStringNotNull() {
        assertNotNull(visitor.toString());
    }
}
