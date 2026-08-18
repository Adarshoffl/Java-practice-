package ArrayList;

import java.util.ArrayList;

public class Pair_sum2 {

    public static boolean pairsum(ArrayList<Integer>list, int target){
        int bp=-1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }

     int l=bp+1;
     int r=bp;

     while(l!=r){
        int sum= list.get(l)+list.get(r);
        if(sum==target){
            return true;
        }
        
        if(sum<target){
            l=(l+1)%list.size();
        }else{
            r=(list.size()+r-1)%list.size();
        }
     }
     return false;
    }

    public static void main(String args []){
     ArrayList<Integer> list = new ArrayList<>();
     //11, 15, 6, 8, 9, 10 - Sorted
       list.add(11);
       list.add(15);
       list.add(6);
       list.add(8);
       list.add(9);
       list.add(10);
       int target = 16;

       System.err.println( pairsum(list, target));

}
}

