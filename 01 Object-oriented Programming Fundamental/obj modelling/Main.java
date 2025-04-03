import java.util.ArrayList;

class Bank {
    String bankName;
    ArrayList<Customer> customers;

    Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    void openAcc(Customer customer, double initialDep) {
        customer.setBank(this);
        customer.setBalance(initialDep);
        customers.add(customer);
        System.out.println("Account opened for " + customer.name + " in " + bankName);
    }

    void disCust() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.name);
        }
    }
}

class Customer {
    String name;
    double balance;
    Bank bank;

    Customer(String name) {
        this.name = name;
    }

    void setBank(Bank bank) {
        this.bank = bank;
    }

    void setBalance(double amt) {
        this.balance = amt;
    }

    void viewBank() {
        if (bank != null) {
            System.out.println(name + " has balance of INR " + balance + " in " + bank.bankName);
        } else {
            System.out.println(name + " has no bank account");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank("City Bank");
        Customer c1 = new Customer("Ruchi");
        Customer c2 = new Customer("Vandit");

        b1.openAcc(c1, 10000);
        b1.openAcc(c2, 6000);

        c1.viewBank();
        c2.viewBank();

        b1.disCust();
    }
}