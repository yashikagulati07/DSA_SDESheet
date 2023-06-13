import java.util.PriorityQueue;

public class e_MinimumCostOfRopes {
    public static long minCost(int arr[], int n){
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            pq.add((long) arr[i]);
        }
        Long cost = 0L;
        while(pq.size() > 1){
            Long a = pq.remove();
            Long b = pq.remove();
            Long sum = a + b;
            cost += sum;
            pq.add(sum);
        }
        return cost;
    }
    public static void main(String[] args) {
        int arr[] =  {4, 2, 7, 6, 9};
        int n= arr.length;
        System.out.println(minCost(arr, n));
    }
    
}
