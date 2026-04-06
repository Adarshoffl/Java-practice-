import java.util.Scanner;

public class PrimeNum {

    public static void primenum(int n) {

        if (n <= 1) {
            System.out.println("prime number");
            return;
        }

        for (int i = 2; i<= n; i++) {

            if (n % 2 == 0) {
                System.out.println("not prime number");
                return;

            }
            }
            System.out.println(" prime number");

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        primenum(n);

    }

}
