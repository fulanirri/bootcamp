package ShoppingCart;

import java.util.ArrayList;

public class Order {

    private int orderId;
    private ArrayList<Item> listOfItem;
    private double total;

    // Constructor

    public Order() {

        this.listOfItem = new ArrayList<Item>();

    }

    public Order(ArrayList<Item> list) {

        this.listOfItem = list;

    }

    // getters & setters

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ArrayList<Item> getListOfItem() {
        return listOfItem;
    }

    public void setListOfItem(ArrayList<Item> listOfItem) {
        this.listOfItem = listOfItem;
    }

    public double getTotal() {

        for (Item item : listOfItem) {

            this.total = this.total + item.getPrice();
        }

        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // methods

    public void addItem(Item item) {

        this.listOfItem.add(item);

    }

    public void removeItem(Item item) {
        this.listOfItem.remove(item);
    }

    public String printDetail() {

        String detail = "Detail:\n";

        for (Item item : this.listOfItem) {

            detail += "-" + item.getName() + "\t" + item.getPrice() + "\n";

            if (item.getOffer() != null) {
                for (Item offer : item.getOffer()) {
                    detail += "\t-" + offer.getName() + "\t" + offer.getPrice()
                            + "\n";
                }

            }

        }

        return detail;

    }

    public String toString() {
        return "total:" + total + " OrderId:" + orderId;
    }

}