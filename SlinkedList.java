class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insertBegin(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void insertEnd(int data) {
        Node newnode = new Node(data);
        if(head == null) {
            newnode.next = head;
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void insertPos(int pos, int data) {
        if (pos == 0) {
            insertBegin(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        for(int i=0; i<pos-1; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Out of boundary");
            }
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}

public class SlinkedList {
    public static void main (String [] args) {
        LinkedList list = new LinkedList();
        list.insertBegin(10);
        list.insertBegin(20);
        list.display();
        System.out.println();
        list.insertEnd(0);
        list.display();
        System.out.println();
        list.insertPos(1, 15);
        list.display();
    }
}