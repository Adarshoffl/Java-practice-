import java.util.Scanner;

public class prime {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime=true;

        if (n==2){
            System.out.println(n+" is primenum");

        }else{

            
        for(int i=2; i<=Math.sqrt(n);i++){//used math.sqrt(n)for optimizing code for highest numbers and we taking square root of n 

            if(n%i==0){

                isPrime =false;
            }
        }

        if( isPrime==true){
            System.out.println(n+" is primenum");
        }else{
            System.out.println(n+" is not primenum");
        }

        }


    }
    
}
