class BankAccount {
    private static String bankName = "ICICI";
    private static int totalAcc = 0;
    private final int accNum;
    private String accHolder;
    private double balance;

    public BankAccount(String accHolder, int accNum, double balance) {
        this.accHolder = accHolder;
        this.accNum = accNum;
        this.balance = balance;
        totalAcc++;
    }

    public static void getTotalAcc() {
        System.out.println("Total Bank Accounts = " + totalAcc);
    }

    public void disAcc() {
        if (this instanceof BankAccount) {
            System.out.println("Bank name = " + bankName);
            System.out.println("Account Holder = " + this.accHolder);
            System.out.println("Account Num = " + this.accNum);
            System.out.println("Balance = " + this.balance);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ruchi Shah", 387, 10000);
        BankAccount acc2 = new BankAccount("Vandit", 154, 20000);

        acc1.disAcc();
        acc2.disAcc();
        getTotalAcc();
    }
}
