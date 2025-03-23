package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class march23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        System.out.println(binarySearch(N));
    }


    public static long binarySearch(long N) {
        long result = 0;
        long start = 0, end = N;

        while (start <= end) {
            long mid = (start + end) / 2;
            if (N <= Math.pow(mid, 2)) {
                result = mid;
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
