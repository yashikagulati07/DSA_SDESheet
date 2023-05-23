class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class j_MergeTwoSortedLinkedList {
    static Node insertAtEnd(Node head, int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;
        return head;
    }

    static void print(Node head) {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    static Node mergeTwoSortedLinkedList(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.data > l2.data) {
            Node temp = l1;
            l1 = l2;
            l2 = temp;
        }
        Node res = l1;
        while (l1.next != null && l2 != null) {
            if (l1.next.data <= l2.data) {
                l1 = l1.next;
            } else {
                Node temp = l2.next;
                l2.next = l1.next;
                l1.next = l2;
                l2 = temp;
            }
        }
        if (l2 != null) {
            l1.next = l2;
        }
        return res;
    }

    public static void main(String[] args) {
        Node head1 = null;
        head1 = insertAtEnd(head1, 1);
        head1 = insertAtEnd(head1, 4);
        head1 = insertAtEnd(head1, 6);
        print(head1);
        Node head2 = null;
        head2 = insertAtEnd(head2, 2);
        head2 = insertAtEnd(head2, 5);
        head2 = insertAtEnd(head2, 7);
        print(head2);
        Node head3 = mergeTwoSortedLinkedList(head1, head2);
        print(head3);
    }
}
