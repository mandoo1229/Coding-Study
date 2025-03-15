package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class march15 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack stack = new Stack();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            switch (S) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty());
                    break;
                case "top":
                    System.out.println(stack.top());
                    break;
            }
        }


    }
}


class Stack {
    int[] arr = new int[10000];
    int cur = 0;

    void push(int x) {
        arr[cur] = x;
        cur++;
    }

    int pop() {
        if (cur <= 0) {
            return -1;
        }
        int result = arr[cur - 1];
        arr[cur -1] = 0;
        cur--;
        return result;
    }

    int size() {
        return cur;
    }

    int empty() {
        return (cur <= 0) ? 1 : 0;
    }
    int top() {
        return (cur <= 0) ? -1 : arr[cur - 1];
    }
}

