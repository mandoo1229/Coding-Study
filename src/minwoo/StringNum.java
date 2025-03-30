package minwoo;

import java.util.Scanner;

public class StringNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();


        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            String S = sc.next();

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < A; k++) {
                    sb.append(S.charAt(j));
                }
            }
        }
        System.out.println(sb.toString());
        sb.setLength(0);
    }
}
