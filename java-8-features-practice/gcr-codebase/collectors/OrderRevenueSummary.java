
import java.util.*;
import java.util.stream.*;

class Order {
    private String customerName;
    private double totalAmount;

    public Order(String customerName, double totalAmount) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
            new Order("Ravi", 1200),
            new Order("Ravi", 800),
            new Order("Anita", 1500)
        );

        Map<String, Double> revenue =
            orders.stream()
                .collect(Collectors.groupingBy(
                    Order::getCustomerName,
                    Collectors.summingDouble(Order::getTotalAmount)
                ));

        System.out.println(revenue);
    }
}
