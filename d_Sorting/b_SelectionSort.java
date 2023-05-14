package i_Sorting;

public class b_SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        int n = arr.length;
        // selection sort 
        for(int i=0; i<n-1; i++){
            int small = i;
            for(int j=i+1; j<n; j++){
                if(arr[small] > arr[j]){
                    small = j;
                }
            }
            // swap
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        // printing the array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
