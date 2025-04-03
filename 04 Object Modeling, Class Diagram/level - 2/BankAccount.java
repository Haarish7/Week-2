class BankAccount {
    String accHolder;
    String accNum;
    double balance;

    public BankAccount(String accHolder, String accNum, double balance) {
        this.accHolder = accHolder;
        this.accNum = accNum;
        this.balance = balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited = " + amt);
        } else {
            System.out.println("Invalid");
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdraw = " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void disBalance() {
        System.out.println("Account Holder" + accHolder);
        System.out.println("Account Number = " + accNum);
        System.out.println("Balance = " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ruchi Shah", "RS12345", 1000);
        acc.disBalance();
        acc.deposit(500);
        acc.withdraw(1000);
        acc.withdraw(700);
        acc.disBalance();
    }
}
