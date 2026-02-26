package Ch10ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class exercises {
    public static double calculateValue(ArrayList<String> a) {
        if (a == null || a.isEmpty()) return 0.0;

        double total = 0;
        int number = a.size();

        for (String it : a) {
            String lower = it.toLowerCase();
            for (int i = 0; i < lower.length(); i++) {
                char ch = lower.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    total++;
                }
            }
        }

        return total / number;
    }

    public static void swapPairs(ArrayList<String> a) {
        for (int i = 0; i < a.size() - 1; i += 2) {
            String temp1 = a.get(i);
            String temp2 = a.get(i + 1);

            a.set(i, temp2);
            a.set(i + 1, temp1);
        }
    }

    public static void removeEvenLength(ArrayList<String> a) {
        for (int i = a.size() - 1; i >= 0; --i) {
            if (a.get(i).length() % 2 == 0) a.remove(i);
        }
    }

    public static void doubleList(ArrayList<String> a) {
        for (int i = a.size() - 1; i >= 0; --i) {
            a.add(i, a.get(i));
        }
    }

    public static void scaleByK(ArrayList<Integer> a) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (var it : a) {
            if (it > 0) {
                for (int i = 0; i < it; ++i) {
                    answer.add(it);
                }
            }
        }
        a.clear();
        a.addAll(answer);
    }

    public static void minToFront(ArrayList<Integer> a) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < a.size(); ++i) {
            if (a.get(i) < min) {
                min = a.get(i);
                index = i;
            }
        }
        a.remove(index);
        a.add(min, 0);
    }

    public static void removeDuplicates(ArrayList<String> a) {
        for (int i = a.size() - 1; i > 0; --i) {
            if (a.get(i).equals(a.get(i - 1))) a.remove(i);
        }
    }

    public static void removeZeroes(ArrayList<Integer> a) {
        for (int i = a.size() - 1; i >= 0; --i) {
            if (a.get(i) == 0) a.remove(i);
        }
    }

    public static int rangeBetweenZeroes(ArrayList<Integer> a) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 0) {
                if (first == -1) first = i;
                last = i;
            }
        }

        if (first == -1) return 0;
        if (first == last) return 1;
        return last - first + 1;
    }

    public static void removeInRange(ArrayList<String> a, String b, String e) {
        for (int i = a.size() - 1; i >= 0; --i) {
            String s = a.get(i);
            if (b.compareTo(s) < 0 && s.compareTo(e) < 0) a.remove(i);
        }
    }

    public static void stutter(ArrayList<String> a, int k) {
        ArrayList<String> b = new ArrayList<>();
        for (var it : a) {
            for (int i = 0; i < k; ++i) {
                b.add(it);
            }
        }
        a.clear();
        a.addAll(b);
    }

    public static void markLength4(ArrayList<String> a) {
        for (int i = 0; i < a.size(); ++i) {
            if (a.get(i).length() == 4) {
                a.add(i, "****");
                ++i;
            }
        }
    }

    public static void reverse3(ArrayList<String> a) {
        for (int i = 0; i <= a.size() - 3; i += 3) {
            String temp = a.get(i);
            a.set(i, a.get(i + 2));
            a.set(i + 2, temp);
        }
    }

    public static void removeShorterStrings(ArrayList<String> a) {
        int i = 0;
        while (i + 1 < a.size()) {
            if (a.get(i).length() < a.get(i + 1).length()) {
                a.remove(i);
            } else if (a.get(i + 1).length() < a.get(i).length()) {
                a.remove(i + 1);
            } else {
                a.remove(i);
            }
        }
        ++i;
    }

    public static void filterRange(ArrayList<Integer> a, int min, int max) {
        for (int i = a.size() - 1; i >= 0; --i) {
            if (a.get(i) >= min && a.get(i) <= max) a.remove(i);
        }
    }

    public static void clump(ArrayList<String> a) {
        int original = a.size();
        for (int i = 0; i < original - 1; i += 2) {
            a.add("(" + a.get(i) + " " + a.get(i + 1) + ")");
        }

        if ((original % 2) == 1) {
            a.add(a.get(original - 1));
        }

        for (int i = original - 1; i >= 0; --i) {
            a.remove(i);
        }

    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago", "our"));
        clump(a);
        System.out.println(a);
    }
}
