 package TwoDArrays;

// import java.util.*;

// public class spiral {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         int num[][] = new int[row][col];

//        for(int i=0; i<row; i++) {
//            for(int j=0; j<col; j++) {
//                num[i][j] = sc.nextInt();
//            }
//       }


//         int row_start = 0;
//         int row_end = row - 1;
//         int col_start = 0;
//         int col_end = col - 1;

//         while (row_start <= row_end && col_start <= col_end) {

//             // Top row
//             for (int j = col_start; j <= col_end; j++)
//                 System.out.print(num[row_start][j] + " ");
//             row_start++;

//             // Right column
//             for (int i = row_start; i <= row_end; i++)
//                 System.out.print(num[i][col_end] + " ");
//             col_end--;

//             // Bottom row
//             if (row_start <= row_end) {
//                 for (int j = col_end; j >= col_start; j--)
//                     System.out.print(num[row_end][j] + " ");
//                 row_end--;
//             }

//             // Left column
//             if (col_start <= col_end) {
//                 for (int i = row_end; i >= row_start; i--)
//                     System.out.print(num[i][col_start] + " ");
//                 col_start++;
//             }

//             System.out.println();
//         }



//     }
// }


public class spiral{
    public static void main(String args[]){

       int arr[][]= {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

        int startcol=0;
        int endcol=arr[0].length-1;

        int startrow=0;
        int endrow=arr[0].length-1;

        while(startrow<=endrow && startcol<=endcol){

        //top
        for(int j=startcol; j<=endcol; j++){
            System.out.print(arr[startrow][j]+" ");
            

        }
        //right
        for(int i=startrow+1; i<=endrow; i++){
            System.out.print(arr[i][endcol]+" ");
           

        }

        //bottom
        for(int i=endcol-1; i>=startcol; i--){
            System.out.print(arr[endrow][i]+" ");

        }
        //left
        for(int i=endrow-1; i>=startrow+1; i--){
            System.out.print(arr[i][startcol]+" ");

            
        }

        startcol++;
        startrow++;
         endcol--;
         endrow--;

        System.out.println();
    }
    }
}