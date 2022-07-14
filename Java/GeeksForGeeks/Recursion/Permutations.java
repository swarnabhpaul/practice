import java.util.Scanner;
import java.lang.StringBuilder;

//Program to find all permutations of a given string
public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        System.out.print("Enter string: ");
        str.append(sc.nextLine());
        System.out.println("All permutations of given string are:");
        permute(str, 0);
    }

    static void permute(StringBuilder str, int i) {
        // Input arguments
        /*
         * str: (StringBuilder)
         * i: (int) - Denotes the index upto which the character has been fixed
         */
        if (i == str.length() - 1) {
            System.out.print(str + " ");
            return;
        }
        for (int j = i; j < str.length(); j++) {
            swap(str, i, j);
            permute(str, i + 1);
            swap(str, i, j);
        }
    }

    static void swap(StringBuilder str, int i, int j) {
        char t = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, t);
    }
}
