package Arrays;

public class pairs {

    public static void arraypairs(int numbers[]){

        for(int i=0; i<numbers.length; i++){
            int cur=numbers[i];
        
        for(int j=i; j<numbers.length; j++){
           System.out.print("("+ cur +","+numbers[j]+")" );
        }
        System.err.println( );

        }
    }

    
     public static void main(String args[]){
        int numbers[]= {2,4,6,8,10};

        arraypairs(numbers);

     }

    
}
