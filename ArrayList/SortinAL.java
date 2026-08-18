package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortinAL {

        public static void main(String[] args) {

        ArrayList<Integer> num= new ArrayList<>();
        num.add(2);
        num.add(5);
        num.add(9);
        num.add(6);
        num.add(3);

        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);

          Collections.sort(num, Collections.reverseOrder());
          System.out.println(num);
        
        }
    
}
