//package a_Arrays;

public class ze_MinSwapRequiredBringEleLessorEqualToKTogether {
    int minSwap(int arr[], int n, int k) {
        int good = 0; 
        int bad = 0;
        // counting good val
        for(int i=0; i<n; i++){
            if(arr[i] <= k){
                good++;
            }
        }
        // counting bad values in current window
        for(int i=0; i<good; i++){
            if(arr[i] > k){
                bad++;
            }
        }
        int i=0, j=good, ans=bad;
        while(j<n){
            // if start of window was bad value, bad--
            if(arr[i]>k){
                bad--;
            }
            // if end of window is bad value, bad++;
            if(arr[j]>k){
                bad++;
            }
            ans = Math.min(ans,bad);
            i++;j++;  // moving window by 1
        }
        return ans;

    }
}
