class Person1 {
    String name;
    int id;

    Person1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("ID = " + id);
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person1 implements Worker {
    String speciality;

    Chef(String name, int id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }

    public void performDuties() {
        System.out.println("Preparing and cooking meals");
        System.out.println("Specialty = " + speciality);
    }
}

class Waiter extends Person1 implements Worker {
    int tableCount;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Serving customers at " + tableCount + " tables");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Ruchi", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Vandit", 109, 5);

        chef.display();
        chef.performDuties();

        waiter.display();
        waiter.performDuties();
    }
}
