package Ch10ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static ArrayList intersect(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (var it : a) {
            if (b.contains(it)) answer.add(it);
        }
        return answer;
    }

    public static void main(String[] args) {
        Integer[] arraylist1 = {1, 4, 8, 9, 11, 15, 17, 28, 41, 59};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arraylist1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));


        System.out.println(intersect(list1, list2));
    }
}
