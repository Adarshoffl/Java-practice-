import java.util.Scanner;

public class Table {
    public static void table(int n) {
        int sum;
        for(int i=1; i<=10; i++){
            sum= n*i;
            System.out.println(sum);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        table(n);
    }

}

