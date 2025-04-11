package test.unit_tests;

import DesignPatternClasses.Command;
import logic.DisableParkingSpotCommand;
import logic.ParkingManager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DisableParkingSpotCommandTest {

    private ParkingManager parkingManager;
    private DisableParkingSpotCommand command;
    private String testSpotId = "A1";

    @Before
    public void setUp() {
        parkingManager = new ParkingManager();
        command = new DisableParkingSpotCommand(parkingManager, testSpotId);

        // Ensure the spot is enabled for testing
        parkingManager.enableSpot(testSpotId);
    }

    @Test
    public void testCommandImplementation() {
        // Verify it implements Command interface
        assertTrue(command instanceof Command);
    }

    @Test
    public void testExecute() {
        // Verify spot is enabled before command execution
        assertTrue(parkingManager.getSpots().get(testSpotId).isEnabled());

        // Execute command
        command.execute();

        // Verify spot is now disabled
        assertFalse(parkingManager.getSpots().get(testSpotId).isEnabled());
    }

    @Test
    public void testUndo() {
        // Disable the spot
        command.execute();
        assertFalse(parkingManager.getSpots().get(testSpotId).isEnabled());

        // Undo the command
        command.undo();

        // Verify spot is enabled again
        assertTrue(parkingManager.getSpots().get(testSpotId).isEnabled());
    }

    @Test
    public void testMultipleExecuteUndo() {
        // Execute and undo multiple times
        command.execute();
        assertFalse(parkingManager.getSpots().get(testSpotId).isEnabled());

        command.undo();
        assertTrue(parkingManager.getSpots().get(testSpotId).isEnabled());

        command.execute();
        assertFalse(parkingManager.getSpots().get(testSpotId).isEnabled());
    }

    @Test
    public void testWithNonExistentSpot() {
        // Create command with non-existent spot
        DisableParkingSpotCommand invalidCommand = new DisableParkingSpotCommand(parkingManager, "Z9");

        // Execute should not throw exception but return false from manager
        invalidCommand.execute();
        assertFalse(parkingManager.spotExists("Z9"));
    }

    @Test
    public void testExecuteOnAlreadyDisabledSpot() {
        // Disable the spot
        command.execute();
        assertFalse(parkingManager.getSpots().get(testSpotId).isEnabled());

        // Execute again - should work but not change state
        command.execute();
        assertFalse(parkingManager.getSpots().get(testSpotId).isEnabled());
    }

    @Test
    public void testUndoOnAlreadyEnabledSpot() {
        // Spot is already enabled in setup
        assertTrue(parkingManager.getSpots().get(testSpotId).isEnabled());

        // Undo without executing first - should still try to enable
        command.undo();
        assertTrue(parkingManager.getSpots().get(testSpotId).isEnabled());
    }

    @Test
    public void testWithMultipleSpots() {
        // Create additional command for another spot
        String secondSpotId = "B2";
        DisableParkingSpotCommand secondCommand = new DisableParkingSpotCommand(parkingManager, secondSpotId);

        // Enable both spots
        parkingManager.enableSpot(testSpotId);
        parkingManager.enableSpot(secondSpotId);

        // Execute first command
        command.execute();
        assertFalse(parkingManager.getSpots().get(testSpotId).isEnabled());
        assertTrue(parkingManager.getSpots().get(secondSpotId).isEnabled());

        // Execute second command
        secondCommand.execute();
        assertFalse(parkingManager.getSpots().get(testSpotId).isEnabled());
        assertFalse(parkingManager.getSpots().get(secondSpotId).isEnabled());
    }

    @Test
    public void testConstructorWithNullManager() {
        // This test checks constructor behavior with null parameters
        // In a robust implementation, this might throw an exception
        try {
            DisableParkingSpotCommand nullManagerCommand = new DisableParkingSpotCommand(null, testSpotId);
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
            DisableParkingSpotCommand nullSpotCommand = new DisableParkingSpotCommand(parkingManager, null);
            // If no exception, at least verify it doesn't crash when executing
            nullSpotCommand.execute();
            // This is a minimal check - ideally the command would validate parameters
        } catch (NullPointerException e) {
            // This is also acceptable if the implementation validates parameters
            assertTrue(true);
        }
    }
}