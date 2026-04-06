// write a function that takes in the radius as input and return the circumference of a circle

import java.util.Scanner;

public class four {

    public static void radius(int a ){
        double circumference= 2*3.14*a;
        System.out.println(circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();

        radius(a);
    }
    
}
