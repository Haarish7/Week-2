class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Ruchi";
        roomType = "Suite";
        nights = 3;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking copyHB) {
        this.guestName = copyHB.guestName;
        this.roomType = copyHB.roomType;
        this.nights = copyHB.nights;
    }

    public void display() {
        System.out.println("Guest Name = " + guestName);
        System.out.println("Room Type = " + roomType);
        System.out.println("Nights = " + nights);
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        h1.display();

        HotelBooking h2 = new HotelBooking("Vandit", "Regular", 1);
        h2.display();

        HotelBooking h3 = new HotelBooking(h2);
        h3.display();

    }
}
