package test.unit_tests;

import main.logic.CompositeParkingLot;
import main.logic.ParkingComponent;
import main.logic.ParkingSpot;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import static org.junit.Assert.*;

public class CompositeParkingLotTest {

    private CompositeParkingLot compositeLot;
    private ParkingSpot spot1;
    private ParkingSpot spot2;
    private ParkingSpot spot3;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        compositeLot = new CompositeParkingLot("Test Lot");
        spot1 = new ParkingSpot("A1", true, true, "Test Lot");
        spot2 = new ParkingSpot("A2", false, true, "Test Lot");
        spot3 = new ParkingSpot("A3", true, false, "Test Lot");

        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testConstructor() {
        assertEquals("Test Lot", compositeLot.getId());
        assertTrue(compositeLot.getComponents().isEmpty());
    }

    @Test
    public void testAdd() {
        compositeLot.add(spot1);

        assertEquals(1, compositeLot.getComponents().size());
        assertSame(spot1, compositeLot.getComponents().get(0));
    }

    @Test
    public void testRemove() {
        compositeLot.add(spot1);
        compositeLot.add(spot2);

        assertEquals(2, compositeLot.getComponents().size());

        compositeLot.remove(spot1);

        assertEquals(1, compositeLot.getComponents().size());
        assertSame(spot2, compositeLot.getComponents().get(0));
    }

    @Test
    public void testGetComponents() {
        compositeLot.add(spot1);
        compositeLot.add(spot2);

        List<ParkingComponent> components = compositeLot.getComponents();

        assertEquals(2, components.size());
        assertTrue(components.contains(spot1));
        assertTrue(components.contains(spot2));
    }

    @Test
    public void testShowDetails() {
        compositeLot.add(spot1);

        compositeLot.showDetails();

        String output = outContent.toString();
        assertTrue(output.contains("Parking Lot: Test Lot"));
    }

    @Test
    public void testGetId() {
        assertEquals("Test Lot", compositeLot.getId());
    }

    @Test
    public void testIsEnabledWithNoComponents() {
        assertFalse(compositeLot.isEnabled());
    }

    @Test
    public void testIsEnabledWithAllDisabledComponents() {
        // Add only disabled spots
        ParkingSpot disabledSpot1 = new ParkingSpot("D1", false, true, "Test Lot");
        ParkingSpot disabledSpot2 = new ParkingSpot("D2", false, true, "Test Lot");

        compositeLot.add(disabledSpot1);
        compositeLot.add(disabledSpot2);

        assertFalse(compositeLot.isEnabled());
    }

    @Test
    public void testIsEnabledWithSomeEnabledComponents() {
        compositeLot.add(spot1); // enabled
        compositeLot.add(spot2); // disabled

        assertTrue(compositeLot.isEnabled());
    }

    @Test
    public void testIsOccupiedWithNoComponents() {
        assertFalse(compositeLot.isOccupied());
    }

    @Test
    public void testIsOccupiedWithAllOccupiedComponents() {
        // Add only occupied spots
        ParkingSpot occupiedSpot1 = new ParkingSpot("O1", true, true, "Test Lot");
        occupiedSpot1.setOccupied(true);

        ParkingSpot occupiedSpot2 = new ParkingSpot("O2", true, true, "Test Lot");
        occupiedSpot2.setOccupied(true);

        compositeLot.add(occupiedSpot1);
        compositeLot.add(occupiedSpot2);

        assertTrue(compositeLot.isOccupied());
    }

    @Test
    public void testIsOccupiedWithSomeOccupiedComponents() {
        // Create spots with different occupied states
        ParkingSpot occupiedSpot = new ParkingSpot("O1", true, true, "Test Lot");
        occupiedSpot.setOccupied(true);

        ParkingSpot emptySpot = new ParkingSpot("E1", true, true, "Test Lot");
        emptySpot.setOccupied(false);

        compositeLot.add(occupiedSpot);
        compositeLot.add(emptySpot);

        assertFalse(compositeLot.isOccupied());
    }

    @Test
    public void testNestedComposites() {
        // Create a nested structure of composite lots
        CompositeParkingLot subLot = new CompositeParkingLot("Sub Lot");
        subLot.add(spot1);

        compositeLot.add(subLot);
        compositeLot.add(spot2);

        assertEquals(2, compositeLot.getComponents().size());
        assertTrue(compositeLot.getComponents().contains(subLot));
        assertTrue(compositeLot.getComponents().contains(spot2));

        assertEquals(1, subLot.getComponents().size());
        assertTrue(subLot.getComponents().contains(spot1));
    }

    @Test
    public void testIsEnabledWithNestedComposites() {
        // Create a nested structure with various enabled states
        CompositeParkingLot enabledSubLot = new CompositeParkingLot("Enabled Sub Lot");
        enabledSubLot.add(spot1); // enabled

        CompositeParkingLot disabledSubLot = new CompositeParkingLot("Disabled Sub Lot");
        disabledSubLot.add(spot2); // disabled

        compositeLot.add(enabledSubLot);
        compositeLot.add(disabledSubLot);

        assertTrue(compositeLot.isEnabled());
        assertTrue(enabledSubLot.isEnabled());
        assertFalse(disabledSubLot.isEnabled());
    }

    @Test
    public void tearDown() {
        System.setOut(originalOut);
    }
}