package Ch8ClassesAndObjects.BankAccount;

public class BankAccountV1Client {
    public static void main(String[] args) {
        BankAccountV1 dermot = new BankAccountV1("Dermot", "Lu", "123-45-6789", "123 Main Street, Scarsdale, NY 10583", "888-888-8888", 8888, 4122010);
        System.out.println(dermot.getBalance());
        dermot.deposit(1000);
        System.out.println(dermot.getBalance());
        dermot.withdraw(200);
        System.out.println(dermot.getBalance());
        System.out.println(dermot); //the object's toString method is called implicitly, DO NOT explicitly call the toString method
    }
}
