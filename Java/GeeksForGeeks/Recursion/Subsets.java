import java.util.Scanner;

public class Subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter string: ");
        str = sc.nextLine();
        System.out.println("All subsets:");
        generateSubsets(str);
    }

    static void generateSubsets(String str) {
        generateSubsets(str, "", 0);
    }

    static void generateSubsets(String str, String curr, int i) {
        if (i == str.length()) {
            System.out.print(curr + " ");
            return;
        }
        generateSubsets(str, curr, i + 1);
        generateSubsets(str, curr + str.charAt(i), i + 1);
    }
}
