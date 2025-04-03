interface Reservable {
    void reserveItem(String borrowName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemID;
    private String title;
    private String author;
    private boolean isReserved;
    private String borrower;

    public LibraryItem(String itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrower = null;
    }

    public String getItemID() { return itemID; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    protected void setBorrower(String borrower) {
        this.borrower = borrower;
        this.isReserved = borrower != null;
    }

    public String getBorrower() {
        return borrower != null ? borrower : "Not reserved";
    }

    public boolean isReserved() { return isReserved; }

    public abstract int getLoanDuration();

    public void getDetails() {
        System.out.println("Item ID = " + getItemID());
        System.out.println("Title = " + getTitle());
        System.out.println("Author = " + getAuthor());
        System.out.println("Borrower = " + getBorrower());
    }
}

class Book extends LibraryItem implements Reservable {
    public Book(String itemID, String title, String author) {
        super(itemID, title, author);
    }

    public int getLoanDuration() { return 21; }

    public void reserveItem(String borrowName) {
        if (!isReserved()) {
            setBorrower(borrowName);
            System.out.println(borrowName + " has reserved " + getTitle());
        } else {
            System.out.println("Book is already reserved");
        }
    }

    public boolean checkAvailability() {
        return !isReserved();
    }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemID, String title, String author) {
        super(itemID, title, author);
    }

    public int getLoanDuration() { return 7; }

    public void reserveItem(String borrowName) {
        if (!isReserved()) {
            setBorrower(borrowName);
            System.out.println(borrowName + " has reserved " + getTitle());
        } else {
            System.out.println("Magazine is already reserved");
        }
    }

    public boolean checkAvailability() {
        return !isReserved();
    }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(String itemID, String title, String author) {
        super(itemID, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrowName) {
        if (!isReserved()) {
            setBorrower(borrowName);
            System.out.println(borrowName + " has reserved " + getTitle());
        } else {
            System.out.println("DVD is already reserved");
        }
    }

    public boolean checkAvailability() {
        return !isReserved();
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("B001", "The Alchemist", "Paulo Coelho");
        items[1] = new Magazine("M002", "National Geographic", "Various");
        items[2] = new DVD("D003", "Inception", "Christopher Nolan");

        for (LibraryItem item : items) {
            item.getDetails();
            System.out.println("Loan Duration = " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                r.reserveItem("Ruchi");
                System.out.println("Available = " + r.checkAvailability());
            }
        }
    }
}
