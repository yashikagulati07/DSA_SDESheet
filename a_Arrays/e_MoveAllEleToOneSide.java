// package a_Arrays;

import java.util.Scanner;

public class e_MoveAllEleToOneSide {

    public static void movenegtooneside(int arr[], int n){
        int i=0; int j=n-1;
        while(i<=j){
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
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
        movenegtooneside(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
