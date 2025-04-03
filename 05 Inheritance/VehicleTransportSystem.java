import javax.sound.midi.Soundbank;

class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void display() {
        System.out.println("Max Speed = " + maxSpeed + " km/h");
        System.out.println("Fuel Type = " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCap;

    Car(int maxSpeed, String fuelType, int seatCap) {
        super(maxSpeed, fuelType);
        this.seatCap = seatCap;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Vehicle Type = Car");
        System.out.println("Seat Capacity = " + seatCap);
    }
}

class Truck extends Vehicle {
    double loadCap;

    Truck(int maxSpeed, String fuelType, double loadCap) {
        super(maxSpeed, fuelType);
        this.loadCap = loadCap;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Vehicle Type = Truck");
        System.out.println("Load capacity = " + loadCap + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasGear;

    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Vehicle Type = Motorcycle");
        System.out.println("Has Gear = " + (hasGear ? "Yes" : "No"));
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10.5);
        vehicles[2] = new Motorcycle(150, "Petrol", true);

        for (Vehicle v : vehicles) {
            v.display();
        }
    }
}
