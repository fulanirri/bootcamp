package ShoppingCart;

public abstract class Payment {

    protected PaymentId paymentId;

    public abstract String pay(Order order);

    public abstract String toString();

}
