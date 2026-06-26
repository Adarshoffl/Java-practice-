package Arrays;

import java.util.Scanner;

public class Arraybasic {
    
    public static void main(String args[]){
         
        Scanner sc = new Scanner(System.in);

        int marks[]= new int[100];

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("maths = "+marks[0]);
        System.out.println("physics = "+marks[1]);
        System.out.println("chemistry = "+marks[2]);

        int Avg= (marks[0]+marks[1]+marks[2])/3;

        System.out.println("percentage = "+Avg+"%");
    }
}
