class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void disDetails() {
        System.out.println("Book Details");
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Price = " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Fault in Our Stars", "John Green", 500);
        book.disDetails();
    }
}
