 

public class PayPalPayment extends Payment {

	private String email;
	private String password;

	// Constructor

	public PayPalPayment(String mail, String password) {
		this.setEmail(mail);
		this.setPassword(password);
	}

	// getters & setters

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

	// Methods

	@Override
	public String pay(Cart cart) {

		double min = cart.getProducts()[0].getPrice();

		for (Product product : cart.getProducts()) {
			if (product.getPrice() > min) {
				min = product.getPrice();
			}

		}

		this.setTotal((cart.calculateTotal() - min));
		return "Payed By Paypal has 100% off on cheapest item, your total with discout is " + this.getTotal();
	}

}
