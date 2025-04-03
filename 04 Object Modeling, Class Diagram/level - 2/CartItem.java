import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuan(int amt) {
        this.quantity += amt;
    }

    public void decreaseQuan(int amt){
        this.quantity -= amt;
    }

    public boolean isEmpty() {
        return quantity <= 0;
    }

    public String toString() {
        return itemName + " - Rs " + price + " x " + quantity + " = Rs " + getTotalCost();
    }
}

class ShoppingCart {
    List<CartItem> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addItem(String itemName, double price, int quantity) {
        for (CartItem item : cart) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.increaseQuan(quantity);
                return;
            }
        }
        cart.add(new CartItem(itemName, price, quantity));
    }

    public void removeItem(String itemName, int quantity) {
        Iterator<CartItem> iterator = cart.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.decreaseQuan(quantity);
                if (item.isEmpty()) {
                    iterator.remove();
                }
                return;
            }
        }
        System.out.println("Item not found in cart");
    }

    public void disCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart empty");
            return;
        }
        System.out.println("Cart Items:");
        for (CartItem item : cart){
            System.out.println(item);
        }
        System.out.println("Total cost = Rs " + getTotalCost());
    }

    public double getTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalCost();
        }
        return total;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 200, 4);
        cart.addItem("Chips", 40, 3);
        cart.disCart();

        cart.removeItem("Apple", 2);
        cart.disCart();

        cart.removeItem("chips", 1);
        cart.disCart();
    }
}
