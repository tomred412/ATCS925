package Ch9Inheritance.LawFirmV3;

import Ch8ClassesAndObjects.BankAccount.Address;
import Ch8ClassesAndObjects.BankAccount.Dob;

public class MyLawFirmV3 {
    public static void main(String[] args) {
        EmployeeV3[] myEmployees = {
                new LawyerV3("Rishi", "Singhal", "Lawyer", "rishi@lawfirm.com", 123, 13,
                        new Dob(10, 19, 2009),
                        new Address(123, "Main Street", "Scarsdale", "NY", 10583, "USA"), 354),
                new MarketerV3("Laila", "El Mosley", "Marketer", "laila@lawfirm.com", 123, 13,
                        new Dob(8, 8, 2009),
                        new Address(123, "Main Street", "Scarsdale", "NY", 10583, "USA")),
                new SecretaryV3("Rapha", "Strasser", "Secretary", "rapha@lawfirm.com", 123, 13,
                        new Dob(2, 11, 2008),
                        new Address(789, "Main Street", "Scarsdale", "NY", 10583, "USA"))};

        for (int i = 0; i < myEmployees.length; ++i) {
            System.out.println(myEmployees[i]);


        }
    }
}
