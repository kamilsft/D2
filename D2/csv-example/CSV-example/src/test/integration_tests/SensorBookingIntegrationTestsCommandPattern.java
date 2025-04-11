package test.integration_tests;

import logic.*;
import DesignPatternClasses.Command;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SensorBookingIntegrationTestsCommandPattern {
    private Sensor sensor;
    private Command enableSensorCommand;
    private Command disableSensorCommand;

    @BeforeEach
    void setUp() {
        sensor = new Sensor(1);
        enableSensorCommand = new EnableSensorCommand(sensor);
        disableSensorCommand = new DisableSensorCommand(sensor);
    }

    @Test
    void testEnableSensorCommandExecution() {
        assertFalse(sensor.isSensorOn(), "Sensor should initially be off.");
        enableSensorCommand.execute();
        assertTrue(sensor.isSensorOn(), "Sensor should be on after executing EnableSensorCommand.");
    }

    @Test
    void testEnableSensorCommandUndo() {
        enableSensorCommand.execute();
        assertTrue(sensor.isSensorOn(), "Sensor should be on after executing EnableSensorCommand.");
        enableSensorCommand.undo();
        assertFalse(sensor.isSensorOn(), "Sensor should be off after undoing EnableSensorCommand.");
    }

    @Test
    void testDisableSensorCommandExecution() {
        sensor.setSensorOn(true); // Manually enable the sensor
        assertTrue(sensor.isSensorOn(), "Sensor should initially be on.");
        disableSensorCommand.execute();
        assertFalse(sensor.isSensorOn(), "Sensor should be off after executing DisableSensorCommand.");
    }

    @Test
    void testDisableSensorCommandUndo() {
        sensor.setSensorOn(true); // Manually enable the sensor
        disableSensorCommand.execute();
        assertFalse(sensor.isSensorOn(), "Sensor should be off after executing DisableSensorCommand.");
        disableSensorCommand.undo();
        assertTrue(sensor.isSensorOn(), "Sensor should be on after undoing DisableSensorCommand.");
    }
}
