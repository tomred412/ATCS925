package APExamReview;

import java.util.Scanner;

public class Review1 {
    public static void processFullName(Scanner in) {
        System.out.print("Please enter your full name: ");
        String fullName = in.nextLine();

        String[] names = fullName.split(" ");
        String temp1 = names[0].toLowerCase();
        String firstName = Character.toUpperCase(temp1.charAt(0)) + temp1.substring(1);

        String temp2 = names[1].toLowerCase();
        String middleName = Character.toUpperCase(temp2.charAt(0)) + temp2.substring(1);

        String temp3 = names[2].toLowerCase();
        String lastName = "";
        if (temp3.indexOf('-') == -1) {
            lastName = Character.toUpperCase(temp3.charAt(0)) + temp3.substring(1);
        } else {
            String[] lastNameSections = temp3.split("-");
            for (int i = 0; i < lastNameSections.length; ++i) {
                lastName += Character.toUpperCase(lastNameSections[i].charAt(0)) + lastNameSections[i].substring(1);
                if (i != lastNameSections.length - 1) lastName += "-";
            }
        }

        System.out.println("Your formatted name is " + lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        processFullName(in);
    }
}
