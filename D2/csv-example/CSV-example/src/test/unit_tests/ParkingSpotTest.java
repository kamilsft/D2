package test.unit_tests;

import main.logic.ParkingSpot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingSpotTest {

    @Test
    public void testConstructorWithBasicParameters() {
        ParkingSpot spot = new ParkingSpot("A1", false, true);

        assertEquals("A1", spot.getSpotId());
        assertFalse(spot.isOccupied());
        assertTrue(spot.isEnabled());
        assertEquals("North Lot", spot.getLocation());
    }

    @Test
    public void testConstructorWithLocationParameter() {
        ParkingSpot spot = new ParkingSpot("B2", true, false, "Custom Location");

        assertEquals("B2", spot.getSpotId());
        assertTrue(spot.isOccupied());
        assertFalse(spot.isEnabled());
        assertEquals("Custom Location", spot.getLocation());
    }

    @Test
    public void testConstructorWithSensorParameter() {
        ParkingSpot spot = new ParkingSpot("C3", true, false, "South Section", 123);

        assertEquals("C3", spot.getSpotId());
        assertTrue(spot.isOccupied());
        assertFalse(spot.isEnabled());
        assertEquals("South Section", spot.getLocation());
        assertNotNull(spot.getSensor());
        assertEquals(123, spot.getSensorId());
    }

    @Test
    public void testConstructorWithLotIdParameter() {
        ParkingSpot spot = new ParkingSpot("D4", "Lot2", true, false, 456);

        assertEquals("D4", spot.getSpotId());
        assertEquals("Lot2", spot.getLotId());
        assertTrue(spot.isOccupied());
        assertFalse(spot.isEnabled());
        assertNotNull(spot.getSensor());
        assertEquals(456, spot.getSensorId());
    }

    @Test
    public void testGetAndSetSpotId() {
        ParkingSpot spot = new ParkingSpot("A1", false, true);
        assertEquals("A1", spot.getSpotId());

        spot.setSpotId("A2");
        assertEquals("A2", spot.getSpotId());
    }

    @Test
    public void testGetAndSetOccupied() {
        ParkingSpot spot = new ParkingSpot("A1", false, true);
        assertFalse(spot.isOccupied());

        spot.setOccupied(true);
        assertTrue(spot.isOccupied());
    }

    @Test
    public void testGetAndSetEnabled() {
        ParkingSpot spot = new ParkingSpot("A1", false, true);
        assertTrue(spot.isEnabled());

        spot.setEnabled(false);
        assertFalse(spot.isEnabled());
    }

    @Test
    public void testGetAndSetLocation() {
        ParkingSpot spot = new ParkingSpot("A1", false, true);
        assertEquals("North Lot", spot.getLocation());

        spot.setLocation("New Location");
        assertEquals("New Location", spot.getLocation());
    }

    @Test
    public void testShowDetails() {
        // This test verifies that showDetails runs without exceptions
        // We can't easily test console output directly
        ParkingSpot spot = new ParkingSpot("A1", false, true);
        spot.showDetails(); // Should not throw an exception
    }

    @Test
    public void testLocationAssignmentBasedOnId() {
        // Test default location assignment based on spot ID
        ParkingSpot spotA = new ParkingSpot("A5", false, true);
        assertEquals("North Lot", spotA.getLocation());

        ParkingSpot spotB = new ParkingSpot("B5", false, true);
        assertEquals("Central Lot", spotB.getLocation());

        ParkingSpot spotC = new ParkingSpot("C5", false, true);
        assertEquals("South Lot", spotC.getLocation());

        ParkingSpot spotOther = new ParkingSpot("X5", false, true);
        assertEquals("General Lot", spotOther.getLocation());
    }

    @Test
    public void testGetId() {
        ParkingSpot spot = new ParkingSpot("A1", false, true);
        assertEquals("A1", spot.getId());
    }

    @Test
    public void testToString() {
        ParkingSpot spot = new ParkingSpot("A1", false, true);
        String toString = spot.toString();

        assertTrue(toString.contains("id=A1"));
        assertTrue(toString.contains("location=North Lot"));
        assertTrue(toString.contains("enabled=true"));
        assertTrue(toString.contains("occupied=false"));
    }
}