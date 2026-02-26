package Ch9Inheritance.LawFirmV3;

import Ch8ClassesAndObjects.BankAccount.Address;
import Ch8ClassesAndObjects.BankAccount.Dob;

public class LawyerV3 extends EmployeeV3 {
    private int room;

    //if the parent class has a constructor, then it is the job of all its children to initialize the parent's constructor
    public LawyerV3(String firstName, String lastName, String jobTitle, String email, int id, int yearsOfExperience, Dob dob, Address address, int room) {
        super(firstName, lastName, jobTitle, email, id, yearsOfExperience, dob, address); //the first in the child's constructor must be an explicit call to the parent's constructor using the keyword super
        this.room = room;
    }

    public int getVacationDays() {
        return super.getVacationDays() + 5;
    }

    public String getVacationForm() {
        return "Pink form.";
    }

    public String sue() {
        return "I'll see you in court.";
    }
}
