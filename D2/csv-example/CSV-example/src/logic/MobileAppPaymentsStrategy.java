package logic;


// done by arshia

public class MobileAppPaymentsStrategy implements PaymentStrategy{
	@Override
	public boolean pay(User user, double amount) {
		System.out.println("Processing Mobile Payments of: " + amount + "for " + user.getName());
		user.deductBalance(amount);
		return true;
	}
}
