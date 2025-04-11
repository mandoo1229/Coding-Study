package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class April11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N = br.readLine().split(" ");

        int N1 = Integer.parseInt(N[0]);
        int N2 = Integer.parseInt(N[1]);

        for (int i = 0; i < 1; i++) {
            String[] score = br.readLine().split(" ");
            Integer[] scores = new Integer[score.length];
            for (int j = 0; j < scores.length; j++) {
                scores[j] = Integer.parseInt(score[j]);
            }

            Arrays.sort(scores, Collections.reverseOrder());

            System.out.println(scores[N2-1]);
        }
    }
}
