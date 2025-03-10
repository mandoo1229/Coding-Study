package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class march11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum[] = new int[N];

        for (int i = 0; i < N; i++) {
            sum[i] = Integer.parseInt(br.readLine());
        }


        Arrays.sort(sum);
        for (int i = 0; i < N; i++) {
            System.out.println(sum[i]);

        }

    }
}
