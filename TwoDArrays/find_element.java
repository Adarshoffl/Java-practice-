package TwoDArrays;

public class find_element {

    public static int check(int arr[][], int key){

        int count=0;
        int rows = arr.length;
         int cols = arr[0].length; // Get the actual column width
        int totalElements = rows * cols;

        for (int i=0; i<totalElements; i++){
            if(key==arr[i/cols][i%cols]){

                 count++;
               
            }
        }
        return count;
    }
    public static void main(String args[]){

        int arr[][]= {{4,7,8},
                      {7,8,7}};

         int key=7;    
         
         System.out.println(check(arr, key));

    }
    
}
