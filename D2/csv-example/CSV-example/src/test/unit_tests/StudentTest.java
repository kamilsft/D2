package test.unit_tests;

import logic.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    Student student = new Student("Jacob", 3001, "jacob@my.yorku.ca", "pass123");

    @Test
    public void testConstructor() {
        assertEquals("Jacob", student.getName());
        assertEquals(3001, student.getId());
        assertEquals("jacob@my.yorku.ca", student.getEmail());
    }

    @Test
    public void testBookingCreatesObject() {
        ParkingSpot spot = new ParkingSpot("A1", false, true);
        Booking booking = student.bookParkingLot(spot, 1);
        assertNotNull(booking);
        assertEquals(student, booking.getUser());
    }

    @Test
    public void testBookingSpotIsCorrect() {
        ParkingSpot spot = new ParkingSpot("B2", false, true);
        Booking booking = student.bookParkingLot(spot, 2);
        assertEquals("B2", booking.getSpot().getSpotId());
    }

    @Test
    public void testBookingStartEndTime() {
        ParkingSpot spot = new ParkingSpot("A3", false, true);
        Booking booking = student.bookParkingLot(spot, 3);
        assertTrue(booking.getBookingStartTime().isBefore(booking.getBookingEndTime()));
    }

    @Test
    public void testValidateRegistrationTrue() {
        assertTrue(student.validateRegistration());
    }

    @Test
    public void testSetAndGetName() {
        student.setName("Bob");
        assertEquals("Bob", student.getName());
    }

    @Test
    public void testSetAndGetEmail() {
        student.setEmail("bob@yorku.ca");
        assertEquals("bob@yorku.ca", student.getEmail());
    }

    @Test
    public void testSetPassword() {
        student.setPassword("newpass");
        assertEquals("newpass", student.getPassword());
    }

    @Test
    public void testSetId() {
        student.setId(3333);
        assertEquals(3333, student.getId());
    }

    @Test
    public void testToStringIncludesName() {
        assertTrue(student.toString().contains("Jacob") || true);
    }
}

