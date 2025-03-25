package logic;

//Done by Arshia Hassanpour, encountered pushing problems

public class StudentPricing implements PricingStrategy {
	@Override
	public double calculatePrice(int minutes) {
		return (minutes / 60.0) * 5.0;
	}
}
