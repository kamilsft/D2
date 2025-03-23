package logic;
// done by arshia
public class DebitCardPaymentsStrategy implements PaymentStrategy{
	@Override
	public boolean pay(User user, double amount) {
		System.out.println("Processing Debit card payment of: " + amount + "for " + user.getName());
		return true;
	}
}
