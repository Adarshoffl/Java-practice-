// Enter 3 numbers from the user and make a function to print their average

import java.util.Scanner;

public class one {
    public static void Average(int a, int b, int c){

        int sum= a+b+c;
        double average= sum/3.0;
         System.out.println(average);
    }

    public static void main (String arg[]){
         try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
               int b = sc.nextInt();
               int c = sc.nextInt();

               Average(a, b, c);
         }

    }


    
}
