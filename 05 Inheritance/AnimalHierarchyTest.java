class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes sound");
    }

    void display() {
        System.out.println("Name = " + name + ", Age = " + age);
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Bird chirps");
    }
}

public class AnimalHierarchyTest {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);

        dog.display();
        dog.makeSound();
        cat.display();
        cat.makeSound();
        bird.display();
        bird.makeSound();
    }
}
