package Linkedlist;


public class removecycle {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        Node newnode =new Node(data);

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

        Node temp =head;
        while (temp!=null){
             System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
    }


    public boolean Cycle(Node head) {

       Node slow=head;
        Node fast=head;

        if(head==null || head.next==null) 
        return false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
              return true;
            }

        }
        return false;
    }


        
    public  void remove(Node head){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                cycle=true;
                break;
            }
        }

        if(cycle==false){
            return;
        }

        Node prev=null;
        slow=head;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }

    public static void main(String args[]){
        removecycle list = new removecycle();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(4);
        list.addfirst(5);
        tail.next = head.next;
        

        System.out.println(list.Cycle(head));
        list.remove(head);
         System.out.println(list.Cycle(head));

    
       
        

    }
    
}
