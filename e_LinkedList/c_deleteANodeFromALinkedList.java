class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class c_deleteANodeFromALinkedList {
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

    static Node deleteNode(Node head, int key){
        if(head == null){
            return null;
        }
        if(head.data == key){
            return head.next;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr != null && curr.data != key){
            prev = curr;
            curr = curr.next;
        }
        // if key not present in ll
        if(curr == null) return head;
        // unlink the node from the ll
        prev.next = curr.next;
        return head;
    }
    

    public static void main(String[] args) {
        Node head = null;
        head = insertAtEnd(head, 1);
        head = insertAtEnd(head, 2);
        head = insertAtEnd(head, 3);
        head = insertAtEnd(head, 4);
        head = insertAtEnd(head, 5);
        print(head);
        head = deleteNode(head, 3);
        print(head);

    }
}
