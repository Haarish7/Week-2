class Vehicle1 {
    String model;
    int maxSpeed;

    Vehicle1(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void display() {
        System.out.println("Model = " + model);
        System.out.println("Max Speed = " + maxSpeed);
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle1 {
    int batteryCap;

    ElectricVehicle(String model, int maxSpeed, int batteryCap) {
        super(model, maxSpeed);
        this.batteryCap = batteryCap;
    }

    void charge() {
        System.out.println("Charging battery... Capacity = " + batteryCap + " kWh");
    }
}

class PetrolVehicle extends Vehicle1 implements Refuelable {
    int fuelCap;

    PetrolVehicle(String model, int maxSpeed, int fuelCap) {
        super(model, maxSpeed);
        this.fuelCap = fuelCap;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol tank... Capacity = " + fuelCap + " litres");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 250, 75);
        PetrolVehicle honda = new PetrolVehicle("Honda Civic", 220, 45);

        tesla.display();
        tesla.charge();

        honda.display();
        honda.refuel();
    }
}
