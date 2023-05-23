class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class n_AddTwoNumbersOfLinkedList {
    static Node insertAtEnd(Node head, int data){
        Node nn = new Node(data);
        if(head == null){
            head = nn;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = nn;
        return head;
    }

    static void print(Node head){
        if(head == null) return;
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    static Node addtwoLinkedList(Node l1, Node l2){
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry ==1){
            int sum = 0;
            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;
            Node nn = new Node(sum%10);
            temp.next = nn;
            temp = temp.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        Node head1 = null;
        head1 = insertAtEnd(head1, 2);
        head1 = insertAtEnd(head1, 4);
        head1 = insertAtEnd(head1, 3);
        print(head1);
        Node head2 = null;
        head2 = insertAtEnd(head2, 5);
        head2 = insertAtEnd(head2, 6);
        head2 = insertAtEnd(head2, 7);
        head2 = insertAtEnd(head2, 9);
        print(head2);
        Node head3 = addtwoLinkedList(head1, head2);
        print(head3);

    }
}
