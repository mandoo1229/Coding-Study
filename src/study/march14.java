package study;

import java.util.Scanner;

public class march14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = 0;
        for (int i = 1; i < N; i++) {
            int number = i;
            int res = 0;

            while (number >0) {
                res += number % 10;
                number /= 10;
            }

            if (res + i == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
