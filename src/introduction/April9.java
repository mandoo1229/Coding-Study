package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class April9 {
    public static void main(String[] args) throws IOException {
        /*
         * 코드 설계
         * 1. 중복값을 제거합니다.
         * 2. 길이 순으로 정렬합니다.
         * 3. 길이가 같으면 알파벳 순으로 정렬합니다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받을 갯수를 받음
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        // 중복값을 제거합니다.
        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            set.add(S);
        }

        List<String> list = new ArrayList<>(set);

        // 길이 기준에서 알파벳 순으로 정렬합니다.
        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return a.length() - b.length(); // 길이 짧은 순
                } else {
                    return a.compareTo(b); // 길이가 같으면 알파벳순
                }
            }
        });
        for (String s : list) {
            System.out.println(s);
        }
    }
}
