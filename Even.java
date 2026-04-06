    import java.util.Scanner;
    public class Even {

    public static void evennum(int n) {

        if (n <= 1) {
            System.out.println("odd number");
            return;
        }

        for (int i = 2; i<= n; i++) {

            if (n % 2 == 1) {
                System.out.println("odd number");
                return;

            }

            }
            System.out.println(" even number");

        

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        evennum(n);
    }

}
