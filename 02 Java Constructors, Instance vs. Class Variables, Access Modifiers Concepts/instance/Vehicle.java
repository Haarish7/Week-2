class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void disDetails() {
        System.out.println("Owner name = " + ownerName);
        System.out.println("Vehicle Type = " + vehicleType);
        System.out.println("Registration Fee = " + registrationFee);
    }

    public static void updateRegisFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ruchi", "Car");
        Vehicle v2 = new Vehicle("Vandit", "Bike");

        v1.disDetails();
        v2.disDetails();

        Vehicle.updateRegisFee(2000);

        System.out.println("After updating");

        v1.disDetails();
        v2.disDetails();
    }
}
