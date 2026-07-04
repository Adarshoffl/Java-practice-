package Sorting;

public class selectionsort {

    public static void selection(int arr[]){
        
        for(int i=0; i<arr.length-1;i++){
            int minposi=i;
            for(int j=i+1; j<arr.length;j++){

                if(arr[minposi]>arr[j]){
                    minposi= j;
                }
            }

            int temp = arr[minposi];
            arr[minposi]= arr[i];
            arr[i]=temp;
        }

         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[]= {5,4,1,3,2};

        selection(arr);
    }
}
