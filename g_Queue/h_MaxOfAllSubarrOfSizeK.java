import java.util.ArrayList;

public class h_MaxOfAllSubarrOfSizeK {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> m = new ArrayList<Integer>();
        for (int i = 0; i < n; i = i + 1) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(arr[j], max);
            }
            m.add(max);
            if (i == n - k) {
                break;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 8, 7};
        int n = arr.length;
        int k = 3;
        
        ArrayList<Integer> result = max_of_subarrays(arr, n, k);
        System.out.println("Maximum elements of subarrays of size " + k + ": " + result);
    }
    
}
