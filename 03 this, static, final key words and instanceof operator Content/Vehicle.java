class Vehicle {
    private static double regFee = 10000;
    private String ownerName;
    private String vehicleType;
    private final String regNum;

    public Vehicle(String ownerName, String vehicleType, String regNum) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.regNum = regNum;
    }

    public static void updRegFee(double newFee) {
        regFee = newFee;
    }

    public void disReg() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name = " + this.ownerName);
            System.out.println("Vehicle Type = " + this.vehicleType);
            System.out.println("Registration Num = " + this.regNum);
            System.out.println("Registration Fee = " + regFee);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ruchi", "Bike", "GJ12RS1234");
        Vehicle v2 = new Vehicle("Vandit", "Car", "DQ45VS5678");

        v1.disReg();
        v2.disReg();

        updRegFee(20500);
        System.out.println("Updating Registration Fees");

        v1.disReg();
        v2.disReg();
    }
}
