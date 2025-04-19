package introduction;

import java.util.Scanner;

public class April16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while (N-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int[][] dp = new int[A + 1][B + 1];

            for (int i = 1; i <= B; i++) {
                dp[0][i] = i;
            }

            for (int i = 1; i <= A; i++) {
                for (int j = 1; j <= B; j++) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
            System.out.println(dp[A][B]);
        }
        sc.close();
    }
}
