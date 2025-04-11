package main.logic;

public class FacultyPricing implements PricingStrategy {
	@Override
	public double calculatePrice(int minutes) {
		return (minutes / 60.0) * 8.0;
	}
}
  