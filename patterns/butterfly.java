package patterns;
public class butterfly {
    
    public static void main(String args[]){

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            int sp=2*(5-i);
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
         for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

             int sp=2*(5-i);
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
          

        }
    }

}
