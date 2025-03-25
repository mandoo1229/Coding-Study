package minwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            String A = String.valueOf(S.charAt(0));
            String B = String.valueOf(S.charAt(S.length()-1));
            System.out.println(A+B);
        }
    }
}
