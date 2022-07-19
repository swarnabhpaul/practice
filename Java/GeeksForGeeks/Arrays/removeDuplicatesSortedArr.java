import java.util.Scanner;

//Problem: Remove duplicates from sorted array

public class removeDuplicatesSortedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, arr[];
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.println("Enter array elements in sorted order (ascending):");
        arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        n = removeDuplicatesFromSortedArray(arr, n);
        System.out.print("Final array: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicatesFromSortedArray(int arr[], int n) {
        int i, res = 1;
        for (i = 0; i < n; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
