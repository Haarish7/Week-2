class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void disProductDetails() {
        System.out.println("Product Name = " + productName);
        System.out.println("Price = " + price);
    }

    public static void disTotalProducts() {
        System.out.println("Total products created = " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Smartphone", 30000);

        p1.disProductDetails();
        p2.disProductDetails();
        Product.disTotalProducts();
    }
}
