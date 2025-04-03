class MovieTicket {
    String movieName;
    int seatNum;
    double price;
    boolean isBooked;

    public MovieTicket(String movieName, int seatNum, double price) {
        this.movieName = movieName;
        this.seatNum = seatNum;
        this.price = price;
        this.isBooked = false;
    }

    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked for " + movieName + " at seat " + seatNum);
        } else {
            System.out.println("Seat " + seatNum + " already booked");
        }
    }

    public void disDetails() {
        if (isBooked) {
            System.out.println("Movie = " + movieName);
            System.out.println("Seat Num = " + seatNum);
            System.out.println("Price = " + price);
        } else {
            System.out.println("Seat " + seatNum + " is not booked yet");
        }
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("Inception", 12, 300);
        t1.bookTicket();
        t1.disDetails();

        MovieTicket t2 = new MovieTicket("Cars", 32, 500);
        t2.bookTicket();
        t2.disDetails();
    }
}
