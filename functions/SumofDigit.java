package functions;

public class SumofDigit {

    public static  int digitsum(int n){
        int num=n;

        int sum=0;
        while(n>0){
            int rem = n%10;
            sum= sum+rem;

            //removed last digit
            n=n/10;
        }

        return sum;

        }

        public static void main(String[] args) {

            int result= digitsum(1234);
            System.out.println(result);
        }
    }
    

