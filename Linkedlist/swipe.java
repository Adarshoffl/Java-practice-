package Linkedlist;

public class swipe {

    public class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public node head;
    public node tail;

    public void addlast(int val){

        node newnode= new node(val);
         
        if(head==null){
            head=tail=newnode;
            return;
        }

        tail.next=newnode;
        tail=newnode;

    }

    public void print(){

        if(head==null){
            System.out.println("empty");
            return;
        }
        node temp=head;
         while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            
         }
    }


    public void swipenum(){
        int x=2,y=4;
        node prevx=null;
        node currx=head;

        while(currx!=null&&currx.data!=x){
            prevx=currx;
            currx=currx.next;
        }

        node curry=head;
        node prevy=null;
        while(curry!=null&&curry.data!=y){
            prevy=curry;
            curry=curry.next;
        }

        prevx.next=curry;
        prevy.next= currx;


        node temp=currx.next;
        currx.next=curry.next;
       curry.next=temp;

       System.out.println();
    }
    
    public static void main(String args[]){
        swipe ll= new swipe();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
    

        ll.print();
        ll.swipenum();
        ll.print();


    }


    
}
