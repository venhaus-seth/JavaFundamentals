public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item("mocha", 2.99);
        Item item2 = new Item("Latte", 3.50);
        Item item3 = new Item("Drip", 2.50);
        Item item4 = new Item("Capucino", 4.00);

        Order order1 = new Order();
        order1.addItem(item3);
        order1.addItem(item2);
        order1.isReady(order1);
        Order order2 = new Order("Jimmy");
        order2.addItem(item1);
        order2.addItem(item4);
        order2.isReady(order2);
        Order order3 = new Order("Noah");
        order3.addItem(item4);
        order3.addItem(item4);
        Order order4 = new Order("Sam");
        order4.addItem(item2);
        order4.addItem(item2);
        order4.addItem(item4);

        order1.display();
        order2.display();
        order3.display();
        order4.display();
    }
}
