package test.manual_tests.unit_tests;

import logic.CompositeParkingLot;
import logic.ParkingManager;
import logic.ParkingSpot;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParkingManagerTest {

    private ParkingManager parkingManager;

    @Before
    public void setUp() {
        parkingManager = new ParkingManager();
    }

    @Test
    public void testInitialization() {
        // Check initial state
        assertNotNull(parkingManager.getSpots());
        assertNotNull(parkingManager.getParkingLots());

        // Should have 27 spots (A1-A9, B1-B9, C1-C9)
        assertEquals(27, parkingManager.getSpots().size());

        // Should have 3 parking lots (North, Central, South)
        assertEquals(3, parkingManager.getParkingLots().size());
    }

    @Test
    public void testSpotExists() {
        // Test existing spots
        assertTrue(parkingManager.spotExists("A1"));
        assertTrue(parkingManager.spotExists("B5"));
        assertTrue(parkingManager.spotExists("C9"));

        // Test non-existing spots
        assertFalse(parkingManager.spotExists("D1"));
        assertFalse(parkingManager.spotExists("A10"));
    }

    @Test
    public void testAddSpot() {
        // Add a new spot
        assertTrue(parkingManager.addSpot("D1"));
        assertTrue(parkingManager.spotExists("D1"));

        // Add an existing spot (should fail)
        assertFalse(parkingManager.addSpot("A1"));

        // Check if the spot was added to the General Lot
        boolean foundInGeneralLot = false;
        for (CompositeParkingLot lot : parkingManager.getParkingLots()) {
            if (lot.getId().equals("General Lot")) {
                foundInGeneralLot = true;
                break;
            }
        }
        assertTrue(foundInGeneralLot);
    }

    @Test
    public void testAddSpotToExistingLot() {
        // Add a new spot to North Lot
        assertTrue(parkingManager.addSpot("A10"));
        assertTrue(parkingManager.spotExists("A10"));

        // Check if added to correct lot
        CompositeParkingLot northLot = null;
        for (CompositeParkingLot lot : parkingManager.getParkingLots()) {
            if (lot.getId().equals("North Lot")) {
                northLot = lot;
                break;
            }
        }

        assertNotNull(northLot);
        boolean spotFound = northLot.getComponents().stream()
                .anyMatch(component -> component instanceof ParkingSpot &&
                        ((ParkingSpot)component).getId().equals("A10"));
        assertTrue(spotFound);
    }

    @Test
    public void testEnableSpot() {
        // Disable a spot first to test enabling it
        ParkingSpot spot = parkingManager.getSpots().get("A1");
        spot.setEnabled(false);
        assertFalse(spot.isEnabled());

        // Test enabling
        assertTrue(parkingManager.enableSpot("A1"));
        assertTrue(spot.isEnabled());

        // Test enabling non-existent spot
        assertFalse(parkingManager.enableSpot("Z9"));
    }

    @Test
    public void testDisableSpot() {
        // Test disabling
        assertTrue(parkingManager.disableSpot("B2"));
        assertFalse(parkingManager.getSpots().get("B2").isEnabled());

        // Test disabling non-existent spot
        assertFalse(parkingManager.disableSpot("Z9"));
    }

    @Test
    public void testGetSpotsCount() {
        assertEquals(27, parkingManager.getSpotsCount());

        // Add a new spot and check count
        parkingManager.addSpot("D1");
        assertEquals(28, parkingManager.getSpotsCount());
    }

    @Test
    public void testMaximumSpotLimit() {
        // Initially has 27 spots, add 73 more to reach the 100 limit
        for (int i = 1; i <= 73; i++) {
            assertTrue(parkingManager.addSpot("D" + i));
        }

        // Should now have 100 spots
        assertEquals(100, parkingManager.getSpotsCount());

        // Trying to add one more should fail
        assertFalse(parkingManager.addSpot("E1"));
    }

    @Test
    public void testParkingLotOrganization() {
        // Check that spots are in the correct lots
        CompositeParkingLot northLot = null;
        CompositeParkingLot centralLot = null;
        CompositeParkingLot southLot = null;

        for (CompositeParkingLot lot : parkingManager.getParkingLots()) {
            if (lot.getId().equals("North Lot")) {
                northLot = lot;
            } else if (lot.getId().equals("Central Lot")) {
                centralLot = lot;
            } else if (lot.getId().equals("South Lot")) {
                southLot = lot;
            }
        }

        assertNotNull(northLot);
        assertNotNull(centralLot);
        assertNotNull(southLot);

        assertEquals(9, northLot.getComponents().size());
        assertEquals(9, centralLot.getComponents().size());
        assertEquals(9, southLot.getComponents().size());
    }

    @Test
    public void testAddNewSectionCreatesGeneralLot() {
        // Add a spot from a new section
        parkingManager.addSpot("Z1");

        // Check if General Lot was created
        boolean foundGeneralLot = false;
        CompositeParkingLot generalLot = null;

        for (CompositeParkingLot lot : parkingManager.getParkingLots()) {
            if (lot.getId().equals("General Lot")) {
                foundGeneralLot = true;
                generalLot = lot;
                break;
            }
        }

        assertTrue(foundGeneralLot);
        assertNotNull(generalLot);
        boolean spotFound = generalLot.getComponents().stream()
                .anyMatch(component -> component instanceof ParkingSpot &&
                        ((ParkingSpot)component).getId().equals("Z1"));
        assertTrue(spotFound);
    }
}