package Linkedlist;



public class Linkedlist {

    // class Node creation
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head and tail creation
    public static Node head;
    public static Node tail;
    public static int size;

    // add first code
    public void addfirst(int data) {

        // 1.create a new node
        Node NewNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = NewNode;
            return;
        }

        // 2. assign a address of next node #linking
        NewNode.next = head;

        // 3. shift head position to newnode
        head = NewNode;
    }

    // addlast code
    public void addlast(int data) {
        Node newnode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            return;
        }

        tail.next = newnode;

        tail = newnode;
    }

    public void output() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }
        System.out.println("null");

    }

    public void addmid(int idx, int data) {

        if (idx == 0) {
            addfirst(data);
            return;
        }

        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next = newnode;

    }

    // remove or delete firstdata
    public int removefirst() {
        int value = head.data;
        size--;
        head = head.next;
        return value;

    }

    // remove or delete lastdata
    public int removelast() {
        int value = tail.data;
        size--;
        tail = tail.next;
        return value;

    }

    // iteration on LinkedList
    public static void iteration() {
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // recursiv
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // find the nth node and delete it
    public void deletenthnode(int n) {
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;
            return;
        }

        int i = 1;
        int findidx = sz - n;
        Node prev = head;
        while (i < findidx) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;

    }

    public void main(String args[]) {

        Linkedlist list = new Linkedlist();

        // 1,2,3,30,4,5
        list.addfirst(2);
        list.addfirst(1);
        list.addlast(3);
        list.addlast(4);
        list.addmid(3, 30);

        System.out.println(size);

        // list.output();

        // list.removefirst();
        // list.removelast();
        // System.out.println(size);

        // System.out.println(list.recSearch(3));

        list.output();
        list.deletenthnode(3);
        list.output();

    }

}
