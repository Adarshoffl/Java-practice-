package Arrays;

public class prefixsum {

    public static void prefixMAXsub(int numbers[]) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int prefix[]= new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;

                sum = 0;
               
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
        int numbers[] = { 1,-2,6,-1,3 };

        prefixMAXsub(numbers);
    }
}
