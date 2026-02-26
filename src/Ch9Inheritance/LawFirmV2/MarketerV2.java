package Ch9Inheritance.LawFirmV2;

public class MarketerV2 extends EmployeeV2 {

    public double getSalary() {
        return super.getSalary() + 10000;
    }

    public String advertise() {
        return "Advertise";
    }
}
