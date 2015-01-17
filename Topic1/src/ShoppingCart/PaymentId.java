package ShoppingCart;

public class PaymentId {

    private static PaymentId instance = null;

    private int id = 0;

    private PaymentId() {

    }

    public static PaymentId getInstance() {
        if (instance == null) {

            PaymentId.instance = new PaymentId();

        }

        return instance;
    }

    public int getId() {
        return id;
    }

    public void newId() {

        this.id = this.getId() + 1;

    }

}
