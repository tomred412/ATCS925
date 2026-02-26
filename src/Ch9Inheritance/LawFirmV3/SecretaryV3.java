package Ch9Inheritance.LawFirmV3;

import Ch8ClassesAndObjects.BankAccount.Address;
import Ch8ClassesAndObjects.BankAccount.Dob;

public class SecretaryV3 extends EmployeeV3 {

    SecretaryV3(String firstName, String lastName, String jobTitle, String email, int id, int yearsOfExperience, Dob dob, Address address) {
        super(firstName, lastName, jobTitle, email, id, yearsOfExperience, dob, address);
    }

    public String takeNotes() {
        return "Taking notes.";
    }
}
