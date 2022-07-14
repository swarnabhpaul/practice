import java.util.Scanner;

//Program to find all subsets with given sum
/*
 * User inputs:
 * * n (Array size),
 * * arr[] (Array elements)
 * * sum
 * Output:
 * * Number of setsets of arr[] with given sum
 */
public class SubsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, arr[], i, sum;
        System.out.print("Input n: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.print("Enter array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter sum: ");
        sum = sc.nextInt();
        System.out.println("Total subsets with sum " + sum + " is " + countSubsetsWithSum(arr, sum, n));
    }

    static int countSubsetsWithSum(int arr[], int sum, int N) {
        return subsetsWithSum(arr, sum, N);
    }

    static int subsetsWithSum(int arr[], int sum, int size) {
        if (size == 0) {
            if (sum == 0) {
                return 1;
            }
            return 0;
        }
        int c1 = subsetsWithSum(arr, sum, size - 1);
        int c2 = subsetsWithSum(arr, sum - arr[size - 1], size - 1);
        return c1 + c2;
    }
}
