// write a function which takes in 2 numbers and returns the greater of those two
import java.util.Scanner;

public class three {

    public static void greaternum(int a , int b){
        if(a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        greaternum(a, b);
    }
}
