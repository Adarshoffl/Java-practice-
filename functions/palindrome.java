package functions;

public class palindrome {

    public static void isPalindrome(int n){

        int num=n;
        int reverse=0;

        for(;num>0;num=num/10){

            int rem= num%10;

            reverse=reverse*10+rem;


        }

        if(n==reverse){
            System.out.println(n+ " is palindrome");
        }else{
           System.out.println(n+ " is not palindrome"); 
        }


    }

    public static void main(String[] args) {
        isPalindrome(121);
    }
    
}
