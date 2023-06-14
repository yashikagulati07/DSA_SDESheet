public class l_SubtreeOfAnotherTree {
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
    
    public static boolean isSubtree(Node s, Node t) {
        if (s == null)
            return false;
        if (isSameTree(s, t))
            return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public static boolean isSameTree(Node s, Node t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
        if (s.data != t.data)
            return false;
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }


    public static void main(String[] args) {
        int nodes1[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int nodes2[] = {2,4,-1,-1,5,-1,-1};
        Node root1 = buildTree(nodes1);
        Node root2 = buildTree(nodes2);

        if(isSubtree(root1, root2)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
    }
}

