package CodingClub2023;
public class RemoveNthNode {
    node head = null;
    node last = null;

    class node {
        int data;
        node next;
        node previous;

        node(int d) {
            this.data = d;
            this.next = null;
            this.previous = null;
        }
    }

    public void addLast(int data) {
        node new_node = new node(data);

        if(head == null) {
            head = new_node;
            last = new_node;
            return;
        }
        last.next = new_node;
        new_node.next = null;
        new_node.previous = last;
        last = new_node;
    }

    public void printList() {
        node ptr = head;

        while(ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.print("null");
    }
    
    public void removeNthNodeFromEnd(int n) {
        if(head == last ) {
            head = null;
            last = null;
            return;
        }
        node ptr,ptr1;
        ptr = last;
        ptr1 = last;
        int i=0;
        while(i<n) {
            ptr1 = ptr;
            ptr = ptr1.previous;
            i++;
        }
        ptr1 = ptr1.next;

        if(ptr1 == null) {
            ptr.next = ptr1;
            return;
        }
        if(ptr==null) {
            head = ptr1;
            return;
        }
        ptr.next = ptr1;
        ptr1.previous = ptr;
    }
    public static void main(String[] args) {
        RemoveNthNode list = new RemoveNthNode();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        int n = 2;
        list.removeNthNodeFromEnd(n);

        list.printList();
    }
}