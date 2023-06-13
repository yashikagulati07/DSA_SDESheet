import java.util.*;

public class g_ReverseFirstKelements {
    public static void rev(Queue<Integer> q, int k) {
        if (k <= 0) {
            return;
        }
        if (q.size() == 0 || q.size() == 1) {
            return;
        }
        int n = q.size();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.peek());
            q.poll();
        }
        while (!s.isEmpty())
            q.add(s.pop());

        for (int i = 0; i < n - k; i++) {
            q.add(q.peek());
            q.poll();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int k = 3;

        // Adding elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Original Queue: " + queue);

        // Reversing the first k elements
        rev(queue, k);

        System.out.println("Reversed Queue: " + queue);
    }
}
