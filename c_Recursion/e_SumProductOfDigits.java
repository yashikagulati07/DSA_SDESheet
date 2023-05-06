public class e_SumProductOfDigits {

    static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }

    static int productOfDigits(int n){

        
        if(n%10 == n){
            return n;
        }
        return (n%10) * productOfDigits(n/10);
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumOfDigits(n));
        System.out.println(productOfDigits(n));
    }
}
