import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil cafeBot = new CafeUtil();
        // System.out.println(cafeBot.getStreakGoal(10));

        // double[] orders = {3.99, 5.50, 2.75};
        // System.out.println(cafeBot.getOrderTotal(orders));

        // ArrayList<String> menu = new ArrayList<String>();
        // menu.add("Latte");
        // menu.add("Cappacino");
        // menu.add("Americano");
        // menu.add("Green Tea");
        // cafeBot.displayMenu(menu);
        
        // ArrayList<String> customerList = new ArrayList<String>();
        // System.out.println(customerList);

        // String newCustomer1 = cafeBot.addCustomer(customerList);
        // customerList.add(newCustomer1);
        // String newCustomer2 = cafeBot.addCustomer(customerList);
        // customerList.add(newCustomer2);
        // String newCustomer3 = cafeBot.addCustomer(customerList);
        // customerList.add(newCustomer3);
        // System.out.println(customerList);
        String product = "latte";
        double price = 5.00;
        int amount = 5;
        cafeBot.printPriceChart(product, price, amount);
    }
}
