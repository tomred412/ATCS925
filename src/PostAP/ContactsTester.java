package PostAP;

public class ContactsTester {
    static void main() {


        ContactManager myContacts = new ContactManager();

        myContacts.addContact("Rishi", "123-45-6789");
        myContacts.addContact("Kyle", "234-56-7890");

        System.out.println(myContacts.getContact("Kyle"));

        System.out.println("\n" + myContacts);
    }
}
