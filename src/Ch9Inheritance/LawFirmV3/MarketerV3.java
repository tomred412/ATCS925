package Ch9Inheritance.LawFirmV3;

import Ch8ClassesAndObjects.BankAccount.Address;
import Ch8ClassesAndObjects.BankAccount.Dob;

public class MarketerV3 extends EmployeeV3 {

    public MarketerV3(String firstName, String lastName, String jobTitle, String email, int id, int yearsOfExperience, Dob dob, Address address) {
        super(firstName, lastName, jobTitle, email, id, yearsOfExperience, dob, address);
    }

    public double getSalary() {
        return super.getSalary() + 10000;
    }

    public String advertise() {
        return "Advertise";
    }
}
