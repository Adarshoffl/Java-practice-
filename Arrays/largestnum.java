package Arrays;

public class largestnum {

    public static int getlargest( int number[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<=number.length; i++){
            if(largest<number.length){
                largest=number[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int number[]= {1,2,3,6,4,5};

        System.out.println("largest number in array ="+ getlargest(number));

    }
    
}
