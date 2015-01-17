 

public class TestShoppingCart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Client client1 = new Client("ger@ger.com", 1, "German", "Martinez", "555-12345");

		CashPayment payBycash = new CashPayment();
		CreditCardPayment payByCredit = new CreditCardPayment(12345, "German Martinez");
		PayPalPayment payPalPayment = new PayPalPayment("ger@ger", "12345");

		Product prod1 = new Product(1, "TSHIRT", 15.99);
		Product prod2 = new Product(2, "JEANS", 35);
		Product prod3 = new Product(3, "SHORTS", 25.66);
		Product prod4 = new Product(4, "SOCKS", 5.99);

		Product[] list1 = { prod1, prod2, prod3, prod4 };

		Cart cart1 = new Cart(list1, client1);

		System.out.println("Total to pay: " + cart1.calculateTotal());
		System.out.println("-------------\n" + payBycash.pay(cart1));
		System.out.println("-------------\n" + payByCredit.pay(cart1));
		System.out.println("-------------\n" + payPalPayment.pay(cart1));

	}

}
