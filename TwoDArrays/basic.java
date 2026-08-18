package TwoDArrays;

import java.util.*;

public class basic {

    public static void twoDarray(int Matrix[][]) {
        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix.length; j++) {

                if (Matrix[i][j] > max) {
                    max = Matrix[i][j];
                    row = i;
                    col = j;
                }

            }
        }
        System.out.println(row+","+col);
    }

    public static void main(String[] args) {

        int Matrix[][] = new int[3][3];
        int n = Matrix.length;
        int m = Matrix.length;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.err.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

        twoDarray(Matrix);
         sc.close();
    }

}
