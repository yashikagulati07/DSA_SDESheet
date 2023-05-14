package i_Sorting;

public class c_InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        int n = arr.length;
        // Insertion sort sort
        for(int i=1; i<n; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j]; //ek ek aage push hota rahega and jgh banti rahegi
                j--;
            }
            //placement
            arr[j+1] = current;
        }
        // printing the array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
