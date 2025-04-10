package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class April10 {
    public static void main(String[] args) throws IOException {

        /*
         * 코드 설계
         * 1. 띄어쓰기 기준으로 나눕니다.
         * 2. 나눈 값을 List로 담습니다.
         * 3. 순서대로 비교한 뒤 정렬합니다. (년도, 월, 일)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] data = br.readLine().split(" ");
            String name = data[0];
            int day = Integer.parseInt(data[1]);
            int month = Integer.parseInt(data[2]);
            int year = Integer.parseInt(data[3]);
            people.add(new Person(name, day, month, year));
        }

        people.sort((a, b) -> {
            if (a.year != b.year) return a.year - b.year;
            if (a.month != b.month) return a.month - b.month;
            return a.day - b.day;
        });
        System.out.println(people.get(people.size() - 1).name);
        System.out.println(people.get(0).name);

    }
}

class Person {
    String name;
    int day, month, year;
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
