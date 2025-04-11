package test.integration_tests;

import  main.logic.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class SensorBookingIntegrationTestsObserverPattern {
    private Sensor sensor;
    private Booking booking;

    @BeforeEach
    void setUp() {
        sensor = new Sensor(1);
        ParkingSpot spot = new ParkingSpot("A1", false, true);
        spot.setSensor(sensor);
        User user = new User("Test User", 1001, "test@example.com", "password");
        booking = new Booking(ZonedDateTime.now(), ZonedDateTime.now().plusHours(1), "ABC123", true, spot, user);
        sensor.addObserver(booking);
    }

    @Test
    void testObserverAddedToSensor() {
        assertTrue(sensor.getObservers().contains(booking), "Booking should be added as an observer to the sensor.");
    }

    @Test
    void testSensorNotifiesObserverWhenActivated() {
        sensor.setSensorOn(true);
        sensor.notifyObservers();
        assertTrue(sensor.isCarArrived(), "Sensor should notify the booking when activated.");
    }

    @Test
    void testSensorNotifiesObserverWhenDeactivated() {
        sensor.setSensorOn(false);
        sensor.notifyObservers();
        assertFalse(sensor.isCarArrived(), "Sensor should notify the booking when deactivated.");
    }

    @Test
    void testObserverRemovedFromSensor() {
        sensor.removeObserver(booking);
        assertFalse(sensor.getObservers().contains(booking), "Booking should be removed as an observer from the sensor.");
    }

    @Test
    void testUpdateMethodInBooking() {
        sensor.setSensorOn(true);
        sensor.notifyObservers();
        assertTrue(sensor.isCarArrived(), "Booking's update method should be called when sensor notifies.");
    }
}
