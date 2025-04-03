class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person copyPerson) {
        this.name = copyPerson.name;
        this.age = copyPerson.age;
    }

    public void display() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ruchi", 22);
        p1.display();

        Person p2 = new Person(p1);
        p2.display();
    }
}
