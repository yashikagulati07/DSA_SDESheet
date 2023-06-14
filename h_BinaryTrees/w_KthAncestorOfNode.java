public class w_KthAncestorOfNode {
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
        if(nodes[idx]== -1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    static Node temp = null;
    static int k;

    static Node kthAncestor(Node root, int node) {
        // Base case
        if (root == null)
            return null;
        if (root.data == node ||
                (temp = kthAncestor(root.left, node)) != null ||
                (temp = kthAncestor(root.right, node)) != null) {
            if (k > 0)
                k--;
            else if (k == 0) {
                // print the kth ancestor
                System.out.print("Kth ancestor is: " + root.data);

                // return null to stop further backtracking
                return null;
            }
            // return current node to previous call
            return root;
        }
        return null;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
                //        1
                //       / \
                //      2   3
                //     / \   \
                //    4   5   6   
        Node root = buildTree(nodes);
        System.out.println(root.data);
        k=1;
        Node parent = kthAncestor(root, 5); 
        if (parent != null)
        System.out.println("-1");
    }
}
