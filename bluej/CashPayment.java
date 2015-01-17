 

public class CashPayment extends Payment {

	@Override
	public String pay(Cart cart) {

		double max = cart.getProducts()[0].getPrice();

		for (Product product : cart.getProducts()) {

			if (product.getPrice() > max) {
				max = product.getPrice();
			}

		}

		this.setTotal((cart.calculateTotal() - (max * 0.9)));

		return "Payed By Cash has 90% off on expensieve item, your total with discout is " + this.getTotal();

	}

}
