 

public class Cart {

	private Product[] products;
	private Payment payment;
	private Client client;
	private double totalToPay;

	// Constructor

	public Cart(Product[] productos, Client client) {
		this.products = productos;
		this.client = client;
	}

	// getters & setters

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] productos) {
		this.products = productos;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getTotalToPay() {
		return totalToPay;
	}

	public void setTotalToPay(double totalToPay) {
		this.totalToPay = totalToPay;
	}

	// methods

	public double calculateTotal() {

		double sum = 0;

		for (Product product : this.products) {
			sum = sum + product.getPrice();
		}

		this.setTotalToPay(sum);

		return sum;
	}

}
