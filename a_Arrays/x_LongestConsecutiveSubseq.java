//package a_Arrays;

import java.util.*;

public class x_LongestConsecutiveSubseq {
    public static int longCons(int a[], int n){
        int cnt=0;
        int ans=0;
        Arrays.sort(a);
        ArrayList<Integer> v = new ArrayList<>();
        v.add(a[0]);

        // inserting the repeating ele only once in the arraylist
        for(int i=1; i<n; i++){
            if(a[i] != a[i-1]){
                v.add(a[i]);
            }
        }
        // finding the max length
        for(int i=0; i<n; i++){
            //check if curr ele is equal to prev + 1  i.e-> prev + 1 = curr;
            if(i>0 && v.get(i) == v.get(i-1)+1){
                cnt++;
            } else{
                cnt=1;
            }
            ans = Math.max(ans,cnt);
        }
        return ans;        
    }

    public static int maxSubseq(int a[], int n){
        Set<Integer> set = new HashSet<>();
        int ans=0;
        for(int i : a){
            set.add(i);
        }
        for(int i=0; i<n; i++){
            if(!set.contains(a[i]-1)){
                int j=a[i]+1;
                while(set.contains(j)){
                    j++;
                }
                ans = Math.max(ans, j-a[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {1, 9, 3, 10, 4, 20, 2};
        int n = a.length;
        System.out.println(longCons(a, n));
        System.out.println(maxSubseq(a, n));
    }
}
