package test.unit_tests;

import main.logic.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    class DummyManager extends Manager {
        public DummyManager(String name, int id, String email, String password) {
            super(name, id, email, password);
        }
        public void enableManager(User user) {}
        public void disableManager(User user) {}
        public void enableParkingSpot(ParkingSpot spot) {}
        public void disableParkingSpot(ParkingSpot spot) {}
        public void enableParkingLot(ParkingLot lot) {}
        public void disableParkingLot(ParkingLot lot) {}
        public void monitorParking() {}
        public void addParkingLot() {}
    }

    @Test
    public void testConstructor() {
        DummyManager dm = new DummyManager("TestMgr", 9001, "mgr@yorku.ca", "pass");
        assertEquals("TestMgr", dm.getName());
        assertEquals(9001, dm.getId());
    }

    @Test
    public void testSetName() {
        DummyManager dm = new DummyManager("Old", 1, "a@b.com", "p");
        dm.setName("New");
        assertEquals("New", dm.getName());
    }

    @Test
    public void testSetEmail() {
        DummyManager dm = new DummyManager("Old", 1, "a@b.com", "p");
        dm.setEmail("new@b.com");
        assertEquals("new@b.com", dm.getEmail());
    }

    @Test
    public void testSetId() {
        DummyManager dm = new DummyManager("X", 123, "x@y.ca", "p");
        dm.setId(321);
        assertEquals(321, dm.getId());
    }

    @Test
    public void testSetPassword() {
        DummyManager dm = new DummyManager("X", 1, "x@y.ca", "p");
        dm.setPassword("newpass");
        assertEquals("newpass", dm.getPassword());
    }

    @Test
    public void testToString() {
        DummyManager dm = new DummyManager("X", 1, "x@y.ca", "p");
        assertTrue(dm.toString().contains("User"));
    }

    @Test
    public void testEmailGetter() {
        DummyManager dm = new DummyManager("A", 1, "email@test.com", "p");
        assertEquals("email@test.com", dm.getEmail());
    }

    @Test
    public void testPasswordGetter() {
        DummyManager dm = new DummyManager("A", 1, "email@test.com", "mypass");
        assertEquals("mypass", dm.getPassword());
    }

    @Test
    public void testIdGetter() {
        DummyManager dm = new DummyManager("B", 88, "e@t.com", "z");
        assertEquals(88, dm.getId());
    }

    @Test
    public void testNameGetter() {
        DummyManager dm = new DummyManager("SuperVisor", 777, "em@a.il", "word");
        assertEquals("SuperVisor", dm.getName());
    }
}
