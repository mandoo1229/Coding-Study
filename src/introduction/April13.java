package introduction;

import java.util.Scanner;

public class April13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Size[] sizes = new Size[N];

        for (int i = 0; i < N; i++) {
            sizes[i] = new Size(sc.nextInt(), sc.nextInt());
        }


        for (int i = 0; i < N; i++) {
            int rank = 1;

            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                if (sizes[i].checkSize(sizes[j]))
                    rank++;
            }
            System.out.print(rank + " ");
        }

    }


    static class Size {
        private int weight;
        private int height;

        public Size(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public boolean checkSize(final Size size) {
            if (weight < size.weight && height < size.height) {
                return true;
            }
            return false;
        }
    }

}

