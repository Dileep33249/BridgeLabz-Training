import java.util.*;

class Product {
    String name;
    double price, rating, discount;

    Product(String n, double p, double r, double d) {
        name = n; price = p; rating = r; discount = d;
    }

    public String toString() {
        return name + " Price:" + price + " Rating:" + rating + " Discount:" + discount;
    }
}

public class ECommerceSorting {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 800, 4.5, 10));
        products.add(new Product("Phone", 500, 4.7, 15));
        products.add(new Product("Tablet", 300, 4.3, 5));

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by price: " + products);

        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("Sorted by rating: " + products);
    }
}