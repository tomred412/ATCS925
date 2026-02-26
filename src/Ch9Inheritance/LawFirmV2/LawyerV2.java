package Ch9Inheritance.LawFirmV2;

public class LawyerV2 extends EmployeeV2 {

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
