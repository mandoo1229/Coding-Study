package introduction;

import java.util.Scanner;

public class April12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[5];

        for (int i = 0; i < 5; i++) {
            N[i] = sc.nextInt();
        }
        boolean sort = false;

        while (!sort) {
            sort = true;
            for (int i = 0; i < 4; i++) {
                if (N[i] > N[i + 1]) {
                    int temp = N[i];
                    N[i] = N[i + 1];
                    N[i + 1] = temp;
                    for (int j = 0; j < 5; j++) {
                        System.out.print(N[j] + " ");
                    }
                    System.out.println();
                    sort = false;
                }
            }
        }

    }
}
