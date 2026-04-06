package Variables_and_Data_Types;

import java.util.Scanner;

public class three {
    public static void main(String args[]){
        Scanner AD = new Scanner(System.in);
        float pencil= AD.nextFloat();
        float pen= AD.nextFloat();
        float eraser= AD.nextFloat();
        int per=18;


        double total=pencil+pen+eraser;

        System.out.println(total*per/100);
    }
    
}
