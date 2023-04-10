//package a_Arrays;

public class zi_SmallestSubarrSumGreaterThanGivenVal {
    //  TIME COMPLEXITY -> O(n^2)
    public static int smallSubarr(int a[], int n, int x){
        int minlen = n+1;
        for(int i=0; i<n; i++){
            int sum = a[i]; // initialize
            if(sum > x){
                return 1;
            }
            for(int j=i+1; j<n; j++){
                sum += a[j];
                if(sum > x && (j - i + 1) < minlen){
                    minlen = j - i + 1;
                }
            }
        }
        return minlen;
    }

    // TIME COMPLEXITY -> O(n)
    public static int smallest(int arr[], int n, int x){
        // Initialize current sum and minimum length
        int curr_sum = 0, min_len = n + 1;
 
        // Initialize starting and ending indexes
        int start = 0, end = 0;
        while (end < n) {
            // Keep adding array elements while current sum
            // is smaller than or equal to x
            while (curr_sum <= x && end < n)
                curr_sum += arr[end++];
 
            // If current sum becomes greater than x.
            while (curr_sum > x && start < n) {
                // Update minimum length if needed
                if (end - start < min_len)
                    min_len = end - start;
                // remove starting elements
                curr_sum -= arr[start++];
            }
        }
        return min_len;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 4, 45, 6, 10, 19};
        int x = 51;
        int n1 = arr1.length;
        int res1 = smallest(arr1, n1, x);
        if (res1 == n1+1)
           System.out.println("Not Possible");
        else
           System.out.println(res1);
    }
}
