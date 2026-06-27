package Arrays;

public class maxsubarray {

    public static void MAXsub(int numbers[]) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;

                sum = 0;
               
                
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                     sum += numbers[j];
                }
                System.out.println(" = " + sum);
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
            System.out.println();
        }

        System.out.println("maximum number from subarray is =" + max);
        System.out.println("minimum number from subarray is =" + min);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 6, 8, 10 };

        MAXsub(numbers);
    }
}
