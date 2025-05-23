package test.unit_tests;

//Arshia
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.logic.StudentPricing;
import main.logic.PricingStrategy;

public class StudentPricingTest {
	
	@Test
	public void testZero() {
		PricingStrategy strategy = new StudentPricing();
		assertEquals(0.0,strategy.calculatePrice(0), 0.001);
		
	}
	@Test
	public void testOne() {
		PricingStrategy strategy = new StudentPricing();
		assertEquals(2.5,strategy.calculatePrice(30), 0.001);
		
	}
	@Test
	public void testTwo() {
		PricingStrategy strategy = new StudentPricing();
		assertEquals(5.0,strategy.calculatePrice(60), 0.001);
		
	}
	@Test
	public void testThree() {
		PricingStrategy strategy = new StudentPricing();
		assertEquals(7.5,strategy.calculatePrice(90), 0.001);
		
	}
	@Test
	public void testFour() {
		PricingStrategy strategy = new StudentPricing();
		assertEquals(10.0,strategy.calculatePrice(120), 0.001);
		
	}
	@Test
	public void testFive() {
		PricingStrategy strategy = new StudentPricing();
		assertEquals(12.5,strategy.calculatePrice(150), 0.001);
		
	}
	@Test
	public void testSix() {
		PricingStrategy strategy = new StudentPricing();
		assertEquals(15.0,strategy.calculatePrice(180), 0.001);
		
	}
	@Test
	public void testSeven() {
		PricingStrategy strategy = new StudentPricing();
		assertEquals(1.25,strategy.calculatePrice(15), 0.001);
		
	}
	@Test
	public void testEight() {
		PricingStrategy strategy = new StudentPricing();
		assertEquals(3.75,strategy.calculatePrice(45), 0.001);
		
	}
	@Test
	public void testNine() {
		PricingStrategy strategy = new StudentPricing();
		assertEquals(120,strategy.calculatePrice(1440), 0.001);
		
	}
	@Test
	public void testTen() {
		PricingStrategy strategy = new StudentPricing();
		assertEquals(60.0,strategy.calculatePrice(720), 0.001);
		
	}
	

}