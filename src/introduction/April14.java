package introduction;

import java.util.Scanner;

public class April14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] X = new int[5][5];
        int[][] Y = new int[5][5];

        // 빙고 보드판
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                X[i][j] = sc.nextInt();
            }
        }

        // 부르는 숫자
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                Y[i][j] = sc.nextInt();

        int count = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                count++;
                remove(X, Y[i][j]);
                if (bingoCount(X) >=3) {
                    System.out.println(count);
                    return;
                }

            }
        }


    }

    // 빙고 지우기
    public static void remove(int[][] X, int num) {
        for (int i = 0; i < 5; i++)
            for(int j = 0; j < 5; j++)
                if (X[i][j] == num)
                    X[i][j] = 0;
    }

    public static int bingoCount(int[][] X) {
        int count = 0;

        // 가로 검사
        for (int i = 0; i < 5; i++) {
            boolean line = true;
            for (int j = 0; j < 5; j++) {
                if (X[i][j] != 0) {
                    line = false;
                    break;
                }
            }
            if (line) count++;
        }

        // 세로 검사
        for (int i = 0; i < 5; i++) {
            boolean line = true;
            for (int j = 0; j < 5; j++) {
                if (X[j][i] != 0) {
                    line = false;
                    break;
                }
            }
            if (line) count++;
        }

        // 대각선 \
        boolean line1 = true;
        for (int i = 0; i < 5; i++)
            if(X[i][i] != 0)
                line1 = false;
        if (line1) count++;


        // 대각선 /
        boolean line2 = true;
        for (int i = 0; i < 5; i++)
            if (X[i][4-i] != 0)
                line2 = false;
        if (line2) count++;

        return count;
    }
}
