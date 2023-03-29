import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] orders) {
        double total = 0;
        for ( int i = 0; i < orders.length; i++) {
            total += orders[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i+1) + ": " + menuItems.get(i));
        }
    }

    public String addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");

        int customersAhead = customers.size();
        System.out.println("There are " + customersAhead + " customers ahead of you");
        return userName;
    }
    
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        double total = 0;
        double discount = 0;
        for (int i = 1; i <= maxQuantity; i++) {
            total += price;
            System.out.println(i + " - $" + (total- discount));
            discount += .5;
        }
    }
}
