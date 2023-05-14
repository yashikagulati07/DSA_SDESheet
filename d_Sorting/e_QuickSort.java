// Time Complexity ->> Worst case = O(n^2)   (hrr baar pivot smallest ele and last ele bnta hai )
//                     Avg Case = O(nlogn)     

package i_Sorting;
public class e_QuickSort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } 
        i++;
        int temp = arr[i];
        arr[i] = arr[high]; // pivot
        arr[high] = temp;
        return i; // pivot idx
    }

    public static void QuickSort(int arr[], int low, int high){
        if(low < high){
            int pivot = partition(arr,low,high);

            QuickSort(arr, low, pivot-1);
            QuickSort(arr, pivot+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;
        QuickSort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
