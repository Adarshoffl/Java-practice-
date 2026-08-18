package Linkedlist;

public class doubleLL {

     public class node{

        int data;
        node prev;
         node next;

        node(int val){
           this.data=val;
           this.next=null;
           this.prev=null;
        }

    }

    public  static node head;
    public static node tail;

    public void addlast(int val){
        node newnode= new node(val);

        if(head==null){
           head=tail=newnode;
           return;
        }

    //    tail.next=newnode;
    //    newnode.prev=tail;
    //    tail=newnode;

    newnode.next=head;
    head.prev=newnode;
    head=newnode;
       
    }

    public void print(){
        node temp=head;

        if(head==null&&head.next==null){
             System.out.println("empty");
        }
        
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }


    }
    public static void main(String args[]){

        doubleLL ll= new doubleLL();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);

       ll.print();

    }
    
}
