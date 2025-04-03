interface Insurable {
    double calcInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNum;
    private String type;
    private double rentalRate;
    private String insPolNum;

    public Vehicle(String vehicleNum, String type, double rentalRate, String insPolNum) {
        this.vehicleNum = vehicleNum;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insPolNum = insPolNum;
    }

    public abstract double calcRentalCost(int days);

    public String getVehicleNum() { return vehicleNum; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    protected String getInsPolNum() { return insPolNum; }

    public void displayRental(int days) {
        System.out.println("Vehicle = " + type + " | Number = " + vehicleNum);
        System.out.println("Rental Rate (per day) = " + rentalRate);
        System.out.println("Rental for " + days + " days = " + calcRentalCost(days));

        if (this instanceof Insurable) {
            System.out.println(((Insurable)this).getInsuranceDetails());
            System.out.println("Insurance Cost = " + ((Insurable)this).calcInsurance());
        }
    }
}

class Car extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.10;

    public Car(String vehicleNum, double rentalRate, String insPolNum) {
        super(vehicleNum, "Car", rentalRate, insPolNum);
    }

    @Override
    public double calcRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calcInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy = " + getInsPolNum();
    }
}

class Bike extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.05;

    public Bike(String vehicleNum, double rentalRate, String insPolNum) {
        super(vehicleNum, "Bike", rentalRate, insPolNum);
    }

    @Override
    public double calcRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calcInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy = " + getInsPolNum();
    }
}

class Truck extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.15;

    public Truck(String vehicleNum, double rentalRate, String insPolNum) {
        super(vehicleNum, "Truck", rentalRate, insPolNum);
    }

    @Override
    public double calcRentalCost(int days) {
        double base = getRentalRate() * days;
        return base + 50;
    }

    @Override
    public double calcInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy = " + getInsPolNum();
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] fleet = new Vehicle[3];
        fleet[0] = new Car("CAR123", 50, "C-INS-987");
        fleet[1] = new Bike("BIK456", 20, "B-INS-654");
        fleet[2] = new Truck("TRK789", 100, "T-INS-321");

        int daysToRent = 5;

        for (Vehicle v : fleet) {
            v.displayRental(daysToRent);
        }
    }
}
