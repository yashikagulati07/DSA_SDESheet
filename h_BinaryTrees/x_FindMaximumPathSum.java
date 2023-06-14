
public class x_FindMaximumPathSum {
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

    static int maxSum = Integer.MIN_VALUE;
    static int maxLen = 0;
    static void sumOfLongestPath(Node root, int sum, int len){
        if(root == null){
            return ;
        }
        if(root.left == null && root.right == null){
            sum += root.data;
            len++;
            if(len > maxLen){
                maxLen = len;
                maxSum = sum;
            }
            else if(len == maxLen && sum > maxSum){
                maxSum = sum;
            }
            return;
        }
        sum += root.data;
        sumOfLongestPath(root.left, sum, len+1);
        sumOfLongestPath(root.right, sum, len+1);
    }
    static int sum(Node root){
        maxLen = 0;
        maxSum = Integer.MIN_VALUE;
        sumOfLongestPath(root, 0, 0);
        return maxSum;
    }
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
                //        1
                //       / \
                //      2   3
                //     / \   \
                //    4   5   6   
        Node root = buildTree(nodes);
        System.out.println(sum(root));
    }
        
        
}
