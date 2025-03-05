package study;

import java.util.Scanner;

public class march05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 영수증 금액
        int x = sc.nextInt();
        // 종류 수
        int y = sc.nextInt();
        int total = 0;

        for (int i = 0; i < y; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            total += a * b;
        }
        if (total == x) {
            System.out.println("Yes");
        } else  {
            System.out.println("No");
        }
    }
}
