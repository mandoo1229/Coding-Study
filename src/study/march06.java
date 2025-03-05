package study;

import java.util.Scanner;

public class march06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < x; i++) {
            int b = x-i;
            sum += b;
        }
        System.out.println(sum);
    }
}
