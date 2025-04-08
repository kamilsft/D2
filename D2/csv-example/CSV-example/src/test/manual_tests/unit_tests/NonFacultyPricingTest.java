package test.manual_tests.unit_tests;

//Arshia
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import logic.NonFacultyPricing;
import logic.PricingStrategy;


public class NonFacultyPricingTest {
	
	@Test
	public void testZero() {
		PricingStrategy strategy = new NonFacultyPricing();
		assertEquals(0.0,strategy.calculatePrice(0), 0.001);
		
	}
	@Test
	public void testOne() {
		PricingStrategy strategy = new NonFacultyPricing();
		assertEquals(5.0,strategy.calculatePrice(30), 0.001);
		
	}
	@Test
	public void testTwo() {
		PricingStrategy strategy = new NonFacultyPricing();
		assertEquals(10.0,strategy.calculatePrice(60), 0.001);
		
	}
	@Test
	public void testThree() {
		PricingStrategy strategy = new NonFacultyPricing();
		assertEquals(15.0,strategy.calculatePrice(90), 0.001);
		
	}
	@Test
	public void testFour() {
		PricingStrategy strategy = new NonFacultyPricing();
		assertEquals(20.0,strategy.calculatePrice(120), 0.001);
		
	}
	@Test
	public void testFive() {
		PricingStrategy strategy = new NonFacultyPricing();
		assertEquals(25.0,strategy.calculatePrice(150), 0.001);
		
	}
	@Test
	public void testSix() {
		PricingStrategy strategy = new NonFacultyPricing();
		assertEquals(30.0,strategy.calculatePrice(180), 0.001);
		
	}
	@Test
	public void testSeven() {
		PricingStrategy strategy = new NonFacultyPricing();
		assertEquals(2.5,strategy.calculatePrice(15), 0.001);
		
	}
	@Test
	public void testEight() {
		PricingStrategy strategy = new NonFacultyPricing();
		assertEquals(7.5,strategy.calculatePrice(45), 0.001);
		
	}
	@Test
	public void testNine() {
		PricingStrategy strategy = new NonFacultyPricing();
		assertEquals(240,strategy.calculatePrice(1440), 0.001);
		
	}
	@Test
	public void testTen() {
		PricingStrategy strategy = new NonFacultyPricing();
		assertEquals(120.0,strategy.calculatePrice(720), 0.001);
		
	}
	

}