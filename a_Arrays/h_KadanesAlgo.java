// package a_Arrays;

public class h_KadanesAlgo {

    public static int maxSubArray(int arr[], int n){
        int cnt = Integer.MIN_VALUE;
        int temp=0;
        for(int i=0; i<n; i++){
            temp = temp + arr[i];
            if(cnt < temp){
                cnt = temp;
            }
            if(temp < 0){
                temp = 0;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int Arr[] = {1,2,3,-2,5};
        int n = 5;
        System.out.println(maxSubArray(Arr, n));
    }
}
