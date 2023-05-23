class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class o_Add1toALinkedList {
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

    static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static Node addOne(Node head){
        head = reverse(head);
        Node curr = head;
        int carry = 1;
        while(curr != null){
            int sum = curr.data + carry;
            curr.data = sum % 10;
            carry = sum / 10;
            curr = curr.next;
        }
        if(carry > 0){
            Node newDigit = new Node(carry);
            curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newDigit;
        }
        return reverse(head);
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtEnd(head, 1);
        head = insertAtEnd(head, 2);
        head = insertAtEnd(head, 9);
        System.out.println("Original List:");
        print(head);
        head = addOne(head);
        System.out.println("List after adding 1:");
        print(head);
    }
}
