package introduction;

import java.util.Scanner;

public class April17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(com(B, A));
        }
        sc.close();
    }

    static long com(int B, int A) {
        if (A > B) return 0;
        if (A == 0 || A == B) return 1;

        long result = 1;
        for (int i = 1; i <= A; i++) {
            result = result * (B - i + 1) / i;
        }
        return result;
    }
}
