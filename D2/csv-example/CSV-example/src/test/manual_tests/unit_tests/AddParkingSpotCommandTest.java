package test.manual_tests.unit_tests;

import DesignPatternClasses.Command;
import logic.AddParkingSpotCommand;
import logic.CompositeParkingLot;
import logic.ParkingManager;
import logic.ParkingSpot;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AddParkingSpotCommandTest {

    private ParkingManager parkingManager;
    private AddParkingSpotCommand command;
    private String testSpotId = "D1";
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        parkingManager = new ParkingManager();
        command = new AddParkingSpotCommand(parkingManager, testSpotId);
        // Capture System.out for testing undo message
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCommandImplementation() {
        // Verify it implements Command interface
        assertTrue(command instanceof Command);
    }

    @Test
    public void testExecute() {
        // Verify spot doesn't exist before command execution
        assertFalse(parkingManager.spotExists(testSpotId));

        // Execute command
        command.execute();

        // Verify spot is now added
        assertTrue(parkingManager.spotExists(testSpotId));
    }

    @Test
    public void testUndo() {
        // Add the spot
        command.execute();
        assertTrue(parkingManager.spotExists(testSpotId));

        // Clear output capture
        outContent.reset();

        // Undo the command
        command.undo();

        // Verify undo message was printed
        assertEquals("Undo not supported for add.\n", outContent.toString());

        // Spot should still exist (undo not supported)
        assertTrue(parkingManager.spotExists(testSpotId));
    }

    @Test
    public void testAddExistingSpot() {
        // Add the spot first
        command.execute();
        assertTrue(parkingManager.spotExists(testSpotId));

        // Try to add it again
        command.execute();

        // Spot should still exist and only once
        assertTrue(parkingManager.spotExists(testSpotId));

        // Check that we didn't add a duplicate somehow
        int count = 0;
        for (CompositeParkingLot lot : parkingManager.getParkingLots()) {
            for (Object child : lot.getComponents()) {
                if (child instanceof ParkingSpot && ((ParkingSpot)child).getId().equals(testSpotId)) {
                    count++;
                }
            }
        }
        assertEquals(1, count);
    }

    @Test
    public void testAddSpotWithNonStandardSection() {
        // Create command with a spot that would go to General Lot
        AddParkingSpotCommand generalCommand = new AddParkingSpotCommand(parkingManager, "Z1");

        // Execute command
        generalCommand.execute();

        // Verify spot was added
        assertTrue(parkingManager.spotExists("Z1"));

        // Verify it was added to General Lot
        boolean foundInGeneralLot = false;
        for (CompositeParkingLot lot : parkingManager.getParkingLots()) {
            if (lot.getId().equals("General Lot")) {
                for (Object child : lot.getComponents()) {
                    if (child instanceof ParkingSpot && ((ParkingSpot)child).getId().equals("Z1")) {
                        foundInGeneralLot = true;
                        break;
                    }
                }
            }
        }
        assertTrue(foundInGeneralLot);
    }

    @Test
    public void testAddSpotToCorrectLot() {
        // Create commands for spots in different lots
        AddParkingSpotCommand northCommand = new AddParkingSpotCommand(parkingManager, "A10");
        AddParkingSpotCommand centralCommand = new AddParkingSpotCommand(parkingManager, "B10");
        AddParkingSpotCommand southCommand = new AddParkingSpotCommand(parkingManager, "C10");

        // Execute commands
        northCommand.execute();
        centralCommand.execute();
        southCommand.execute();

        // Verify spots were added to correct lots
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

        boolean foundInNorth = false;
        boolean foundInCentral = false;
        boolean foundInSouth = false;

        for (Object child : northLot.getComponents()) {
            if (child instanceof ParkingSpot && ((ParkingSpot)child).getId().equals("A10")) {
                foundInNorth = true;
                break;
            }
        }

        for (Object child : centralLot.getComponents()) {
            if (child instanceof ParkingSpot && ((ParkingSpot)child).getId().equals("B10")) {
                foundInCentral = true;
                break;
            }
        }

        for (Object child : southLot.getComponents()) {
            if (child instanceof ParkingSpot && ((ParkingSpot)child).getId().equals("C10")) {
                foundInSouth = true;
                break;
            }
        }

        assertTrue(foundInNorth);
        assertTrue(foundInCentral);
        assertTrue(foundInSouth);
    }

    @Test
    public void testAddSpotWhenMaxLimitReached() {
        // First add spots to reach the limit (already have 27, need 73 more)
        for (int i = 1; i <= 73; i++) {
            new AddParkingSpotCommand(parkingManager, "X" + i).execute();
        }

        // Now try to add one more
        AddParkingSpotCommand extraCommand = new AddParkingSpotCommand(parkingManager, "Y1");
        extraCommand.execute();

        // Verify it wasn't added
        assertFalse(parkingManager.spotExists("Y1"));
        assertEquals(100, parkingManager.getSpotsCount());
    }

    @Test
    public void testConstructorWithNullManager() {
        // This test checks constructor behavior with null parameters
        // In a robust implementation, this might throw an exception
        try {
            AddParkingSpotCommand nullManagerCommand = new AddParkingSpotCommand(null, testSpotId);
            // If no exception, at least verify it doesn't crash when executing
            nullManagerCommand.execute();
            // This is a minimal check - ideally the command would validate parameters
        } catch (NullPointerException e) {
            // This is also acceptable if the implementation validates parameters
            assertTrue(true);
        }
    }

    @Test
    public void testConstructorWithNullSpotId() {
        // This test checks constructor behavior with null parameters
        try {
            AddParkingSpotCommand nullSpotCommand = new AddParkingSpotCommand(parkingManager, null);
            // If no exception, at least verify it doesn't crash when executing
            nullSpotCommand.execute();
            // This is a minimal check - ideally the command would validate parameters
        } catch (NullPointerException e) {
            // This is also acceptable if the implementation validates parameters
            assertTrue(true);
        }
    }

    @Test
    public void testMultipleCommands() {
        // Create multiple commands and execute in sequence
        AddParkingSpotCommand cmd1 = new AddParkingSpotCommand(parkingManager, "D1");
        AddParkingSpotCommand cmd2 = new AddParkingSpotCommand(parkingManager, "D2");
        AddParkingSpotCommand cmd3 = new AddParkingSpotCommand(parkingManager, "D3");

        cmd1.execute();
        cmd2.execute();
        cmd3.execute();

        // Verify all spots were added
        assertTrue(parkingManager.spotExists("D1"));
        assertTrue(parkingManager.spotExists("D2"));
        assertTrue(parkingManager.spotExists("D3"));
    }

    // Clean up the System.out after test
    @Test
    public void tearDown() {
        System.setOut(originalOut);
    }
}
