package Ch8ClassesAndObjects.BankAccount;

public class BankAccountV2Client {
    public static void main(String[] args) {
        BankAccountV2 dermot = new BankAccountV2("Dermot", "Lu", "Zhang", "123-45-6789", new Address(123, "Main Street", "Scarsdale", "NY", 10583, "USA"), "888-888-8888", 8888, new Dob(4, 12, 2010), "email@gmail.com", true);

        BankAccountV2 arthur = new BankAccountV2("Arthur", "Luk-Solarz", "Robert", "123-45-6789", new Address(123, "Main Street", "Scarsdale", "NY", 10583, "USA"), "888-888-8888", 8888, new Dob(10, 24, 2010), "email@gmail.com", true);
        System.out.println(dermot.getBalance());
        dermot.deposit(1000);
        System.out.println(dermot.getBalance());
        dermot.withdraw(200);
        System.out.println(dermot.getBalance());
        System.out.println(dermot); //the object's toString method is called implicitly, DO NOT explicitly call the toString method
        BankAccountV2[] myClients = new BankAccountV2[BankAccountV2.getNumberOfAccounts()];
        myClients[0] = dermot;
        myClients[1] = arthur;
        for (var it : myClients) {
            System.out.println(it);
        }
    }
}
