public class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void disDetails(){
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Price = " + price);
    }

    public static void main(String[] args) {
        Book defaultB = new Book();
        defaultB.disDetails();

        Book customB = new Book("Fault in Our Stars", "John Green", 300);
        customB.disDetails();
    }
}
