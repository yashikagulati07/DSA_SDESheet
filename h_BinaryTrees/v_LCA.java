public class v_LCA {
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
    
    static Node findLCA(Node root, int node1, int node2){
        if(root == null){
            return null;
        }
        if(root.data == node1 || root.data == node2){
            return root;
        }
        Node leftLCA = findLCA(root.left, node1, node2);
        Node rightLCA = findLCA(root.right, node1, node2);

        if(leftLCA != null && rightLCA != null ){
            return root;
        }
        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(nodes);
        Node lca = findLCA(root, 5, 4);
        if(lca != null){
            System.out.println(lca.data);
        } else{
            System.out.println("lca does not exist");
        }
    }
}

