package Linkedlist;

public class zigzag {

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
         System.out.println();
    }

    public void getmid(){
        node slow=head;
        node fast=head;

        while(fast!=null&& fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
            
        }

        node mid=slow;
        node prev=null;
        node next;

        while(mid!=null){
             next=mid.next;
             mid.next=prev;
             prev=mid;
             mid=next;
        }

        node left=head;
        node right=prev;
        node tempL,tempR;
        
        while(left!=null&& right!=null){
            tempL=left.next;
            left.next=right;
            tempR=right.next;
            right.next=tempL;

            right=tempR;
            left=tempL;
        }
    }


    public static void main(String args[]){

        zigzag ll= new zigzag();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);

        ll.print();
        ll.getmid();
        ll.print();
    }
    
}
