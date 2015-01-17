 

public class CreditCardPayment extends Payment {

	private int creditCardNum;
	private String name;

	public CreditCardPayment(int creditCardNum, String name) {
		this.setCreditCardNum(creditCardNum);
		this.setName(name);
	}

	// getters & setters
	public int getCreditCardNum() {
		return creditCardNum;
	}

	public void setCreditCardNum(int creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String pay(Cart cart) {

		this.setTotal((cart.calculateTotal() * 0.9));

		return "Payed By Credit Card you have a 10% off on entire buy, your total with discout is " + this.getTotal();
	}

}
