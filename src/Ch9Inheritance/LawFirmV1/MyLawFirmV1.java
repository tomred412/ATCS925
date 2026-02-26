package Ch9Inheritance.LawFirmV1;

public class MyLawFirmV1 {
    public static void main(String[] args) {
        LawyerV1 rishi = new LawyerV1();
        System.out.println("Rishi fill out the " + rishi.getVacationForm());

        MarketerV1 laila = new MarketerV1();
        System.out.println("Laila fill out the " + laila.getVacationForm());

        SecretaryV1 rapha = new SecretaryV1();
        System.out.println("Rapha fill out the " + rapha.getVacationForm());
    }
}
