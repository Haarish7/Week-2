class Order {
    String orderID;
    String orderDate;

    Order(String orderID, String orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed";
    }

    void display() {
        System.out.println("Order ID = " + orderID);
        System.out.println("Order Date = " + orderDate);
        System.out.println("Status = " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    String trackingNum;

    ShippedOrder(String orderID, String orderDate, String trackingNum) {
        super(orderID, orderDate);
        this.trackingNum = trackingNum;
    }

    String getOrderStatus() {
        return "Order shipped";
    }

    @Override
    void display() {
        super.display();
        System.out.println("Tracking Num = " + trackingNum);
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderID, String orderDate, String trackingNum, String deliveryDate) {
        super(orderID, orderDate, trackingNum);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order delivered";
    }

    @Override
    void display() {
        super.display();
        System.out.println("Delivery Date = " + deliveryDate);
    }
}

public class OnlineRetailSystem {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder("ORD123", "2025-04-01", "TRK456", "2025-04-09");
        order.display();
    }
}
