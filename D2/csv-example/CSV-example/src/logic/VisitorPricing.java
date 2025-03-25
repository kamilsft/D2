package logic;

//Done by Arshia Hassanpour, encountered pushing problems

public class VisitorPricing implements PricingStrategy {
	@Override
	public double calculatePrice(int minutes) {
		return (minutes / 60.0) * 15.0;
	}
}
 