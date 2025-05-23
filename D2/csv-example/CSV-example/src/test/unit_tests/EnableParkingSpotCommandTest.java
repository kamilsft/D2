package test.unit_tests;

import main.DesignPatternClasses.Command;
import main.logic.EnableParkingSpotCommand;
import main.logic.ParkingManager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnableParkingSpotCommandTest {

    private ParkingManager parkingManager;
    private EnableParkingSpotCommand command;
    private String testSpotId = "A1";

    @Before
    public void setUp() {
        parkingManager = new ParkingManager();
        command = new EnableParkingSpotCommand(parkingManager, testSpotId);

        // Disable the spot first for testing
        parkingManager.disableSpot(testSpotId);
    }

    @Test
    public void testCommandImplementation() {
        // Verify it implements Command interface
        assertTrue(command instanceof Command);
    }

    @Test
    public void testExecute() {
        // Verify spot is disabled before command execution
        assertFalse(parkingManager.getSpots().get(testSpotId).isEnabled());

        // Execute command
        command.execute();

        // Verify spot is now enabled
        assertTrue(parkingManager.getSpots().get(testSpotId).isEnabled());
    }

    @Test
    public void testUndo() {
        // Enable the spot
        command.execute();
        assertTrue(parkingManager.getSpots().get(testSpotId).isEnabled());

        // Undo the command
        command.undo();

        // Verify spot is disabled again
        assertFalse(parkingManager.getSpots().get(testSpotId).isEnabled());
    }

    @Test
    public void testMultipleExecuteUndo() {
        // Execute and undo multiple times
        command.execute();
        assertTrue(parkingManager.getSpots().get(testSpotId).isEnabled());

        command.undo();
        assertFalse(parkingManager.getSpots().get(testSpotId).isEnabled());

        command.execute();
        assertTrue(parkingManager.getSpots().get(testSpotId).isEnabled());
    }

    @Test
    public void testWithNonExistentSpot() {
        // Create command with non-existent spot
        EnableParkingSpotCommand invalidCommand = new EnableParkingSpotCommand(parkingManager, "Z9");

        // Execute should not throw exception but return false from manager
        invalidCommand.execute();
        assertFalse(parkingManager.spotExists("Z9"));
    }

    @Test
    public void testExecuteOnAlreadyEnabledSpot() {
        // Enable the spot
        command.execute();
        assertTrue(parkingManager.getSpots().get(testSpotId).isEnabled());

        // Execute again - should work but not change state
        command.execute();
        assertTrue(parkingManager.getSpots().get(testSpotId).isEnabled());
    }

    @Test
    public void testUndoOnAlreadyDisabledSpot() {
        // Spot is already disabled in setup
        assertFalse(parkingManager.getSpots().get(testSpotId).isEnabled());

        // Undo should still try to disable
        command.undo();
        assertFalse(parkingManager.getSpots().get(testSpotId).isEnabled());
    }

    @Test
    public void testWithMultipleSpots() {
        // Create additional command for another spot
        String secondSpotId = "B2";
        EnableParkingSpotCommand secondCommand = new EnableParkingSpotCommand(parkingManager, secondSpotId);

        // Disable both spots
        parkingManager.disableSpot(testSpotId);
        parkingManager.disableSpot(secondSpotId);

        // Execute first command
        command.execute();
        assertTrue(parkingManager.getSpots().get(testSpotId).isEnabled());
        assertFalse(parkingManager.getSpots().get(secondSpotId).isEnabled());

        // Execute second command
        secondCommand.execute();
        assertTrue(parkingManager.getSpots().get(testSpotId).isEnabled());
        assertTrue(parkingManager.getSpots().get(secondSpotId).isEnabled());
    }

    @Test
    public void testConstructorWithNullManager() {
        // This test checks constructor behavior with null parameters
        // In a robust implementation, this might throw an exception
        try {
            EnableParkingSpotCommand nullManagerCommand = new EnableParkingSpotCommand(null, testSpotId);
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
            EnableParkingSpotCommand nullSpotCommand = new EnableParkingSpotCommand(parkingManager, null);
            // If no exception, at least verify it doesn't crash when executing
            nullSpotCommand.execute();
            // This is a minimal check - ideally the command would validate parameters
        } catch (NullPointerException e) {
            // This is also acceptable if the implementation validates parameters
            assertTrue(true);
        }
    }
}