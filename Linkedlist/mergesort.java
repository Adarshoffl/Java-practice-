package Linkedlist;

public class mergesort {

    public class node{
        node next;
        int data;
        node(int val){
            this.data=val;
            this.next=null;
        }
    }

    public static node head;
    public static node tail;

    public void addfirst(int val){

        node newnode= new node(val);
         
        if(head==null){
            head=tail=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;

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

    public static void main(String args[]){

        mergesort ll= new mergesort();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);

        ll.print();
    }
    
}
