interface Loanable {
    void applyForLoan(double amount);
    boolean calcLoanEligibility();
}

abstract class BankAcc {
    private String accNum;
    private String holderName;
    private double balance;

    public BankAcc(String accNum, String holderName, double balance) {
        this.accNum = accNum;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccNum() { return accNum; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    protected abstract double calcInterest();

    public void display() {
        System.out.println("Account Number = " + accNum);
        System.out.println("Holder Name = " + holderName);
        System.out.println("Balance = " + balance);
    }
}

class SavingsAcc extends BankAcc implements Loanable {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAcc(String accNum, String holderName, double balance) {
        super(accNum, holderName, balance);
    }

    public double calcInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for loan of " + amount);
    }

    @Override
    public boolean calcLoanEligibility() {
        return getBalance() >= 5000;
    }
}

class CurrentAcc extends BankAcc implements Loanable {
    private static final double INTEREST_RATE = 0.02;

    public CurrentAcc(String accNum, String holderName, double balance) {
        super(accNum, holderName, balance);
    }

    public double calcInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for loan of " + amount);
    }

    @Override
    public boolean calcLoanEligibility() {
        return getBalance() >= 10000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAcc[] accounts = new BankAcc[2];

        accounts[0] = new SavingsAcc("SAV123", "Ruchi", 6000);
        accounts[1] = new CurrentAcc("CUR456", "Vandit", 12000);


        for (BankAcc acc : accounts) {
            acc.display();
            acc.deposit(500);
            acc.withdraw(1000);
            double interest = acc.calcInterest();
            System.out.println("Interest = " + interest);

            if (acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                l.applyForLoan(3000);
                System.out.println("Loan Eligibility = " + l.calcLoanEligibility());
            }
        }
    }
}
