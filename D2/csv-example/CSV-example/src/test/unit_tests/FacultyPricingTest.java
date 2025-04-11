package test.unit_tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import logic.FacultyPricing;
import logic.PricingStrategy;

// Arshia
public class FacultyPricingTest {
	@Test
	public void testOneMinuts() {
		PricingStrategy strategy = new FacultyPricing();
		assertEquals(0.0, strategy.calculatePrice(0),0.001);
	}
	
	@Test
	public void testTwoHalfMinutes() {
		PricingStrategy strategy = new FacultyPricing();
		assertEquals(4.0, strategy.calculatePrice(30),0.001);
	}
	@Test
	public void testThreeHour() {
		PricingStrategy strategy = new FacultyPricing();
		assertEquals(8.0, strategy.calculatePrice(60),0.001);
	}
	@Test
	public void testFourOneHalfHour() {
		PricingStrategy strategy = new FacultyPricing();
		assertEquals(12.0, strategy.calculatePrice(90),0.001);
	}
	@Test
	public void testFiveTwoHours() {
		PricingStrategy strategy = new FacultyPricing();
		assertEquals(16.0, strategy.calculatePrice(120),0.001);
	}
	@Test
	public void testSix22Miutes() {
		PricingStrategy strategy = new FacultyPricing();
		assertEquals(2.666, strategy.calculatePrice(20), 0.001);
	}
	@Test
	public void testSeven40Miutes() {
		PricingStrategy strategy = new FacultyPricing();
		assertEquals(5.333,strategy.calculatePrice(40), 0.001);
	}
	@Test
	public void testEight3Hours() {
		PricingStrategy strategy = new FacultyPricing();
		assertEquals(24.0, strategy.calculatePrice(180), 0.001);
	}
	@Test
	public void testNineOneDay() {
		PricingStrategy strategy = new FacultyPricing();
		assertEquals(192.0, strategy.calculatePrice(1440),0.001);
	}
	@Test
	public void testTenHalfDay() {
		PricingStrategy strategy = new FacultyPricing();
		assertEquals(96.0, strategy.calculatePrice(720),0.001);
	}
}