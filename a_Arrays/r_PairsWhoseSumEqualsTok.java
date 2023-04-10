// package a_Arrays;

import java.util.HashMap;

public class r_PairsWhoseSumEqualsTok {
    public static int findPair(int a[], int sum){
        int n = a.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!hm.containsKey(a[i])){
                hm.put(a[i],0);
            }
            hm.put(a[i], hm.get(a[i])+1);
        }
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(hm.get(sum-a[i]) != null){
                cnt += hm.get(sum-a[i]);
            }
            if((sum-a[i]) == a[i]){
                cnt--;
            }
        }
        return cnt/2;
    }
    public static void main(String[] args) {
        int a[] = {1,5,7,-1};
        int sum = 6;
        System.out.println(findPair(a, sum));
    }
}
