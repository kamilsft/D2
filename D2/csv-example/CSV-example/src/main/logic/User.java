package logic;

public class User {
	public String name;
	public int id;
	public String email;
	public String password;
	private double balance = 15.0;
	
	private PricingStrategy pricingStrategy;
	private PaymentStrategy paymentStrategy;

	
	public User(String name, int id, String email, String password) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
	}
	  
	public User(){
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	public double calculateParkingPrice(int durationMinutes) {
		return pricingStrategy.calculatePrice(durationMinutes);
	}
	
	public PricingStrategy getPricingStrategy() {
		return pricingStrategy;
	}
	
	public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
	
	public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }
	
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
	
	public double getBalance() {
        return balance;
    }

    public void deductBalance(double amount) {
        balance -= amount;
    }

	
}
