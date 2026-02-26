package Ch10ArrayList;

import java.util.*;

/**
 * @author: Dermot Lu
 * @since: 1.0
 * This program covers the basics of ArrayList
 */

public class ArrayListBasics {
    public static void main(String[] args) {
        //1. Instantiate an ArrayList
        ArrayList<String> students = new ArrayList<String>();
        students.add("Rapha");
        students.add("Laila");
        for (int i = 0; i < students.size(); ++i) {
            System.out.println(students.get(i));
        }
        System.out.println();
        students.add(1, "Arthur");
        for (int i = 0; i < students.size(); ++i) {
            System.out.println(students.get(i));
        }
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

    }
}
