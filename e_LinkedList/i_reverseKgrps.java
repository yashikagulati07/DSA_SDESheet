class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class i_reverseKgrps {
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

    static Node reverseKGroups(Node head, int k){
        if(head == null || k==1){
            return head;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = dummy;
        Node nex = dummy;
        Node pre = dummy;
        int cnt = 0;
        while(curr.next != null){
            curr = curr.next;
            cnt++;
        }
        while(cnt >= k){
            curr = pre.next;
            nex = curr.next;
            for(int i=1; i<k; i++){
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            pre = curr;
            cnt -= k;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        Node head = null;
        head = insertAtEnd(head, 1);
        head = insertAtEnd(head, 2);
        head = insertAtEnd(head, 3);
        head = insertAtEnd(head, 4);

        print(head);
        head = reverseKGroups(head, 2);
        print(head);
    }
}
