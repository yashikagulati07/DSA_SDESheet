// package a_Arrays;

import java.util.HashSet;


public class u_SubarrayWithSUmZero {
    public static boolean checkSum(int a[]){
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
            if(a[i]==0 || sum==0 || hs.contains(sum)){
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {4, 2, -3, 5, 6};
        if(checkSum(a)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
