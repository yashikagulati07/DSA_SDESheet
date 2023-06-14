public class r_BoundaryTraversal {
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
        if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
    // ------------- PRINT LEAF NODES ---------------
    static void printLeaf(Node root){
        if(root == null){
            return;
        }
        printLeaf(root.left);
        if(root.left == null && root.right == null){
            System.out.print(root.data + " ");
        }
        printLeaf(root.right);
    }
    // ------------- PRINT LEFT BOUNDARY ---------------
    static void printLeftBoundary(Node root){
        if(root == null){
            return;
        }
        if(root.left != null){
            System.out.print(root.data + " ");
            printLeftBoundary(root.left);
        }
        else if(root.right != null){
            System.out.print(root.data + " ");
            printLeftBoundary(root.right);
        }
    }
    // ------------- PRINT RIGHT BOUNDARY ---------------
    static void printRightBoundary(Node root){
        if(root == null){
            return;
        }
        if(root.right != null){
            printRightBoundary(root.right);
            System.out.print(root.data + " ");
            
        }
        else if(root.left != null){
            printRightBoundary(root.left);
            System.out.print(root.data + " ");            
        }
    }
    // ----------- PRINT BOUNDARY ---------------------
    static void printBoundary(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        printLeftBoundary(root.left);
        printLeaf(root.left);
        printLeaf(root.right);
        printRightBoundary(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        Node root = buildTree(nodes);
        //System.out.println(root.data);
        printBoundary(root);
    }
}
