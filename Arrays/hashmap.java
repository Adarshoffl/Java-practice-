

import java.util.*;
public class hashmap {
    public static void main (String args[]){

        HashMap<String,Integer>hp= new HashMap<>();

        hp.put("india", 300);
        hp.put("USA", 322);
        hp.put("mangal", 433);
        hp.put("mangolia", 2324);
        hp.put("malasia", 893);
        hp.put("indonesia", 444);


        System.out.println(hp);

        Set<String>keys= hp.keySet();

        for (String k : keys) {

            System.err.println("key ="+k+ ", values = "+hp.get(k));
            
        }
    }
    
}
