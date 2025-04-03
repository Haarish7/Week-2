import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void disBook() {
        System.out.println("Title = " + title + ", Author = " + author);
    }
}

class Library {
    String libName;
    ArrayList<Book> books;

    Library(String libName) {
        this.libName = libName;
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Books in " + libName + ":");
        for (Book book : books) {
            book.disBook();
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book b3 = new Book("Pride and Prejudice", "Jane Austen");

        Library lib1 = new Library("National Library");
        Library lib2 = new Library("Central Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b1);
        lib2.addBook(b3);

        lib1.showBooks();
        lib2.showBooks();
    }
}

