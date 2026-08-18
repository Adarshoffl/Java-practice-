package STACK;

import java.util.Stack;

public class StockSpan{

    public static void stockspan(int Stock[], int Span[]){

        Stack <Integer> s = new Stack<>();
        Span[0]=1;
        s.push(0);

        for (int i=1; i<Stock.length; i++){
            
            int currprice = Stock[i];

            while(!s.isEmpty() && currprice>Stock[s.peek()]){
                s.pop();
            }
                if(s.isEmpty()){
                    Span[i]=i+1;
                }else{
                    int prevhigh = s.peek();
                    Span[i]=i-prevhigh;
                }

                s.push(i);
            }
        }

    

    public  static void main(String args[]){
        int Stock[]={100,80,60,70,60,85,100};
        int Span[]= new int[Stock.length];

         stockspan(Stock,Span);
        for(int i=0; i<Span.length; i++){
            System.out.println(Span[i]+" ");
        }

    }
}