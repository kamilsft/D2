package test.manual_tests.unit_tests;

import logic.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SuperManagerTest {
    private SuperManager superMgr;

    @BeforeEach
    public void setup() {
        superMgr = SuperManager.getInstance();
    }

    @Test
    public void testSingletonReturnsSameInstance() {
        SuperManager another = SuperManager.getInstance();
        assertSame(superMgr, another);
    }

    @Test
    public void testSetAndGetSuperMgrID() {
        superMgr.setSuperMgrID(7);
        assertEquals(7, superMgr.getSuperMgrID());
    }

    @Test
    public void testAuthenticateCorrectID() {
        superMgr.setSuperMgrID(99);
        assertTrue(superMgr.authenticate(99));
    }

    @Test
    public void testAuthenticateWrongID() {
        superMgr.setSuperMgrID(100);
        assertFalse(superMgr.authenticate(101));
    }

    @Test
    public void testEnableManagerOutput() {
        User user = new User("Mark", 1, "mark@my.yorku.ca", "123");
        superMgr.enableManager(user);
    }

    @Test
    public void testDisableManagerOutput() {
        User user = new User("Mark", 1, "mark@my.yorku.ca", "123");
        superMgr.disableManager(user);
    }

    @Test
    public void testEnableParkingSpotNoCrash() {
        ParkingSpot spot = new ParkingSpot("A1", false, true);
        superMgr.enableParkingSpot(spot);
    }

    @Test
    public void testDisableParkingSpotNoCrash() {
        ParkingSpot spot = new ParkingSpot("B2", false, true);
        superMgr.disableParkingSpot(spot);
    }

    @Test
    public void testMonitorParkingPrint() {
        superMgr.monitorParking();
    }

    @Test
    public void testAddParkingLotPrint() {
        superMgr.addParkingLot();
    }
    
    @Test
    public void testToString_NotNull() {
        SuperManager sm = SuperManager.getInstance();
        assertNotNull(sm.toString());
    }
    
    @Test
    public void testEnableDisableParkingLot() {
        SuperManager sm = SuperManager.getInstance();
        ParkingLot lot = new ParkingLot("LotTest");

        sm.disableParkingLot(lot);
        for (ParkingSpot spot : lot.getSpots().values()) {
            assertFalse(spot.isEnabled());
        }

        sm.enableParkingLot(lot);
        for (ParkingSpot spot : lot.getSpots().values()) {
            assertTrue(spot.isEnabled());
        }
    }
    
    @Test
    public void testSetNameAndEmail() {
        SuperManager sm = SuperManager.getInstance();
        sm.setName("BossMan");
        sm.setEmail("boss@y.ca");

        assertEquals("BossMan", sm.getName());
        assertEquals("boss@y.ca", sm.getEmail());
    }
    
    @Test
    public void testSingletonGetInstance() {
        SuperManager sm1 = SuperManager.getInstance();
        SuperManager sm2 = SuperManager.getInstance();
        assertSame(sm1, sm2); 
    }
}