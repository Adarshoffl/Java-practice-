
// public class revision {

//     public static void main(String[] args) {
//         int x = 10, y = 5;
//         int exp1 = (y * (x / y + x / y));
//         int exp2 = (y * x / y + y * x / y);
//         System.out.println(exp1);
//         System.out.println(exp2);
//     }
// }

//find the output
// public class revision{
//     public static void main(String args[]){
//         for (int i=0; i<5; i++){
//             System.out.println("hello");
//             i+=2;
//         }
//     } 
// }

// find out the error
// public class revision{
//     public static void main(String[] args) {

//         for(int i=0 ; i<=5; i++){
//             System.out.println("i="+i);
//         }
//         System.out.println("i after the loop"+ i);

//     }
// }

// multiplication table 

// import java.util.Scanner;

// public class revision{

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();

//         for (int i=1; i<=10; i++){
//             int sum= n*i;
//             System.out.println(n+"*"+i+"="+sum);
//         }
//     }
// }





// take number from user find even odd and do sum of  all even and odd

// import java.util.Scanner;

// public class revision {
//     public static void main(String arg[]) {
//         Scanner sc = new Scanner(System.in);
//         int even=0 ,odd=0;

//         System.out.println("Enter how many numbers:");
//   int n= sc.nextInt();

//         for(int i=1; i<=n; i++){
//              System.out.print("Enter number: ");
//         int num =sc.nextInt();

//         if(num%2==0){
//         even+=num;
//         }else{
//          odd+=num;
//         }
//         }
//         System.out.println("the sum of even= "+even);
//         System.out.println("the sum of odd= "+odd);

//     }
// }



// find the factorial num

import java.util.Scanner;

public class revision{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int fact=1;

        if(n==0){
            System.out.println("factorial number 0 is not accepted");
        }

        for(int i=1; i<=n; i++){

             fact= fact*i;

        }
        System.out.println("the factorial of n is: "+fact);

    }
}

