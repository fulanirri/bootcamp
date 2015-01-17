package ShoppingCart;

public class TestCart {

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

        // System.out.println(promo1+"\n--------------");
        //
        // for(Item item : promo1.getOffer()){
        // System.out.println(item);
        // }
        //
        // System.out.println("----------------------------");
        //
        // System.out.println(promo2+"\n--------------");
        //
        // for(Item item : promo2.getOffer()){
        // System.out.println(item);
        // }

        Order order1 = new Order();

        order1.addItem(item6);
        order1.addItem(item5);
        order1.addItem(item3);
        order1.addItem(promo1);

        System.out.println(order1.printDetail());

    }

}
