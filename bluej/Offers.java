 

public class Offers extends Product {

	private double offerPrice;

	public Offers(int itemId, String itemName, double price, double offerPrice) {
		super(itemId, itemName, price);
		this.offerPrice = offerPrice;
	}

	public double getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}

}
