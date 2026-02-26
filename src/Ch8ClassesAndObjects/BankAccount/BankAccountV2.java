package Ch8ClassesAndObjects.BankAccount;

public class BankAccountV2 {
    private String firstName, lastName, middleName, ssn, phoneNumber, language, email;
    private Address address;
    private int accountNum, pin, userID;
    private Dob dob;
    private double balance;
    private static int numberOfAccounts; //static fields reside only at the class level -> a local copy of this field will not exist in each object.
    boolean isCitizen;

    public BankAccountV2(String firstName, String lastName, String middleName, String ssn, Address address, String phoneNumber, int pin, Dob dob, String email, boolean isCitizen) {
        ++numberOfAccounts; //gives executives access to the number of accounts
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.language = "English";
        this.accountNum = numberOfAccounts;
        this.pin = pin;
        this.dob = dob;
        this.balance = 0.0;
        this.email = email;
        this.isCitizen = isCitizen;
    }

    //getters -> all except SSN and PIN
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static int getNumberOfAccounts() { //no objects will have access to numberOfAccounts, only for internal purposes
        return numberOfAccounts;
    }

    public Dob getDob() {
        return dob;
    }

    public double getBalance() {
        return balance;
    }

    public void setAddress(Address newAddress) {
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
