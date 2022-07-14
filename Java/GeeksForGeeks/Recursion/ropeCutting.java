import java.util.Scanner;

class ropeCutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b, c;
        System.out.print("Input n: ");
        n = sc.nextInt();
        System.out.print("Input a, b, c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Max pieces: " + maxPieces(n, a, b, c));
    }

    static int maxPieces(int n, int a, int b, int c) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }

        int res = findMax(maxPieces(n - a, a, b, c), maxPieces(n - b, a, b, c), maxPieces(n - c, a, b, c));
        if (res == -1) {
            return -1;
        }
        return res + 1;
    }

    static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}