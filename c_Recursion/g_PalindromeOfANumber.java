public class g_PalindromeOfANumber {
    static int sum = 0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum *10 + rem;
        reverse(n/10);
    }
    public static boolean ispal(int n){
        sum=0;
        reverse(n);
        if(n==sum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(ispal(121));
    }
}
