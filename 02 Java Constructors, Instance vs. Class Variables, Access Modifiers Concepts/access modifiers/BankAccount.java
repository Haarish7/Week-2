class BankAccount {
    public String accNum;
    protected String accHolder;
    private double balance;

    public BankAccount(String accNum, String accHolder, double balance) {
        this.accNum = accNum;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited = " + amt);
        } else  {
            System.out.println("Invalid");
        }
    }

    public boolean withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn = " + amt);
            return true;
        } else {
            System.out.println("Insufficient balance");
            return false;
        }
    }

    public void disAcc() {
        System.out.println("Account Number = " + accNum);
        System.out.println("Account Holder = " + accHolder);
        System.out.println("Balance = " + balance);
    }
}

class SavingsAcc extends BankAccount {
    private double interestRate;

    public SavingsAcc(String accNum, String accHolder, double balance, double interestRate) {
        super(accNum, accHolder, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest Applied = " + interest);
    }

    public void disSaving() {
        System.out.println("Saving Account Details:");
        System.out.println("Account Number = " + accNum);
        System.out.println("Account Holder = " + accHolder);
        System.out.println("Interest Rate = " + interestRate + "%");
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("RS12345", "Ruchi Shah", 20000);
        acc.deposit(1000);
        acc.withdraw(5000);
        acc.disAcc();

        SavingsAcc savings = new SavingsAcc("VS98765", "Vandit", 10000, 2.5);
        savings.applyInterest();
        savings.disSaving();
    }
}
