public class d_PostOrderSequence {
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
    static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1) 
            return null;
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
    // POSTORDER SEQUENCE
    static Node postOrder(Node root){
        if(root == null){
            return null;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
        return root;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(nodes);
        System.out.println("Root of the BT : " + root.data);
        postOrder(root);
    }
}


