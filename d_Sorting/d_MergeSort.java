// TIME COMPLEXITY ->  O(nlogn)

package i_Sorting;
public class d_MergeSort {
    public static void conquere(int arr[], int start, int mid, int end){
        int merge[] = new int[end - start + 1]; // because  base index
        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;
        while(idx1 <= mid && idx2 <= end){
            if(arr[idx1] <= arr[idx2]){
                merge[x] = arr[idx1];
                x++; idx1++;
            } else{
                merge[x] = arr[idx2];
                x++; idx2++;
            }
        }
        while(idx1 <= mid){
            merge[x++] = arr[idx1++];
        }
        while(idx2 <= end){
            merge[x++] = arr[idx2++];
        }

        for(int i=0, j=start; i<merge.length; i++,j++){
            arr[j] = merge[i];
        }

    }
    public static void divide(int arr[], int start, int end){
        if(start>=end){
            return;
        }
        int mid = start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr, mid+1, end);

        conquere(arr,start,mid,end);

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr, 0, n-1);
        //print
        for(int i=0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
