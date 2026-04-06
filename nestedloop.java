// public class nestedloop {
//     public static void main(String args[]) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print(" *" );
//             }
//             System.out.println();
//         }
//     }

// }

//  * * * * *
//  * * * * *
//  * * * * *
//  * * * * *




public class nestedloop {
    public static void main(String args[]) {
     //outerloop
        for (int i = 1; i <= 4; i++) {
            //innnerloop
            for (int j = 1; j <= 5; j++) {

                if(i==1 || j==1 || i==4 || j==5){
                System.out.print(" *" );
                }else{
                     System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}

//  * * * * *
//  *       *
//  *       *
//  * * * * *
  

// public class nestedloop {
     
//     public static void main(String args[]){
    
//         int n=4;
        
//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++){
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }

// *
// * *
// * * *
// * * * *

// public class nestedloop {
     
//     public static void main(String args[]){
    
//         int n=5;
        
//         for(int i=n; i>=1; i--){

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// * * * *
//  * * *
//  * *
//  *

// public class nestedloop{

//     public static void main(String args[]){
//         int n=5;
//         for(int i =1; i<=n; i++){

//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             for(int j=1;j<=i; j++){
//                 System.out.print("*");
//             }

//             System.out.println(  );
//         }
        
//     }
// }

//    *
//   **
//  ***
// ****

// public class nestedloop{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=i; j++){

//                 System.out.print(j);

//             }
//             System.out.println();
//         }
//     }
// }
// 1
// 12
// 123
// 1234
// 12345