package ShoppingCart;

public class Test2 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Item item1 = new Item("vaso", 1, 12.3);
        Item item2 = new Item("plato", 2, 6);
        Item item3 = new Item("cuchillo", 3, 11);
        Item item4 = new Item("tenedor", 4, 11);
        Item item5 = new Item("cuchara", 5, 5.7);
        Item item6 = new Item("mantel", 6, 33.99);

        Item promo1 = new Item("Promo Enero", 7, 15);

        promo1.add(item1);
        promo1.add(item4);
        promo1.add(item5);

        Item promo2 = new Item("Promo Febrero", 8, 28);

        promo2.add(item2);
        promo2.add(item3);
        promo2.add(item6);

        Order order1 = new Order();

        order1.addItem(item1);
        order1.addItem(item3);
        order1.addItem(promo1);

        Client client1 = new Client("ger@ger", 1, "German", "Martinez", "33333");

        Payment creditCard = new CreditCardPayment(12134, "German Martinez");

        Payment cashPayment = new CashPayment();

        Cart cart1 = new Cart(order1, client1, cashPayment, 1);

        System.out.println(cart1.getOrder().printDetail());

        System.out.println("Total:" + cart1.getOrder().getTotal());

        System.out.println(cart1.processPayment());

        System.out.println(PaymentId.getInstance().getId());

        cart1.setPayment(creditCard);

        System.out.println(cart1.processPayment());

        System.out.println(PaymentId.getInstance().getId());

        System.out.println(cart1.processPayment());

        System.out.println(PaymentId.getInstance().getId());

        cart1.setPayment(creditCard);

    }

}
