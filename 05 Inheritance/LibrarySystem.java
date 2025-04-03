class Book {
    String title;
    int pubYear;

    Book(String title, int pubYear) {
        this.title = title;
        this.pubYear = pubYear;
    }

    void display() {
        System.out.println("Title = " + title);
        System.out.println("Publication Year = " + pubYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int pubYear, String name, String bio) {
        super(title, pubYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Author Name = " + name);
        System.out.println("Bio = " + bio);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Author book = new Author(
                "The Art of Java",
                2022,
                "John Doe",
                "John is a seasoned software developer with 15 years of experience"
        );

        book.display();
    }
}
