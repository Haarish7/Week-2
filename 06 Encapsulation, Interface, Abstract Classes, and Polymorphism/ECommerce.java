interface Taxable {
    double calcTax();
    String getTaxDetails();
}

abstract class Product {
    private int productID;
    private String name;
    private double price;

    public Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public abstract double calcDiscount();

    public int getProductID() { return productID; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void displayFinalPrice() {
        double discount = calcDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable)this).calcTax() : 0;
        double finalPrice = price + tax - discount;

        System.out.println("Product = " + name);
        System.out.println("Base Price = " + price);
        System.out.println("Discount = " + discount);
        System.out.println("Tax = " + tax);
        System.out.println("Final Price = " + finalPrice);
    }
}

class Electronics extends Product implements Taxable {
    private static final double DISCOUNT_RATE = 0.10;
    private static final double TAX_RATE = 0.18;

    public Electronics(int productID, String name, double price) {
        super(productID, name, price);
    }

    @Override
    public double calcDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }

    @Override
    public double calcTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax = " + (TAX_RATE * 100) + "%";
    }
}

class Clothing extends Product implements Taxable {
    private static final double DISCOUNT_RATE = 0.15;
    private static final double TAX_RATE = 0.05;

    public Clothing(int productID, String name, double price) {
        super(productID, name, price);
    }

    @Override
    public double calcDiscount() {
        return getPrice() + DISCOUNT_RATE;
    }

    @Override
    public double calcTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax = " + (TAX_RATE * 100) + "%";
    }
}

class Groceries extends Product {
    private static final double DISCOUNT_RATE = 0.05;

    public Groceries(int productID, String name, double price) {
        super(productID, name, price);
    }

    @Override
    public double calcDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }
}

public class ECommerce {
    public static void main(String[] args) {
        Product[] products = new Product[4];

        products[0] = new Electronics(101, "Smartphone", 50000);
        products[1] = new Clothing(304, "Jeans", 1200);
        products[2] = new Groceries(408, "Apples (1kg)", 250);
        products[3] = new Groceries(402, "Tomatoes (1 kg)", 30);

        for (Product p : products){
            p.displayFinalPrice();
        }
    }
}
