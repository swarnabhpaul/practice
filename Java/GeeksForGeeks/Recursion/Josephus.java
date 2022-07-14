import java.util.Scanner;

class Josephus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.print("Input n and k: ");
        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println("Josephus solution is: " + myJos(n, k));
    }

    static int jos(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (jos(n - 1, k) + k) % n;
    }

    static int myJos(int n, int k) {
        return jos(n, k) + 1;
    }
}