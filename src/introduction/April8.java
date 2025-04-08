package introduction;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class April8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] S = new String[N][2];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 1; j++) {
                String[] a = br.readLine().split(" ");
                S[i][0] = a[0];
                S[i][1] = a[1];
            }
        }
        Arrays.sort(S, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[0] == o2[0])
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                else
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                bw.write(String.valueOf(S[i][j]) + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
