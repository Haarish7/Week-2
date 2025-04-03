class Book {
    private static String libName = "National Library";
    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void disLibName() {
        System.out.println("Library Name = " + libName);
    }

    public void disBook() {
        if (this instanceof Book) {
            System.out.println("Title = " + this.title);
            System.out.println("Author = " + this.author);
            System.out.println("ISBN = " + this.isbn);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "9780061122415");
        Book b2 = new Book("1984", "George Orwell", "9780451524935");

        disLibName();
        b1.disBook();
        b2.disBook();
    }
}
