// package a_Arrays;

import java.util.Arrays;

public class l_Merge2sortedArrayWithoutExtraSpace {

    public static void merge(int x[], int y[]){
        int m = x.length;
        int n = y.length;
        for(int i=0; i<m; i++){
            if(x[i] > y[0]){
                int temp = x[i];
                x[i] = y[0];
                y[0] = temp;
                int first =y[0];
                int k;
                for(k=1; k<n && y[k]<first; k++){
                    y[k-1]= y[k];
                }
                y[k-1] = first;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1,5,8,9};
        int b[] = {2,4,6,7};
        merge(a, b);
        System.out.println("X: " + Arrays.toString(a));
        System.out.println("Y: " + Arrays.toString(b));
    }
}