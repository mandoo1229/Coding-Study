package minwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCharAt {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int N = Integer.parseInt(br.readLine());
        System.out.println(S.charAt(N-1));

    }
}
