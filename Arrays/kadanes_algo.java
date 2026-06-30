package Arrays;

public class kadanes_algo {

    public static void kadanes(int numbers[]){

        int max= Integer.MIN_VALUE;
        int sum=0;
        
        for(int i=0; i<numbers.length;i++){
            sum=sum+numbers[i];
            if(sum<0){
                sum=0;
            }
            max=Math.max(sum,max);
        }
        System.out.println(max);
    }
    

      public static void main(String args[]) {
        int numbers[] = { -2,-3,4,-1,-2,1,5,-3 };

        kadanes(numbers);
    }


}
