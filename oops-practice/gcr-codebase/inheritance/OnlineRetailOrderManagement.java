package com.inhertence;
import java.time.LocalDate;

class Order {
    int orderId;
    LocalDate orderDate;

    Order(int orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    LocalDate deliveryDate;

    DeliveredOrder(int orderId, LocalDate orderDate,
                   String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {

        Order order = new DeliveredOrder(
                101,
                LocalDate.of(2025, 1, 10),
                "  TRK12345",
                LocalDate.of(2025, 1, 15)
        );

        System.out.println("Order ID: " + order.orderId);
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}
