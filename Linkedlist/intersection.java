package Linkedlist;

public class intersection {

     public class node{
        node next;
        int data;
        node(int val){
            this.data=val;
            this.next=null;
        }
    }

    public  node head;
    public  node tail;

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

    public void common(node listA,node listB){

        node com=new node(6);
        com.next=new node(7);

        node tempA=listA;
        while(tempA.next!=null){
            tempA=tempA.next;
        }
        tempA.next=com;

         node tempB=listB;
        while(tempB.next!=null){
            tempB=tempB.next;
        }
        tempB.next=com;

        
    }




    public static void main(String args[]){
        intersection listA= new intersection();
         listA.addlast(1);
         listA.addlast(2);
        listA.addlast(3);

        
       
        intersection listB= new intersection();
        listB.addlast(4);
        listB.addlast(5);
         
        

    listA.common(listA.head, listB.head);

    System.out.print("List A: ");
    listA.print();

    System.out.println();

    System.out.print("List B: ");
    listB.print();
        

    }
    
}
