package test.unit_tests;

import logic.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeneralManagerTest {
    private GeneralManager gm;
    private User dummyUser;
    private ParkingLot lot;
    private ParkingSpot spot;

    @BeforeEach
    public void setup() {
        gm = new GeneralManager("Boss", 5001, "gm@yorku.ca", "admin");
        dummyUser = new User("TestUser", 1010, "test@yorku.ca", "test123");
        lot = new ParkingLot("Lot1");
        spot = new ParkingSpot("A1", false, true);
    }

    @Test
    public void testEnableManagerPrint() {
        gm.enableManager(dummyUser);
    }

    @Test
    public void testDisableManagerPrint() {
        gm.disableManager(dummyUser);
    }

    @Test
    public void testEnableParkingSpotNoCrash() {
        gm.enableParkingSpot(spot);
    }

    @Test
    public void testDisableParkingSpotNoCrash() {
        gm.disableParkingSpot(spot);
    }

    @Test
    public void testEnableParkingLotNoCrash() {
        gm.enableParkingLot(lot);
    }

    @Test
    public void testDisableParkingLotNoCrash() {
        gm.disableParkingLot(lot);
    }

    @Test
    public void testMonitorParkingNoCrash() {
        gm.monitorParking();
    }

    @Test
    public void testAddParkingLotNoCrash() {
        gm.addParkingLot();
    }

    @Test
    public void testConstructorFields() {
        assertEquals("Boss", gm.getName());
        assertEquals(5001, gm.getId());
    }

    @Test
    public void testEmailAndPassword() {
        assertEquals("gm@yorku.ca", gm.getEmail());
        assertEquals("admin", gm.getPassword());
    }
}

