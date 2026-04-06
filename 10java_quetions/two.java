// write a function to print the sum of all odd numbers from 1ton
import java.util.Scanner;

public class two {
    public static void Oddnum(int n){
        int sum = 0;

        for(int i=1; i<=n; i++){

            if(i%2==1){
            System.out.println(i);
            }

             sum = sum+i;
        }
    
        System.out.println(sum);
        
    }

    public static void main(String args[]){
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Oddnum(n);
    }
}
