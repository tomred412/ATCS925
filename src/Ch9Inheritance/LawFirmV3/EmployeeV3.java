/**
 * @author: Dermot Lu
 * @since 1.0
 * <p>
 * V1: the Employee class has the rules and regulations that apply for all the employees. This version does not apply inheritance.
 */

package Ch9Inheritance.LawFirmV3;

import Ch8ClassesAndObjects.BankAccount.Address;
import Ch8ClassesAndObjects.BankAccount.Dob;
import Ch9Inheritance.LawFirmV2.EmployeeV2;

public class EmployeeV3 {
    private String firstName, lastName, jobTitle, email;
    private int room, id, yearsOfExperience;
    private Dob dob;
    private Address address;

    private static int numOfEmployees;

    public EmployeeV3(String firstName, String lastName, String jobTitle, String email, int id, int yearsOfExperience, Dob dob, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.id = id;
        this.yearsOfExperience = yearsOfExperience;
        this.dob = dob;
        this.address = address;
        ++numOfEmployees;
    }

    public static int getNumOfEmployees() {
        return numOfEmployees;
    }

    //getters
    public String getJobTitle() {
        return jobTitle;
    }

    public int getHours() {
        return 40;
    }

    public double getSalary() {
        return 40000;
    }

    public int getVacationDays() {
        return 10;
    }

    public String getVacationForm() {
        return "Yellow form.";
    }

    //setters

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "\n" + address;
    }
}
