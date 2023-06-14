public class m_CheckIfTheTreeIsBalanced {
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
    static Node buidTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buidTree(nodes);
        newNode.right = buidTree(nodes);
        return newNode;
    }

    static int height(Node root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        if(left == -1){
            return -1;
        }
        int right = height(root.right);
        if(right == -1){
            return -1;
        }
        if(Math.abs(left - right) > 1){
            return -1;
        }
        return Math.max(left, right) + 1;
    }

    static boolean isBalanced(Node root){
        if(root == null){
            return true;
        }
        if(height(root) == -1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buidTree(nodes);
        // System.out.println(root.data);
        if(isBalanced(root)){
            System.out.println("Balanced ");
        } else{
            System.out.println("Not balanced ");
        }
    }
}
