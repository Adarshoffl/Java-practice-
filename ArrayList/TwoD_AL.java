package ArrayList;

import java.util.ArrayList;

public class TwoD_AL {
    
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> Mainlist= new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();

        for(int i=1; i<=5; i++){

            list.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        Mainlist.add(list);
         Mainlist.add(list2);
          Mainlist.add(list3);

          System.out.println(Mainlist);

          for(int i=0; i<Mainlist.size(); i++){
            ArrayList<Integer> currlist= Mainlist.get(i);

            for(int j=0; j<currlist.size(); j++){

                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
          }
    }
}
