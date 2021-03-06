package ShoppingCart;

public class Cart {

    private Order order;
    private Client client;
    private double totalToPay;
    private Payment payment;
    private int cartId;

    // Constructor
    public Cart(Order order, Client client, Payment payment, int cartId) {
        this.order = order;
        this.client = client;
        this.totalToPay = totalToPay;
        this.payment = payment;
        this.cartId = cartId;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    // Getters & Setters
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    // Methods

    public String processPayment() {

        PaymentId.getInstance().newId();

        return this.payment.pay(order);

    }

    public String toString() {

        return "CartId:" + cartId + " payment Method:" + payment.toString();

    }

}
