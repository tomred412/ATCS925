package Ch9Inheritance.LawFirmV2;

public class MyLawFirmV2 {
    public static void main(String[] args) {
        EmployeeV2[] myEmployees = {new LawyerV2(), new MarketerV2(), new SecretaryV2()};
        for (int i = 0; i < myEmployees.length; ++i) {
            System.out.println(myEmployees[i].getVacationDays());
        }
    }
}
