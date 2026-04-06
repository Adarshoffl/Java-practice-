package Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        
        // int[] marks = new int[3];

        // marks[0]= 20;
        // marks[1]= 30;
        // marks[2]= 40;

        Scanner sc = new Scanner(System.in);

        int size =sc.nextInt();
        int[] num = new int[size];

        // input from user
        for(int i=0; i<size; i++){
            num[i]=sc.nextInt();
        }

        int x = sc.nextInt();

        // output
        for(int i=0; i<size;i++){
            if(num[i] == x){
                System.out.println("x find in index no"+" "+i);
            }
        }
    }
    
}
