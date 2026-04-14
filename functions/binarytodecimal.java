package functions;

public class binarytodecimal {

    public static void bintodec(int binnum){
        int mybin=binnum;
        int pow = 0;
        int decNum=0;

        while(binnum>0){
            int lastdigit = binnum%10;
            decNum =decNum + (lastdigit* (int)Math.pow(2,pow));

            pow++;
            binnum=binnum/10;
        }

        System.out.println("decimal of "+ mybin+" = "+ decNum);

    }

    public static void dectobin(int n){

        int mydec=n;
        int pow=0;
        int binNum=0;

        while(n>0){
            int rem =n%2;
            binNum= binNum +(rem* (int)Math.pow(10,pow));

            pow++;
            n=n/2;

        }
        
        System.out.println("binary of "+mydec+"="+binNum);

    }

    public static void main(String args[]){
        bintodec(101010101);
        dectobin(4);
    }

}
    

