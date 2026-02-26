package Ch9Inheritance.LawFirmV3;

import Ch8ClassesAndObjects.BankAccount.Address;
import Ch8ClassesAndObjects.BankAccount.Dob;

public class LegalSecretaryV3 extends SecretaryV3 {

    public LegalSecretaryV3(String firstName, String lastName, String jobTitle, String email, int id, int yearsOfExperience, Dob dob, Address address) {
        super(firstName, lastName, jobTitle, email, id, yearsOfExperience, dob, address);
    }

    public double getSalary() {
        return super.getSalary() + 5000;
    }

    public String prepareLegalDocs() {
        return "Preparing legal docs.";
    }
}
