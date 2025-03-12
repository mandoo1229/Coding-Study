package study;

import java.util.Arrays;
import java.util.Scanner;

public class march12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sum = new int[5];

        for (int i = 0; i < 5; i++) {
            sum[i] = Integer.parseInt(sc.nextLine());
        }

        Arrays.sort(sum);
        System.out.println(Math.round(Arrays.stream(sum).average().orElse(0)));
        System.out.println(sum[2]);
    }
}
