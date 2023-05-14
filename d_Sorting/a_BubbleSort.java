package i_Sorting;

public class a_BubbleSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        int n = arr.length;
        // bubble sort
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // printing the array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
