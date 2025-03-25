package logic;

public class NonFacultyPricing implements PricingStrategy {
	@Override
	public double calculatePrice(int minutes) {
		return (minutes / 60.0) * 10.0;
	}
}
