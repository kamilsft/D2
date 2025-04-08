package test.manual_tests.unit_tests;

import logic.PricingStrategy;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import logic.VisitorPricing;

// Arshia

public class VisitorPricingTest {
	
	@Test
	public void testOneMinuts() {
		PricingStrategy strategy = new VisitorPricing();
		assertEquals(0.0, strategy.calculatePrice(0),0.001);
	}
	
	@Test
	public void testTwoHalfMinutes() {
		PricingStrategy strategy = new VisitorPricing();
		assertEquals(7.5, strategy.calculatePrice(30),0.001);
	}
	@Test
	public void testThreeHour() {
		PricingStrategy strategy = new VisitorPricing();
		assertEquals(15.0, strategy.calculatePrice(60),0.001);
	}
	@Test
	public void testFourOneHalfHour() {
		PricingStrategy strategy = new VisitorPricing();
		assertEquals(22.5, strategy.calculatePrice(90),0.001);
	}
	@Test
	public void testFiveTwoHours() {
		PricingStrategy strategy = new VisitorPricing();
		assertEquals(30.0, strategy.calculatePrice(120),0.001);
	}
	@Test
	public void testSix22Miutes() {
		PricingStrategy strategy = new VisitorPricing();
		assertEquals(5.0, strategy.calculatePrice(20), 0.001);
	}
	@Test
	public void testSeven40Miutes() {
		PricingStrategy strategy = new VisitorPricing();
		assertEquals(10.0,strategy.calculatePrice(40), 0.001);
	}
	@Test
	public void testEight3Hours() {
		PricingStrategy strategy = new VisitorPricing();
		assertEquals(45.0, strategy.calculatePrice(180), 0.001);
	}
	@Test
	public void testNineOneDay() {
		PricingStrategy strategy = new VisitorPricing();
		assertEquals(360.0, strategy.calculatePrice(1440),0.001);
	}
	@Test
	public void testTenHalfDay() {
		PricingStrategy strategy = new VisitorPricing();
		assertEquals(180.0, strategy.calculatePrice(720),0.001);
	}
}