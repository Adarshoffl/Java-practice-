package TwoDArrays;

import java.util.*;

public class spiral {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int num[][] = new int[row][col];

       for(int i=0; i<row; i++) {
           for(int j=0; j<col; j++) {
               num[i][j] = sc.nextInt();
           }
      }


        int row_start = 0;
        int row_end = row - 1;
        int col_start = 0;
        int col_end = col - 1;

        while (row_start <= row_end && col_start <= col_end) {

            // Top row
            for (int j = col_start; j <= col_end; j++)
                System.out.print(num[row_start][j] + " ");
            row_start++;

            // Right column
            for (int i = row_start; i <= row_end; i++)
                System.out.print(num[i][col_end] + " ");
            col_end--;

            // Bottom row
            if (row_start <= row_end) {
                for (int j = col_end; j >= col_start; j--)
                    System.out.print(num[row_end][j] + " ");
                row_end--;
            }

            // Left column
            if (col_start <= col_end) {
                for (int i = row_end; i >= row_start; i--)
                    System.out.print(num[i][col_start] + " ");
                col_start++;
            }

            System.out.println();
        }



    }
}