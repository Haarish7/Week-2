class BankAcc {
    String accNum;
    double balance;

    BankAcc(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }
    void display() {
        System.out.println("Account Num = " + accNum);
        System.out.println("Balance = " + balance);
    }
}

class SavingsAcc extends BankAcc {
    double interestRate;

    SavingsAcc(String accNum, double balance, double interestRate) {
        super(accNum, balance);
        this.interestRate = interestRate;
    }

    @Override
    void display() {
        System.out.println("Account Type = Savings Account");
        super.display();
        System.out.println("Interest Rate = " + interestRate);
    }
}

class CheckingAcc extends BankAcc {
    double withdrawLimit;

    CheckingAcc(String accNum, double balance, double withdrawLimit) {
        super(accNum, balance);
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    void display() {
        System.out.println("Account Type = Checking Account");
        super.display();
        System.out.println("Withdrawal Limit = " + withdrawLimit);
    }
}

class FixedDepositAcc extends BankAcc {
    int duration;

    FixedDepositAcc(String accNum, double balance, int duration) {
        super(accNum, balance);
        this.duration = duration;
    }

    @Override
    void display() {
        System.out.println("Account Type = Fixed Deposit Account");
        super.display();
        System.out.println("Duration = " + duration + " months");
    }
}

public class BankAccount {
    public static void main(String[] args) {
        SavingsAcc savings = new SavingsAcc("SAV123", 10000, 4.5);
        CheckingAcc checking = new CheckingAcc("CHK456", 15000, 1000);
        FixedDepositAcc fd = new FixedDepositAcc("FD789", 45000, 12);

        savings.display();
        checking.display();
        fd.display();
    }
}
