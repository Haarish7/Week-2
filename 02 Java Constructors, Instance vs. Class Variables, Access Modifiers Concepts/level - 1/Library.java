class Library {
    String title;
    String author;
    double price;
    boolean availability;

    public Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    public void borrow() {
        if (availability) {
            availability = false;
            System.out.println(title + " borrowed");
        } else {
            System.out.println(title + " - not available");
        }
    }

    public void display() {
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Price = " + price);
        System.out.println("Available = " + (availability ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Library b1 = new Library("To Kill a Mockingbird", "Harper Lee", 300);
        b1.display();

        b1.borrow();
        b1.display();

        b1.borrow();
    }
}


