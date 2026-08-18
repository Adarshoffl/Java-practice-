package ArrayList;

import java.util.ArrayList;

public class pair_sum_optimal {

    public static boolean pairsum(ArrayList<Integer> list, int target){

        int l=0;
        int r=list.size()-1;
        while(l<r){
            int sum= list.get(r)+list.get(l);
            if(sum==target){
                return true;
            }else if(sum<target){
                l++;
            }else{
                r--;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1, 2, 3, 4, 5, 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;

        System.out.println( pairsum(list, target));
    
    }
    
}
