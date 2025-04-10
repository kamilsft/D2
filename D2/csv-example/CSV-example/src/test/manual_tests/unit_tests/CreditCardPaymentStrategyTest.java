package test.manual_tests.unit_tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import logic.CreditCardPaymentStrategy;
import logic.PaymentStrategy;
import logic.User;

//Arshia
public class CreditCardPaymentStrategyTest {

    @Test
    public void TestZero() {
        User user = new User("Alice", 1, "alice@york.ca", "pass");
        PaymentStrategy payment = new CreditCardPaymentStrategy();
        assertTrue(payment.pay(user, 15.0));
        assertEquals(0.0, user.getBalance(), 0.001);
    }

    @Test
    public void TestOne() {
        User user = new User("Bob", 2, "bob@york.ca", "pass");
        PaymentStrategy payment = new CreditCardPaymentStrategy();
        assertTrue(payment.pay(user, 5.0));
        assertEquals(10.0, user.getBalance(), 0.001);
    }

    @Test
    public void TestTwo() {
        User user = new User("Charlie", 3, "charlie@york.ca", "pass");
        PaymentStrategy payment = new CreditCardPaymentStrategy();
        assertTrue(payment.pay(user, 0.0));
        assertEquals(15.0, user.getBalance(), 0.001);
    }

    @Test
    public void TestThree() {
        User user = new User("Diana", 4, "diana@york.ca", "pass");
        PaymentStrategy payment = new CreditCardPaymentStrategy();
        assertTrue(payment.pay(user, 20.0));
        assertEquals(-5.0, user.getBalance(), 0.001);
    }

    @Test
    public void TestFour() {
        User user = new User("Eve", 5, "eve@york.ca", "pass");
        PaymentStrategy payment = new CreditCardPaymentStrategy();
        assertTrue(payment.pay(user, -10.0));
        assertEquals(25.0, user.getBalance(), 0.001);
    }

    @Test
    public void TestFive() {
        User user = new User("Fred", 6, "fred@york.ca", "pass");
        PaymentStrategy payment = new CreditCardPaymentStrategy();
        assertTrue(payment.pay(user, 0.123));
        assertEquals(14.877, user.getBalance(), 0.001);
    }

    @Test
    public void TestSix() {
        User user = new User("Grace", 7, "grace@york.ca", "pass");
        PaymentStrategy payment = new CreditCardPaymentStrategy();
        payment.pay(user, 5.0);
        payment.pay(user, 3.0);
        assertEquals(7.0, user.getBalance(), 0.001);
    }

    @Test
    public void TestSeven() {
        User user = new User("Henry", 8, "henry@york.ca", "pass");
        PaymentStrategy payment = new CreditCardPaymentStrategy();
        payment.pay(user, 10.0);
        payment.pay(user, 5.0);
        assertEquals(0.0, user.getBalance(), 0.001);
    }

    @Test
    public void TestEight() {
        User user = new User("Ian", 9, "ian@york.ca", "pass");
        PaymentStrategy payment = new CreditCardPaymentStrategy();
        payment.pay(user, 100.0);
        assertEquals(-85.0, user.getBalance(), 0.001);
    }

    @Test
    public void TestNine() {
        User user = new User("TestUser", 10, "test@york.ca", "pass");
        PaymentStrategy payment = new CreditCardPaymentStrategy();
        assertTrue(payment.pay(user, 1.0));
        assertEquals("TestUser", user.getName());
    }
}