package STACK;

import java.util.Stack;

public class NextGreater {

    public static void nextgrater(int arr[]){

    Stack<Integer>s=new Stack<>();
    int nextgrater[]=new int[arr.length];

    for(int i=arr.length-1; i>=0; i--){
        while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
            s.pop();
        }

        if(s.isEmpty()){
            nextgrater[i]= -1;
        }else{
            nextgrater[i]=arr[ s.peek()];
        }

        s.push(i);
    }

     for(int i=0; i<=nextgrater.length;i++){
        System.out.println(nextgrater[i]+" ");
     }
    }

    public static void main(String args[]){
        int arr[]={8,2,5,10,6,0};

        nextgrater(arr);
       

    }
    
}
