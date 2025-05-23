package test.unit_tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.logic.DebitCardPaymentsStrategy;
import main.logic.PaymentStrategy;
import main.logic.User;

// Arshia
public class DebitCardPaymentsStrategyTest {

    @Test
    public void testZero() {
        User user = new User("Alice", 1, "alice@york.ca", "pass");
        PaymentStrategy payment = new DebitCardPaymentsStrategy();
        assertTrue(payment.pay(user, 15.0));
        assertEquals(0.0, user.getBalance(), 0.001);
    }

    @Test
    public void testOne() {
        User user = new User("Bob", 2, "bob@york.ca", "pass");
        PaymentStrategy payment = new DebitCardPaymentsStrategy();
        assertTrue(payment.pay(user, 5.0));
        assertEquals(10.0, user.getBalance(), 0.001);
    }

    @Test
    public void testTwo() {
        User user = new User("Charlie", 3, "charlie@york.ca", "pass");
        PaymentStrategy payment = new DebitCardPaymentsStrategy();
        assertTrue(payment.pay(user, 0.0));
        assertEquals(15.0, user.getBalance(), 0.001);
    }

    @Test
    public void testThree() {
        User user = new User("Diana", 4, "diana@york.ca", "pass");
        PaymentStrategy payment = new DebitCardPaymentsStrategy();
        assertTrue(payment.pay(user, 20.0));
        assertEquals(-5.0, user.getBalance(), 0.001);
    }

    @Test
    public void testFour() {
        User user = new User("Eve", 5, "eve@york.ca", "pass");
        PaymentStrategy payment = new DebitCardPaymentsStrategy();
        assertTrue(payment.pay(user, -10.0));
        assertEquals(25.0, user.getBalance(), 0.001);
    }

    @Test
    public void testFive() {
        User user = new User("Fred", 6, "fred@york.ca", "pass");
        PaymentStrategy payment = new DebitCardPaymentsStrategy();
        assertTrue(payment.pay(user, 0.123));
        assertEquals(14.877, user.getBalance(), 0.001);
    }

    @Test
    public void testSix() {
        User user = new User("Grace", 7, "grace@york.ca", "pass");
        PaymentStrategy payment = new DebitCardPaymentsStrategy();
        payment.pay(user, 5.0);
        payment.pay(user, 3.0);
        assertEquals(7.0, user.getBalance(), 0.001);
    }

    @Test
    public void testSeven() {
        User user = new User("Henry", 8, "henry@york.ca", "pass");
        PaymentStrategy payment = new DebitCardPaymentsStrategy();
        payment.pay(user, 10.0);
        payment.pay(user, 5.0);
        assertEquals(0.0, user.getBalance(), 0.001);
    }

    @Test
    public void testEight() {
        User user = new User("Ian", 9, "ian@york.ca", "pass");
        PaymentStrategy payment = new DebitCardPaymentsStrategy();
        payment.pay(user, 100.0);
        assertEquals(-85.0, user.getBalance(), 0.001);
    }

    @Test
    public void testNine() {
        User user = new User("TestUser", 10, "test@york.ca", "pass");
        PaymentStrategy payment = new DebitCardPaymentsStrategy();
        assertTrue(payment.pay(user, 1.0));
        assertEquals("TestUser", user.getName());
    }
}