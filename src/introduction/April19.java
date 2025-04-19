package introduction;

import java.util.Scanner;
import java.util.StringTokenizer;

public class April19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            int count = 0;
            int S = sc.nextInt();
            sc.nextLine();

            int[] arr = new int[S + 1];

            StringTokenizer st = new StringTokenizer(sc.nextLine());
            for (int j = 1; j <= S; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            boolean[] flag = new boolean[S + 1];

            for (int A = 1; A <= S; A++) {
                if (!flag[A]) {
                    flag[A] = true;
                    int next = arr[A];

                    while (!flag[next]) {
                        flag[next] = true;
                        next = arr[next];
                    }
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
