package conditional_statements;

import java.util.Scanner;

public class leafyear {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int year= sc.nextInt();

        boolean a= year % 4 ==0;
        boolean b= year % 100 != 0;
        boolean c= ((year % 100==0) && (year % 400==0));

        if(a && (b||c)){
            System.out.println(year+ " is not leaf year");
        }else{
             System.out.println(year+ " is leaf year");
        }

    }
    
}
