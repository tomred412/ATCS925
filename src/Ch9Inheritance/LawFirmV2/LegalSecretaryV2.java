package Ch9Inheritance.LawFirmV2;

public class LegalSecretaryV2 extends EmployeeV2 {

    public double getSalary() {
        return super.getSalary() + 5000;
    }

    public String prepareLegalDocs() {
        return "Preparing legal docs.";
    }
}
