package test.unit_tests;

import main.logic.ParkingLot;
import main.logic.ParkingSpot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {

    private ParkingLot parkingLot;

    @BeforeEach
    public void setUp() {
        // Create a new ParkingLot before each test
        parkingLot = new ParkingLot("Lot1");
    }

    @Test
    public void testParkingLotCreation() {
        // Test that the parking lot is created with the correct ID
        assertEquals("Lot1", parkingLot.getId());

        // Test that the correct number of spots are created (A1-A9 and B1-B9 = 18 spots)
        assertEquals(18, parkingLot.getSpots().size());
    }

    @Test
    public void testGetId() {
        // Test the getId method
        assertEquals("Lot1", parkingLot.getId());
    }

    @Test
    public void testSetId() {
        // Test the setId method
        parkingLot.setId("NewLot");
        assertEquals("NewLot", parkingLot.getId());
    }

    @Test
    public void testGetSpots() {
        // Test that getSpots returns a non-null map
        Map<String, ParkingSpot> spots = parkingLot.getSpots();
        assertNotNull(spots);

        // Test that the map contains the expected spots
        assertTrue(spots.containsKey("A1"));
        assertTrue(spots.containsKey("B9"));
    }

    @Test
    public void testInitialSpotState() {
        // Test that all spots are initialized as enabled and not occupied
        for (ParkingSpot spot : parkingLot.getSpots().values()) {
            assertTrue(spot.isEnabled(), "Spot " + spot.getSpotId() + " should be enabled by default");
            assertFalse(spot.isOccupied(), "Spot " + spot.getSpotId() + " should not be occupied by default");
        }
    }

    @Test
    public void testEnableSpot() {
        // First disable a spot
        parkingLot.disableSpot("A1");
        assertFalse(parkingLot.getSpots().get("A1").isEnabled());

        // Now test enabling it
        parkingLot.enableSpot("A1");
        assertTrue(parkingLot.getSpots().get("A1").isEnabled());
    }

    @Test
    public void testDisableSpot() {
        // Test disabling a spot
        parkingLot.disableSpot("B5");
        assertFalse(parkingLot.getSpots().get("B5").isEnabled());
    }

    @Test
    public void testEnableNonExistentSpot() {
        // Test enabling a spot that doesn't exist
        parkingLot.enableSpot("Z9");
        // This shouldn't throw an exception, and the state shouldn't change
        assertEquals(18, parkingLot.getSpots().size());
    }

    @Test
    public void testDisableNonExistentSpot() {
        // Test disabling a spot that doesn't exist
        parkingLot.disableSpot("Z9");
        // This shouldn't throw an exception, and the state shouldn't change
        assertEquals(18, parkingLot.getSpots().size());
    }

    @Test
    public void testToString() {
        // Test the toString method
        String toString = parkingLot.toString();
        assertTrue(toString.contains("id=Lot1"));
        assertTrue(toString.contains("spots="));
    }
}