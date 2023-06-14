import java.util.LinkedList;
import java.util.Queue;

public class e_LevelOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int idx = -1;
    static Node Buildtree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = Buildtree(nodes);
        newNode.right = Buildtree(nodes);
        return newNode;
    }
    // Level Order Traversal
    public static void LevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root == null){
            return ;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data + " ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = Buildtree(nodes);
        System.out.println(root.data);
        LevelOrder(root);
    }
}
