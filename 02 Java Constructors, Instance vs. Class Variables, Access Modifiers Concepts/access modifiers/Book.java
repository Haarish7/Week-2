class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("ISBN = " + ISBN);
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void disEBook() {
        display();
        System.out.println("File Size = " + fileSize + " MB");
    }

    public static void main(String[] args) {
        Book book = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        book.display();

        EBook ebook = new EBook("978-1-23-456789-7", "Advanced Java", "Jane Smith", 5.4);
        ebook.disEBook();
    }
}

