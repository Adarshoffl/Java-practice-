package ArrayList;

import java.util.ArrayList;

public class Swapnumbers {

    public static void swap(ArrayList<Integer> num) {
        int idx1=1 , idx3=3;

        int temp= num.get(idx1);
        num.set(idx1, num.get(idx3));
        num.set(idx3,temp);

        System.out.println(num);
        
    }
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        num.add(2);
        num.add(5);
        num.add(9);
        num.add(3);
        num.add(6);
        System.out.println(num);

            swap(num);
      
    }
}
