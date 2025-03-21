package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class march20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] number = new int[N + 1];

        number[0] = 0;
        number[1] = 1;

        for (int i = 2; i <= N; i++) {
            number[i] = number[i - 1] + number[i - 2];
        }
        System.out.println(number[N]);

    }
}
