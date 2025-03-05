package study;

import java.util.Arrays;
import java.util.Scanner;

public class march07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[x -1]);
    }
}
