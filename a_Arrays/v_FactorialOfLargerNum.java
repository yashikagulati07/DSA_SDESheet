// package a_Arrays;
public class v_FactorialOfLargerNum {
    public static void fact(int n){
        int res[] = new int[500];
        res[0] = 1;
        int ressize = 1;
        for(int i=2; i<=n; i++){
            ressize = multiply(i, res, ressize);
        }
        for(int i=ressize-1; i>=0; i--){
            System.out.print(res[i]);
        }
    }
    public static int multiply(int x, int res[], int ressize){
        int carry=0; 
        for(int i=0; i<ressize; i++){
            int pro = res[i] * x + carry;
            res[i] = pro % 10;
            carry = pro / 10;
        }
        while(carry != 0){
            res[ressize] = carry % 10;
            carry = carry / 10;
            ressize++;
        }
        return ressize;
    }
    public static void main(String[] args) {
        int n = 100;
        fact(n);
    }
}
