import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderID;
    private List<Product> products;

    public Order(int orderID) {
        this.orderID = orderID;
        this.products = new ArrayList<>();
    }

    public int getOrderID() {
        return orderID;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added " + product.getName() + " to Order #" + orderID);
    }

    public double calcTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void disOrder() {
        System.out.println("Order #" + orderID + " contains:");
        for (Product p : products) {
            System.out.println("- " + p.getName() + " | ₹" + p.getPrice());
        }
        System.out.println("Total Amount = ₹" + calcTotal());
    }
}

class Cust {
    private String name;
    private List<Order> orders;

    public Cust(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order #" + order.getOrderID());
    }

    public void showOrders() {
        System.out.println("Orders placed for customer = " + name);
        for (Order o : orders) {
            o.disOrder();
        }
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        Product p1 = new Product("Toilet Paper", 200);
        Product p2 = new Product("Milk", 16);
        Product p3 = new Product("Laptop", 50000);

        Cust c1 = new Cust("Ruchi");

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);
        o1.addProduct(p2);

        c1.placeOrder(o1);

        Order o2 = new Order(102);
        o2.addProduct(p3);

        c1.placeOrder(o2);
        c1.showOrders();
    }
}
