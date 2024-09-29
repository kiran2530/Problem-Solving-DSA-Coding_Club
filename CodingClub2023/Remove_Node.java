public class Remove_Node {
    static int count;
    node head = null;
    node last = null;
    
    class node {
        int data;
        node next;

        node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void addLastNode(int d) {
        count++;
        node ptr = new node(d);

        if(head == null) {
            head = ptr;
            last = ptr;
            return;
        }
        last.next = ptr;
        last = ptr;
    }

    public void printList() {
        node ptr = head;

        while(ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public void remove_Nth_Node(int n) {
        node ptr = head;
        if(count == n) {
            head = head.next;
            return;
        }
        int i = 1;
        while(i < (count - n)) {
            ptr = ptr.next;
            i++;
        }

        ptr.next = ptr.next.next;
    }

    public static void main(String[] args) {
        Remove_Node list = new Remove_Node();
        list.addLastNode(1);
        list.addLastNode(2);
        list.addLastNode(3);
        list.addLastNode(4);
        list.addLastNode(5);

        int n = 2;
        list.remove_Nth_Node(n);
        list.printList();
    }
}
