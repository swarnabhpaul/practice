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
        int totalSubsets = (1 << (str.length()));
        for (int i = 0; i < totalSubsets; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (((1 << j) & i) != 0) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}