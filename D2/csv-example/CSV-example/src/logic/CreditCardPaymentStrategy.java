package logic;

 
// done by arshia
public class CreditCardPaymentStrategy implements PaymentStrategy{
	@Override
	public boolean pay(User user, double amount) {
		System.out.println("Processing Credit card payment of: " + amount + "for " + user.getName());
		user.deductBalance(amount);
		return true;
	}
}




