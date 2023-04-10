// package a_Arrays;
import java.util.Scanner;

public class a_ReverseTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Correct Order :");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse Order :");
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}
