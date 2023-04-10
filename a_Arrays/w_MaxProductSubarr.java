
//package a_Arrays;
public class w_MaxProductSubarr {
    public static long maxProd(int a[], int n){
        long max = 1;
        long min = 1;
        long res = 1;
        for(int i=0; i<n; i++){
            if(a[i] > 0){
                max *= a[i];
                min = Math.min(a[i]*min, 1);
            }
            else if(a[i] == 0){
                min = max = 1;
            } 
            else{
                long temp = min;
                min = max;
                max = temp;
                min *= a[i];
                max = Math.max(1, a[i]*max);
            }
            res = Math.max(max,res);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {6, -3, -10, 0, 2};
        int n = arr.length;
        System.out.println(maxProd(arr, n));
    }
}
