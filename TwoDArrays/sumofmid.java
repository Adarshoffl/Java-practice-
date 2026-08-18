package TwoDArrays;

public class sumofmid {

    public static int midsum(int arr[][]){

        int sum=0;
        // int colm=arr.length;
        for(int i=0; i<arr[0].length;i++){
            
            sum+=arr[1][i];
        }
        return sum;
    }

    
    public static void main(String args[]){

        int arr[][]= { {1,4,9},{11,4,3},{2,2,3} };

            
         System.out.println(midsum(arr));
    

    }
    
}
