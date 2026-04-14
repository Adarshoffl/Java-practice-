package functions;

public class EvenOdd {

    public static void isEven(int a){
        int num=a;

        if(num%2==0){
            System.out.println(num+" isEven");
        }else{
            System.out.println(num+" isOdd");
        }
    }
    
    public static void main(String args[]){
        isEven(25);
    }
}
