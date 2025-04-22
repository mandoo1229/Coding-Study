package introduction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class April22 {
    static int N, M; // 사람수, 관계 수
    static boolean[] visited;   // 방문 여부 체크
    static ArrayList<Integer>[] relations;  // 관계를 저장할 리스트
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();   // 사람수
        int person1 = sc.nextInt(); // 촌수 계산 첫번째
        int person2 = sc.nextInt(); // 촌수 두번째 계산
        M = sc.nextInt();   // 관계 수

        relations = new ArrayList[N + 1];   // 1부터 n까지
        visited = new boolean[N + 1];   // 방문 여부 초기화

        for (int i = 0; i <= N; i++) {
            relations[i] = new ArrayList<>();
        }

        // 관계 입력
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            relations[x].add(y);
            relations[y].add(x);
        }

        // 촌수 계산
        int result = find(person1, person2);
        System.out.println(result);


    }

    public static int find(int start, int end) {
        // 큐에 사람번호, 촌수 형태로 저장
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int person = cur[0];    // 현재 사람
            int kinship = cur[1];   // 현재 촌수

            if (person == end) {
                return kinship;
            }

            for(int next : relations[person]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[]{next, kinship + 1});
                }
            }
        }
        return -1;
    }
}
