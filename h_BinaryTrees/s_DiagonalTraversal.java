import java.util.LinkedList;
import java.util.Queue;

public class s_DiagonalTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int idx = -1;
    static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1) 
            return null;
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    static void diagonalTraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            // add left child of curr to queue
            if(curr.left != null){
                q.add(curr.left);
            }
            // process the right child of the curr node 
            Node rightNode = curr.right;
            while(rightNode != null){
                System.out.print(rightNode.data + " ");

                // Add the left child of the right node to the queue
                if(rightNode.left != null){
                    q.add(rightNode.left);
                }
                rightNode = rightNode.right;
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
                //        1
                //       / \
                //      2   3
                //     / \   \
                //    4   5   6 

        Node root = buildTree(nodes);
        diagonalTraversal(root);
    }
}
