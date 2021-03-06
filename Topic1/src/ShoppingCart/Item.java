package ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private int itemId;
    private double price;
    private List<Item> offer;

    // Constructor
    public Item(String name, int itemId, double price) {
        this.name = name;
        this.itemId = itemId;
        this.price = price;
        this.offer = new ArrayList<Item>();
    }

    // Methods
    public void add(Item i) {
        this.offer.add(i);
    }

    public void remove(Item i) {
        this.offer.remove(i);
    }

    public List<Item> getOffer() {
        return this.offer;
    }

    public String toString() {
        return "Name:" + name + " itemId:" + itemId + " Price:" + price;
    }

    public double getPrice() {

        return this.price;
    }

    public String getName() {

        return this.name;
    }

}
