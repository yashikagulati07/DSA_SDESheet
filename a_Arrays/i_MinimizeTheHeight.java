import java.util.Arrays;

public class i_MinimizeTheHeight {
    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int mini=arr[0];
        int maxi=arr[n-1];
        int ans=maxi-mini;
        for(int i=1;i<n;i++)
        {
            if(arr[i]-k<0)
            continue;
                mini=Math.min(arr[0]+k,arr[i]-k);
                maxi=Math.max(arr[i-1]+k,arr[n-1]-k);
                ans=Math.min(ans,maxi-mini);
        }
        return ans;
    }
    public static void main(String[] args) {
        int K = 2, N = 4;
        int Arr[] = {1, 5, 8, 10};
        System.out.println(getMinDiff(Arr, N, K));

    }


}
