import java.util.Scanner;

public class Breaks {

    public static void main(String[] args) {
        
        Scanner AD = new Scanner(System.in);
        
        do{
            System.out.println("Enter the number");
            int num =AD.nextInt();

            if(num%10==0){
                break;
            }
            System.out.println(num);
            

        }while(true);
    }
    
}
