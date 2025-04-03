import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calcTotalCost(int quantity) {
        return (double) quantity * price;
    }

    public void disDetails() {
        System.out.println("Item Details");
        System.out.println("Item Code = " + itemCode);
        System.out.println("Item Name = " + itemName);
        System.out.println("Price = " + price);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Item item1 = new Item(101, "Paper towel", 200);
        item1.disDetails();

        System.out.print("Enter quantity = ");
        int quantity = scn.nextInt();
        System.out.println("Total Cost = " + item1.calcTotalCost(quantity));

        scn.close();
    }
}
