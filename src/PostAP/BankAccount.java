package PostAP;

public class BankAccount {
    // 1. Instance Variables
    private String name;
    private double balance;

    // 2. Constructor
    public BankAccount(String name,
                       double startBal) {
        this.name = name;
        this.balance = startBal;
    }

    // 3. Deposit Method
    public void deposit(double
                                amount) {
        this.balance += amount;
    }

    // 4. Print Method
    public void printInfo() {
        System.out.println(this.name
                +
                " has $" + this.balance);
    }
}