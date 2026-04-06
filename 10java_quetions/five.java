// write a function that takes in age as input and returns if that person is eligible to vote or not a person of age >18 is eligible for vote 

import java.util.Scanner;

public class five {
    public static void eligible(int a){
        if(a>=18){
            System.out.println("person is eligible for voting");
        }else if(a==100){
            System.out.println("person is dead not eligible for voting");
        }else{
            System.out.println("person is not eligible for voting");

        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();

        eligible(a);
    }
}
