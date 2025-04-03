interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String name;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void display() {
        System.out.println("Item = " + name);
        System.out.println("Price = " + price);
        System.out.println("Quantity = " + quantity);
    }

    public abstract double calcTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calcTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = (getPrice() * getQuantity()) * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied = " + String.format("%.2f", discount);
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private final double nonVegCharge = 2.0;

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calcTotalPrice() {
        return (getPrice() * getQuantity() + nonVegCharge) - discount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = (getPrice() * getQuantity()) * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied = " + String.format("%.2f", discount) + " | Non-Veg Charge = " + nonVegCharge;
    }
}

public class FoodDeliverySystem {
    public static void processOrder(FoodItem item) {
        item.display();
        if (item instanceof Discountable) {
            Discountable d = (Discountable) item;
            d.applyDiscount(10);
            System.out.println(d.getDiscountDetails());
        }
        System.out.println("Total Price = " + String.format("%.2f", item.calcTotalPrice()));
    }

    public static void main(String[] args) {
        FoodItem[] items = new FoodItem[3];
        items[0] = new VegItem("Paneer Butter Masala", 250, 2);
        items[1] = new NonVegItem("Chicken Biryani", 110, 1);
        items[2] = new VegItem("Veg Burger", 90, 3);

        for (FoodItem item : items) {
            processOrder(item);
        }
    }
}
