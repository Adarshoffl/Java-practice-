package patterns;

public class numberpyramid {

    public static void main(String[] args) {
        
        for(int i=1; i<=5; i=i+1){

            for(int j=1; j<=5-i; j++){
               System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
               System.out.print(i+" ");
            }


            System.out.println("");
        }
    }
    
}
