package TwoDArrays;

import java.util.Arrays;

public class transpose {
     public static void Transpose(int arr[][]){


        int [][]trans= new int[arr[0].length][arr.length];

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
               trans[j][i] = arr[i][j];
               
            }
        }

         System.out.println(Arrays.deepToString(trans));

         
       
    }

    
    public static void main(String args[]){

        int arr[][]= { {1,4,9},
                       {11,4,3} };

            
         Transpose(arr);
         
    
  
    }
}
