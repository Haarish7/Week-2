class MobilePhone {
    String brand;
    String model;
    double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public  void disDetails() {
        System.out.println("Mobile phone details");
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("Price = " + price);
    }

    public static void main(String[] args) {
        MobilePhone mp1 = new MobilePhone("Samsung", "S24", 65000);
        MobilePhone mp2 = new MobilePhone("Apple", "Iphone 16", 89000);

        mp1.disDetails();
        mp2.disDetails();
    }
}
