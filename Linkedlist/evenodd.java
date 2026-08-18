package Linkedlist;
public class evenodd {
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

    public  void print(){

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

    public void solution(){
        node evenhead=null;
        node eventail=null;

        node oddhead=null;
        node oddtail=null;

        node curr=head;

        while(curr!=null){

     node next = curr.next; 
    curr.next = null;     

            if(curr.data%2==0){
                if(evenhead==null){
                    evenhead=eventail=curr;
                }else{
                    eventail.next=curr;
                    eventail=curr;
                }
            }else{
                if(oddhead==null){
                    oddhead=oddtail=curr;
                }else{
                    oddtail.next=curr;
                    oddtail=curr;
                }
            }
            curr = next;
        }

     
        eventail.next=oddhead;
        head=evenhead;

                System.out.println();

    }


    public static void main(String args[]){

        evenodd ll= new evenodd();
        
        ll.addlast(8);
        ll.addlast(12);
        ll.addlast(10);
        ll.addlast(5);
        ll.addlast(4);
        ll.addlast(1);
        ll.addlast(6);

        ll.print();
        ll.solution();
        ll.print();


    }


}
