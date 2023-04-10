//package a_Arrays;

import java.util.HashSet;

public class zb_FindTripletThatSUmToAgivenValue {
    public static boolean triplet(int a[], int n, int k){
        HashSet<Integer> h = new HashSet<>();
        for(int i=0; i<n-2; i++){
            int sum = k-a[i];
            for(int j=i+1; j<n; j++){
                if(h.contains(sum - a[j])){
                    System.out.println("Triplet is: " + a[i] + ", " + a[j] + ", " + (sum-a[j]));
                    return true;
                }
                h.add(a[j]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        int k = 9;
        int n = A.length;
        triplet(A, n, k);
    }
}
