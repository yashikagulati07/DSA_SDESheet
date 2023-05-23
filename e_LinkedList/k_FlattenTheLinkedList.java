class Node{
    int data;
    Node next;
    Node bottom;
    public Node(int data){
        this.data = data;
        this.next = null;
        this.bottom = null;
    }
}


public class k_FlattenTheLinkedList {
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

    static Node merge2Lists(Node a, Node b){
        Node temp = new Node(0);
        Node res = temp;

        while(a != null && b != null){
            if(a.data < b.data){
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            }
            else{
                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }
        }
        if(a != null){
            temp.bottom = a;
        } else{
            temp.bottom = b;
        }
        return res.bottom;
    }

    static Node flatten(Node head){
        if(head == null || head.next == null){
            return head;
        }
        head.next = flatten(head.next);
        head = merge2Lists(head, head.next);
        return head;
    }
    public static void main(String[] args) {
        Node head = null;
        head = insertAtEnd(head, 1);
        head = insertAtEnd(head, 2);
        head = insertAtEnd(head, 3);
        print(head);
    }
}
