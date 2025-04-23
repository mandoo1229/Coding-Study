package introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class April23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;

            List<String> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(sc.next());
            }

            list.sort(String.CASE_INSENSITIVE_ORDER);
            System.out.println(list.get(0));
        }
    }
}
