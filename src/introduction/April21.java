package introduction;

import java.util.ArrayList;
import java.util.Scanner;

public class April21 {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();

        graph = new ArrayList<>();
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < S; i++) {
            int U = sc.nextInt();
            int V = sc.nextInt();

            graph.get(U).add(V);
            graph.get(V).add(U);
        }

        int connected = 0;

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                connected++;
            }
        }
        System.out.println(connected);
    }

    static void dfs(int node) {
        visited[node] = true;

        for (int i = 0; i < graph.get(node).size(); i++) {
            if (!visited[graph.get(node).get(i)]) {
                dfs(graph.get(node).get(i));
            }
        }

    }
}
