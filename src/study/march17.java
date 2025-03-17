package study;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class march17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());

            switch (S) {
                case 1:
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    bw.write(deque.isEmpty() ? "-1\n" : deque.pollFirst() + "\n");
                    break;
                case 4:
                    bw.write(deque.isEmpty() ? "-1\n" : deque.pollLast() + "\n");
                    break;
                case 5:
                    bw.write(deque.size() + "\n");
                    break;
                case 6:
                    bw.write(deque.isEmpty() ? "1\n" : "0\n");
                    break;
                case 7:
                    bw.write(deque.isEmpty() ? "-1\n" : deque.peekFirst() + "\n");
                    break;
                case 8:
                    bw.write(deque.isEmpty() ? "-1\n" : deque.peekLast() + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
