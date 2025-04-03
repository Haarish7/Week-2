class Device {
    String deviceID;
    String status;

    Device(String deviceID, String status) {
        this.deviceID = deviceID;
        this.status = status;
    }

    void display() {
        System.out.println("Device ID = " + deviceID);
        System.out.println("Status = " + status);
    }
}

class Thermostat extends Device {
    double tempSetting;

    Thermostat(String deviceID, String status, double tempSetting) {
        super(deviceID, status);
        this.tempSetting = tempSetting;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Temperature Setting = " + tempSetting + "°C");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("TH-001", "Online", 22.5);
        t1.display();
    }
}
