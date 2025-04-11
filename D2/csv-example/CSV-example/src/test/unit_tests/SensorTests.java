package test.unit_tests;

import main.logic.Sensor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class SensorTests {

    private Sensor sensor;

    @BeforeEach
    void setUp() {
        sensor = new Sensor(1);
    }

    @Test
    void testSensorId() {
        assertEquals(1, sensor.getSensorId());
        sensor.setSensorId(2);
        assertEquals(2, sensor.getSensorId());
    }

    @Test
    void testSensorOn() {
        assertFalse(sensor.isSensorOn());
        sensor.setSensorOn(true);
        assertTrue(sensor.isSensorOn());
    }

    @Test
    void testActivateSensor() {
        ZonedDateTime activationTime = ZonedDateTime.now();
        sensor.activateSensor(activationTime);
        assertTrue(sensor.isSensorOn());
        assertEquals(activationTime, sensor.getSensorActivationTime());
    }

    @Test
    void testDeactivateSensor() {
        sensor.setSensorOn(true);
        ZonedDateTime deactivationTime = ZonedDateTime.now();
        sensor.deactivateSensor(deactivationTime);
        assertFalse(sensor.isSensorOn());
        assertEquals(deactivationTime, sensor.getSensorDeactivationTime());
    }

    @Test
    void testCarPlate() {
        assertEquals("", sensor.getCurrentCarPlate());
        sensor.setCurrentCarPlate("ABC123");
        assertEquals("ABC123", sensor.getCurrentCarPlate());
    }

    @Test
    void testCarBrand() {
        assertEquals("", sensor.getCurrentCarBrand());
        sensor.setCurrentCarBrand("Toyota");
        assertEquals("Toyota", sensor.getCurrentCarBrand());
    }

    @Test
    void testCarModel() {
        assertEquals("", sensor.getCurrentCarModel());
        sensor.setCurrentCarModel("Corolla");
        assertEquals("Corolla", sensor.getCurrentCarModel());
    }

    @Test
    void testCarColor() {
        assertEquals("", sensor.getCurrentCarColor());
        sensor.setCurrentCarColor("Red");
        assertEquals("Red", sensor.getCurrentCarColor());
    }

    @Test
    void testClearCurrentCarInfo() {
        sensor.setCurrentCarPlate("ABC123");
        sensor.setCurrentCarBrand("Toyota");
        sensor.setCurrentCarModel("Corolla");
        sensor.setCurrentCarColor("Red");

        sensor.clearCurrentCarInfo();

        assertEquals("", sensor.getCurrentCarPlate());
        assertEquals("", sensor.getCurrentCarBrand());
        assertEquals("", sensor.getCurrentCarModel());
        assertEquals("", sensor.getCurrentCarColor());
    }

    @Test
    void testCarArrived() {
        assertFalse(sensor.isCarArrived());
        sensor.setCarArrived(true);
        assertTrue(sensor.isCarArrived());
    }
}
