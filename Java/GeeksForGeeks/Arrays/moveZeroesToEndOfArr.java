import java.util.Scanner;

//Problem: Move all zeroes to the end of the array

public class moveZeroesToEndOfArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, arr[];
        System.out.print("Enter n: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.print("Enter array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        zeroesToEnd(arr, n);
        System.out.print("Final array: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void zeroesToEnd(int arr[], int n) {
        int i, zcnt = 0, t;
        for (i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zcnt++;
            } else {
                t = arr[i - zcnt];
                arr[i - zcnt] = arr[i];
                arr[i] = t;
            }
        }
    }
}
