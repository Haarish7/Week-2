interface GPS {
    String getCurrLoc();
    void updateLoc(String loc);
}

abstract class Vehicle1 implements GPS {
    private String vehicleID;
    private String driverName;
    private double ratePerKM;
    private String currLoc;

    public Vehicle1(String vehicleID, String driverName, double ratePerKM) {
        this.vehicleID = vehicleID;
        this.driverName = driverName;
        this.ratePerKM = ratePerKM;
        this.currLoc = "Unknown";
    }

    public String getVehicleID() { return vehicleID; }
    public String getDriverName() { return driverName; }
    public double getRatePerKM() { return ratePerKM; }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID = " + vehicleID);
        System.out.println("Driver = " + driverName);
        System.out.println("Rate/KM = " + ratePerKM);
        System.out.println("Location = " + currLoc);
    }

    public abstract double calcFare(double distance);

    public String getCurrLoc() { return currLoc; }

    public void updateLoc(String loc) {
        this.currLoc = loc;
    }
}

class Car1 extends Vehicle1 {
    public Car1(String vehicleID, String driverName) {
        super(vehicleID, driverName, 12.0);
    }

    @Override
    public double calcFare(double distance) {
        return distance * getRatePerKM();
    }
}

class Bike1 extends Vehicle1 {
    public Bike1(String vehicleID, String driverName) {
        super(vehicleID, driverName, 6.0);
    }

    @Override
    public double calcFare(double distance) {
        return distance * getRatePerKM();
    }
}

class Auto extends Vehicle1 {
    public Auto(String vehicleID, String driverName) {
        super(vehicleID, driverName, 8.0);
    }

    @Override
    public double calcFare(double distance) {
        return distance * getRatePerKM();
    }
}

public class RideHailingApp {
    public static void processRide(Vehicle1 vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Distance = " + distance + " km");
        System.out.println("Fare = " + String.format("%.2f", vehicle.calcFare(distance)));
    }

    public static void main(String[] args) {
        Vehicle1 car = new Car1("CAR001", "Ruchi");
        Vehicle1 bike = new Bike1("BIKE002", "Vandit");
        Vehicle1 auto = new Auto("AUTO003", "Bhadrik");

        car.updateLoc("Delhi");
        bike.updateLoc("Mumbai");
        auto.updateLoc("Bangalore");

        processRide(car, 15.5);
        processRide(bike, 8.2);
        processRide(auto, 10);
    }
}
