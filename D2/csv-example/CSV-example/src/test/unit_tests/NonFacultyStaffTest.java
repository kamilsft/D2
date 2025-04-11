package test.unit_tests;

import main.logic.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NonFacultyStaffTest {
    NonFacultyStaff staff = new NonFacultyStaff("Abram Smith", 202, "abram.smith@yorku.ca", "secure123");

    @Test
    public void testConstructor() {
        assertEquals("Abram Smith", staff.getName());
        assertEquals(202, staff.getId());
        assertEquals("abram.smith@yorku.ca", staff.getEmail());
    }

    @Test
    public void testBookParkingLotCreatesBooking() {
        ParkingSpot spot = new ParkingSpot("B1", false, true);
        Booking booking = staff.bookParkingLot(spot, 3);
        assertNotNull(booking);
        assertEquals(staff, booking.getUser());
    }

    @Test
    public void testBookingTimeOrder() {
        ParkingSpot spot = new ParkingSpot("B2", false, true);
        Booking booking = staff.bookParkingLot(spot, 2);
        assertTrue(booking.getBookingStartTime().isBefore(booking.getBookingEndTime()));
    }

    @Test
    public void testBookingSpotId() {
        ParkingSpot spot = new ParkingSpot("B3", false, true);
        Booking booking = staff.bookParkingLot(spot, 2);
        assertEquals("B3", booking.getSpot().getSpotId());
    }

    @Test
    public void testValidateRegistrationReturnsFalse() {
        assertFalse(staff.validateRegistration());
    }

    @Test
    public void testSetName() {
        staff.setName("Jane Doe");
        assertEquals("Jane Doe", staff.getName());
    }

    @Test
    public void testSetEmail() {
        staff.setEmail("jane.doe@yorku.ca");
        assertEquals("jane.doe@yorku.ca", staff.getEmail());
    }

    @Test
    public void testSetPassword() {
        staff.setPassword("newpass");
        assertEquals("newpass", staff.getPassword());
    }

    @Test
    public void testSetId() {
        staff.setId(303);
        assertEquals(303, staff.getId());
    }

    @Test
    public void testToStringContainsName() {
        assertTrue(staff.toString().contains("User"));
    }
}
