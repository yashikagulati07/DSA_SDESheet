// package a_Arrays;

public class g_RotateEleBy1 {

    public static void rotateByK(int arr[], int k){
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    public static void reverse(int arr[], int start, int end){
        for(int i=start, j=end; i<j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int k=1;
        rotateByK(arr,k);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
