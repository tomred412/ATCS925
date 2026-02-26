package Ch8ClassesAndObjects.BankAccount;

public class BankAccountV1 {
    private String firstName, lastName, ssn, address, phoneNumber, language;
    private int accountNum, pin, dob;
    private double balance;
    private static int numberOfAccounts; //static fields reside only at the class level -> a local copy of this field will not exist in each object.

    public BankAccountV1(String firstName, String lastName, String ssn, String address, String phoneNumber, int pin, int dob) {
        ++numberOfAccounts; //gives executives access to the number of accounts
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.language = "English";
        this.accountNum = numberOfAccounts;
        this.pin = pin;
        this.dob = dob;
        this.balance = 0.0;
    }

    //getters -> all except SSN and PIN
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static int getNumberOfAccounts() { //no objects will have access to numberOfAccounts, only for internal purposes
        return numberOfAccounts;
    }

    public int getDob() {
        return this.dob;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public void setPin(int newPin) {
        this.pin = newPin;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public String toString() {
        return firstName + " " + lastName + "\n" + address + "\n" + "Your current balance is: " + balance;
    }

}
