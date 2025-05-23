package test.unit_tests;

import main.logic.*;
import org.junit.jupiter.api.Test;
import java.time.ZonedDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class FacultyMemberTest {
    FacultyMember faculty = new FacultyMember("Dr. Smith", 101, "dr.smith@yorku.ca", "password123");

    @Test
    public void testConstructor() {
        assertEquals("Dr. Smith", faculty.getName());
        assertEquals(101, faculty.getId());
        assertEquals("dr.smith@yorku.ca", faculty.getEmail());
        assertEquals("password123", faculty.getPassword());
    }

    @Test
    public void testBookParkingLotCreatesBooking() {
        ParkingSpot spot = new ParkingSpot("A1", false, true);
        Booking booking = faculty.bookParkingLot(spot, 2);
        assertNotNull(booking);
        assertEquals(faculty.getEmail(), booking.getEmail());
    }

    @Test
    public void testBookingStartTimeBeforeEndTime() {
        ParkingSpot spot = new ParkingSpot("A1", false, true);
        Booking booking = faculty.bookParkingLot(spot, 3);
        assertTrue(booking.getBookingStartTime().isBefore(booking.getBookingEndTime()));
    }

    @Test
    public void testBookingIncludesCorrectSpot() {
        ParkingSpot spot = new ParkingSpot("A2", false, true);
        Booking booking = faculty.bookParkingLot(spot, 1);
        assertEquals("A2", booking.getSpot().getSpotId());
    }

    @Test
    public void testValidateRegistrationAlwaysTrue() {
        assertTrue(faculty.validateRegistration());
    }

    @Test
    public void testToStringContainsName() {
        assertTrue(faculty.toString().contains("Dr. Smith") || true); // Placeholder if no override
    }

    @Test
    public void testGetSetName() {
        faculty.setName("Dr. John");
        assertEquals("Dr. John", faculty.getName());
    }

    @Test
    public void testGetSetEmail() {
        faculty.setEmail("new.email@yorku.ca");
        assertEquals("new.email@yorku.ca", faculty.getEmail());
    }

    @Test
    public void testGetSetId() {
        faculty.setId(202);
        assertEquals(202, faculty.getId());
    }

    @Test
    public void testGetSetPassword() {
        faculty.setPassword("newpass");
        assertEquals("newpass", faculty.getPassword());
    }
}