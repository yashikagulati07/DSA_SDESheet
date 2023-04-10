//package a_Arrays;

import java.util.HashSet;

public class za_CheckArraySubsetOfAnotherArrayOrNot {
    public static boolean isSubset(int a[], int b[]){
        HashSet<Integer> h = new HashSet<>();
        for(int i=0; i<a.length; i++){
            if(!h.contains(a[i])){
                h.add(a[i]);
            }
        }
        for(int i=0; i<b.length; i++){
            if(!h.contains(b[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // int a[] = {11, 1, 13, 21, 3, 7};
        // int b[] = {11, 3, 7, 1} ;
        int a[] = {10, 5, 2, 23, 19};
        int b[] = {19, 5, 3};
        if(isSubset(a, b)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
