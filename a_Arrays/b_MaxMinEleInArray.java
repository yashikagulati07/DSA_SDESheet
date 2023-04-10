// package a_Arrays;
import java.util.Scanner;

public class b_MaxMinEleInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] < max){
                max = arr[i];
            }
            if(arr[i] > min){
                min = arr[i];
            }
        }
        System.out.println("Max ele is : " + max );
        System.out.println("Min ele is : " + min );

        sc.close();
    }
}
