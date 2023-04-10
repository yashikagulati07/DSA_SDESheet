// package a_Arrays;

import java.util.Scanner;

public class f_UnionAndIntersection {

    public static void union(int arr1[],int arr2[], int m, int n){
        int i=0, j=0;
        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                System.out.print(arr1[i++] + " ");
            }
            else if(arr1[i] > arr2[j]){
                System.out.print(arr2[j++] + " ");
            }
            else{
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
        while(i<m){
            System.out.print(arr1[i++] + " ");
        }
        while(j<n){
            System.out.print(arr2[j++] + " ");
        }
    }

    public static void intersec(int arr1[], int arr2[], int m, int n){
        int i=0, j=0;
        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        System.out.print("elements in arr1 :");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("elements in arr2 :");
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("Union : ");
        union(arr1, arr2, n, n);
        System.out.println("Intersection : ");
        intersec(arr1, arr2, n, n);
        sc.close();

    }

    
}
