import java.util.Arrays;

public class u_sortingTechniquesUsingRecursion {
    // Bubble Sort
    static void bubbleSort(int arr[], int n){
        if (n == 1)
            return;
  
         int count = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                  count = count+1;
            }
         if (count == 0)
            return;
        bubbleSort(arr, n-1);
    }

    // Selection sort 
    static int minIndex(int a[], int i, int j){
        if (i == j)
            return i;
        int k = minIndex(a, i + 1, j);
        return (a[i] < a[k])? i : k;
    }
    static void recurSelectionSort(int a[], int n, int index){
        if (index == n)
           return;
        int k = minIndex(a, index, n-1);
        if (k != index){
           int temp = a[k];
           a[k] = a[index];
           a[index] = temp;
        }
        recurSelectionSort(a, n, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

        recurSelectionSort(arr, arr.length, 0);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
