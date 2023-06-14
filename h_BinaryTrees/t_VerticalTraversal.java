import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class t_VerticalTraversal {
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

    public static void verticalTraversal(Node root) {
        if (root == null) {
            return;
        }

        // Create a map to store nodes at each vertical distance
        Map<Integer, List<Integer>> verticalMap = new HashMap<>();

        // Create a queue for level order traversal
        Queue<Node> queue = new LinkedList<>();
        Queue<Integer> distanceQueue = new LinkedList<>();

        // Enqueue the root node with vertical distance as 0
        queue.add(root);
        distanceQueue.add(0);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            int distance = distanceQueue.poll();

            // Update the vertical map
            if (!verticalMap.containsKey(distance)) {
                verticalMap.put(distance, new ArrayList<>());
            }
            verticalMap.get(distance).add(curr.data);

            // Enqueue the left child with distance - 1
            if (curr.left != null) {
                queue.add(curr.left);
                distanceQueue.add(distance - 1);
            }

            // Enqueue the right child with distance + 1
            if (curr.right != null) {
                queue.add(curr.right);
                distanceQueue.add(distance + 1);
            }
        }

        // Print the nodes in vertical order
        for (int distance : verticalMap.keySet()) {
            List<Integer> nodes = verticalMap.get(distance);
            System.out.println("Vertical distance " + distance + ": " + nodes);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(nodes);
        System.out.println("Root of the BT : " + root.data);
        verticalTraversal(root);
    }
}
