package PostAP;

import java.util.HashMap;
import java.util.Map;

public class ContactManager {
    private Map<String, Contact> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }

    public Contact getContact(String name) {
        return contacts.get(name);
    }

    public void addContact(String name, String phone) {
        Contact myContact = new Contact(name, phone);
        contacts.put(name, myContact);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public String toString() {
        String phonebook = "";
        for (Map.Entry<String, Contact> a : contacts.entrySet()) {
            phonebook += a.getValue().toString() + "\n";
        }
        return phonebook;
    }
}
