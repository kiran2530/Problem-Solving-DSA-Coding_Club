package CodingClub2023;
public class RotateLinkedList {
    static Node head = null, tail = null;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void insert(int data) {
        Node new_Node = new Node(data);
        
        if(head == null) {
            head = new_Node;
            tail = new_Node;
        }
        else {
            tail.next = new_Node;
            tail = new_Node;
        }
    }

    public static void diplayList() {
        Node temp = head;
        if(head == null) {
            System.out.println("List is Empty...");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node rotateLinkedList(int k) {
        Node temp = head,last = null;
        int l = 0;
        if(head.next == null || head == null) {
            return head;
        }
        while(temp!= null) {
            l++;
            if(temp.next == null) {
                last = temp;
            }
            temp = temp.next;
        }

        k = k % l;
        l = l-k;
        temp = head;
        while(l != 1) {
            temp = temp.next;
            l--;
        }
        
        last.next = head;
        head = temp.next;
        temp.next = null;

        return head;
    }
    public static void main(String[] args) {
        RotateLinkedList list = new RotateLinkedList();
        list.insert(0);
        list.insert(1);
        list.insert(2);
        // list.insert(3);
        // list.insert(4);

        head = rotateLinkedList(4);
        diplayList();
    }
}
