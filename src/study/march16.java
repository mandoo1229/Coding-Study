package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class march16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            switch (S) {
                case "push":
                    queue.addLast(Integer.parseInt(st.nextToken())); // 큐의 뒤쪽에 추가
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? -1 : queue.pollFirst()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb);

    }
}
