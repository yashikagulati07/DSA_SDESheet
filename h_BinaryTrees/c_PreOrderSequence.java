public class c_PreOrderSequence {
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
    // PREORDER SEQUENCE
    static Node preOrder(Node root){
        if(root == null){
            return null;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
        return root;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(nodes);
        System.out.println("Root of the BT : " + root.data);
        preOrder(root);
    }
}

