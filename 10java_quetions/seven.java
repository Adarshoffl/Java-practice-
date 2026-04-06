// write a program to enter the number till the user wants and at the end it should display the count of positive, negative and zeroes entered

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=0;
        int n=0;
        int z=0;
        char choice = 0;
        do{
            int num = sc.nextInt();

            if(num>0)
                p++;

            else if( num<0)
                n++;
            else
                z++;
            System.out.println("do you want to continue y/n");
            choice = sc.next().charAt(0);

        }while(choice == 'y');

        System.out.println("positive= "+p);
        System.out.println("negative= "+n);
        System.out.println("zero's= "+z);

    }
}
