package Variables_and_Data_Types;

import java.util.Scanner;

public class one {
    
    public static void main(String args[]){

        Scanner AD = new  Scanner(System.in);
        int a= AD.nextInt();
         int b= AD.nextInt();
          int c= AD.nextInt();

          int sum= a+b+c;
          float avg=sum/3;

          System.out.println(avg);
    }
}
