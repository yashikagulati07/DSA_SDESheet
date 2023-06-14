public class k_CheckIfTwoTreesAreIdentical {
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

    static Node buildTree(int nodes[]) {
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    static boolean isIdentical(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.data != q.data) {
            return false;
        }
        boolean left = isIdentical(p.left, q.left);
        boolean right = isIdentical(p.right, q.right);

        return left && right;
    }

    public static void main(String[] args) {
        int nodes1[] = { 1, 2, 3, 4, -1, -1, 5, -1, -1, -1 };
        int nodes2[] = { 1, 2, 3, 4, -1, -1, 5, -1, -1, -1 };
        Node root1 = buildTree(nodes1);
        Node root2 = buildTree(nodes2);

        boolean identical = isIdentical(root1, root2);

        if (identical) {
            System.out.println("Identical.");
        } else {
            System.out.println("Not Identical.");
        }
    }

}
