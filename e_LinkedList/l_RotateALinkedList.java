class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class l_RotateALinkedList {
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
        if (head == null)
            return;
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    

    static Node rightRotate(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int length = getLength(head);
        // Adjust k to a valid range
        k = k % length;
        if (k == 0) {
            return head;
        }
        int stepsToRotate = length - k;
        Node current = head;
        Node newHead = null;
        Node prev = null;
        // Move to the kth node from the beginning
        for (int i = 0; i < stepsToRotate; i++) {
            prev = current;
            current = current.next;
        }
        // Set the new head and break the link
        newHead = current;
        prev.next = null;
        // Move to the end of the list and connect it to the original head
        Node temp = current;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        return newHead;
    }

    static int getLength(Node head) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtEnd(head, 1);
        head = insertAtEnd(head, 2);
        head = insertAtEnd(head, 3);
        head = insertAtEnd(head, 4);
        head = insertAtEnd(head, 5);

        int k = 2;

        System.out.println("Original List:");
        print(head);

        Node rotatedHead = rightRotate(head, k);

        System.out.println("List after right rotation by " + k + " positions:");
        print(rotatedHead);
    }
}
