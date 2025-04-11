package test.unit_tests;

import logic.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User user;

    @BeforeEach
    public void setup() {
        user = new User("Bob", 111, "bob@my.yorku.ca", "pass");
    }

    @Test
    public void testConstructor() {
        assertEquals("Bob", user.getName());
        assertEquals(111, user.getId());
        assertEquals("bob@my.yorku.ca", user.getEmail());
    }

    @Test
    public void testSetName() {
        user.setName("Olivia");
        assertEquals("Olivia", user.getName());
    }

    @Test
    public void testSetEmail() {
        user.setEmail("olivia@my.yorku.ca");
        assertEquals("olivia@my.yorku.ca", user.getEmail());
    }

    @Test
    public void testSetId() {
        user.setId(222);
        assertEquals(222, user.getId());
    }

    @Test
    public void testSetPassword() {
        user.setPassword("newpass");
        assertEquals("newpass", user.getPassword());
    }

    @Test
    public void testGetBalanceDefault() {
        assertEquals(15.0, user.getBalance());
    }

    @Test
    public void testDeductBalance() {
        user.deductBalance(5.0);
        assertEquals(10.0, user.getBalance());
    }

    @Test
    public void testToStringNotNull() {
        assertNotNull(user.toString());
    }

    @Test
    public void testSetAndGetPricingStrategy() {
        PricingStrategy ps = duration -> duration * 0.5;
        user.setPricingStrategy(ps);
        assertEquals(2.5, user.calculateParkingPrice(5));
    }

    @Test
    public void testSetAndGetPaymentStrategy() {
        PaymentStrategy strategy = (u, amt) -> amt <= u.getBalance();
        user.setPaymentStrategy(strategy);
        assertTrue(user.getPaymentStrategy().pay(user, 10));
    }
    
  //Arshia added this test
    @Test
    public void testGetAndSetPricingStrategy() {
        User user = new User("Alex", 11, "alex@york.ca", "pass");
        PricingStrategy strategy = new StudentPricing();
        user.setPricingStrategy(strategy);
        assertEquals(strategy, user.getPricingStrategy());
    }
}