class CarRental {
    String custName;
    String carModel;
    int rentalDays;
    double dailyRate;

    public CarRental(String custName, String carModel, int rentalDays, double dailyRate) {
        this.custName = custName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calcTotalCost() {
        return rentalDays * dailyRate;
    }

    public void display() {
        System.out.println("Customer Name = " + custName);
        System.out.println("Car Model = " + carModel);
        System.out.println("Rental Days = " + rentalDays);
        System.out.println("Daily Rate = " + dailyRate);
        System.out.println("Total Cost = " + calcTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Ruchi", "Honda Civic", 7, 500);
        rental.display();
    }
}
