package TwoDArrays;

import java.util.Scanner;

public class metrix_X {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int colms = sc.nextInt();

        int numbers[][] = new int[rows][colms];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colms; j++) {

                numbers[i][j] = sc.nextInt();

            }
        }

        int x = sc.nextInt();

        // output

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colms; j++) {
                if (x == numbers[i][j]) {
                 System.out.println("("+i  +","+ j+")");
                }
            }
        }
       

    }

}
