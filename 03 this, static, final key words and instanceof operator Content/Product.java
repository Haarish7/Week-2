class Product {
    private static double discount = 10.0;
    private final int productID;
    private String name;
    private double price;
    private int quantity;

    public Product(int productID, String name, double price, int quantity) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDis(double newDis) {
        discount = newDis;
    }

    public void disProd() {
        if (this instanceof Product) {
            System.out.println("Product ID = " + this.productID);
            System.out.println("Product Name = " + this.name);
            System.out.println("Price = " + this.price);
            System.out.println("Quantity = " + this.quantity);
            System.out.println("Discount = " + discount + "%");
            double total = price * quantity;
            double disTotal = total - (total * discount / 100);
            System.out.println("Total after discount = " + disTotal);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Product prod1 = new Product(101, "Laptop", 50000, 2);
        Product prod2 = new Product(105, "Mouse", 500, 4);

        prod1.disProd();
        prod2.disProd();

        updateDis(15.0);
        System.out.println("Discount updated");
        prod1.disProd();
    }
}
