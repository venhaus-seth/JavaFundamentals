import java.util.ArrayList;

public class Order {
    private String name;
    // private double total;
    private boolean ready;
    private ArrayList<Item> items;
    
    public String getName() {
        return name;
    }
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void isReady(Order order) {
        order.ready = true;
    }

    public String getStatusMessage() {
        String ready = "Your order is ready.";
        String notReady = "Thank you for waiting. Your order will be ready soon.";
        return this.ready ? ready : notReady;
    }
    public double getOrderTotal() {
        double total = 0.00;
        for (int i=0; i<this.items.size();i++) {
            total += this.items.get(i).getPrice();
        }
        return total;
    }
    public void display() {
        System.out.printf("Name: %s\n", this.getName());
        System.out.printf("Total: %s\n", this.getOrderTotal());
        System.out.printf("Ready: %s\n", this.getStatusMessage());
    }
}
