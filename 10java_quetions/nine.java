// write a function that calculates the greater common divisor of 2 numbers 

import java.util.Scanner;

public class nine {

    public static void GDC(int a, int b) {

        int gdc = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gdc = i;
            }

        }
        System.out.println(gdc);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        GDC(a, b);
    }
}
