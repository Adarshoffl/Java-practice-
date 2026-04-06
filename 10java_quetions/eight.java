// two numbers are entered by the user , x and n  write a function to find the value of one number raised to the power of another i.e x

import java.util.Scanner;

public class eight {
    
    public static int Power(int a, int b){
        double power=Math.pow(a, b);
        System.out.println(power);
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();

        Power(a, b);
    }
}
