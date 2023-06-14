import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class p_TopView {
    static class Node {
        int data;
        int hd; // horizontal distance
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.hd = Integer.MAX_VALUE;
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

    static void TopView(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        root.hd = 0;
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            int hd = curr.hd;
            int data = curr.data;

            if (!map.containsKey(hd)) {
                map.put(hd, data);
            }
            if (curr.left != null) {
                curr.left.hd = hd - 1;
                q.add(curr.left);
            }
            if (curr.right != null) {
                curr.right.hd = hd + 1;
                q.add(curr.right);
            }
        }
        for (int key : map.keySet()) {
            System.out.print(map.get(key) + " ");
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = buildTree(nodes);
        TopView(root);
    }
}
