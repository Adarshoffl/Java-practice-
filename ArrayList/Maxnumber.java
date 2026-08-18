package ArrayList;

import java.util.ArrayList;

public class Maxnumber {
    public static void main(String[] args) {

        ArrayList<Integer> num= new ArrayList<>();
        num.add(2);
        num.add(5);
        num.add(9);
        num.add(6);
        num.add(3);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<num.size(); i++){
            // if(max<num.get(i)){
            //     max=num.get(i);
            // }

            max= Math.max(max, num.get(i));
        }

        System.err.println(max);

    }
    
}
