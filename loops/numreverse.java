

public class numreverse {

    public static void main(String[] args) {
        
        int n = 10899;

        while(n>0){
            int lastnum= n%10;
            System.out.print(lastnum);
            n/=10;
        }
        System.out.println();
    }
    
}
