// package a_Arrays;

import java.util.Scanner;

public class d_Sort012 {

    public static void sort012(int arr[], int n){
        int i=0; int j=0; int k=n-1;
        while(j<=k){
            if(arr[j] == 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++; j++;
            }
            else if(arr[j] == 1){
                j++;
            }
            else{
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sort012(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
