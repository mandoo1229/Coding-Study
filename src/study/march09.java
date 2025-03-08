package study;

import java.util.Scanner;

public class march09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();


        String reverse = "";

        for (int i = input.length() -1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }


        if (input.equals(reverse)) {
            System.out.println(1);
        } else  {
            System.out.println(0);
        }
    }
}
