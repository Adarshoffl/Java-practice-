package Linkedlist;

public class deleteNnodes {

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

    public void delete(){
        int m=2;
        int n=2;
        node curr=head;

        while(curr!=null){
            for(int i=1; i<m && curr!=null; i++){
            curr=curr.next;
            }

            node temp=curr.next;

            for(int i=0; i<n && temp!=null; i++){
                 temp=temp.next;
            }

            curr.next=temp;
            curr=temp;

        }
        System.out.println();
    }



    
    public static void main(){
        deleteNnodes ll= new deleteNnodes();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.addlast(7);
        ll.addlast(8);

        ll.print();
        ll.delete();
        ll.print();


    }
}
