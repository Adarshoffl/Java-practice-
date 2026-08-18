package STACK;

import java.util.Stack;

public class Stackreverse {

    public static void pushAtbuttom(Stack<Integer> s ,int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtbuttom(s,data);
        s.push(top);
    }

    public static void reversestack(Stack<Integer> s){
             
        if(s.isEmpty()){
            return;
        }

        int top=s.pop();
        reversestack(s);
        pushAtbuttom(s,top);
    }

    public static void print(Stack<Integer> s){
      while(!s.isEmpty()){
        System.out.println(s.pop());
      }
    }
    
    public static void main(String args[]){
        Stack<Integer> s= new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        reversestack(s);
        print(s);
    }
}
