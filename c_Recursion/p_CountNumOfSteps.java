public class p_CountNumOfSteps {
    static int nmOfSteps(int n){
        return helper(n,0);
    }
    static int helper(int n, int steps){
        if(n==0){
            return steps;
        }
        if(n % 2 == 0){
            return helper(n/2, steps + 1);
        }
        return helper(n-1, steps+1);
    }
    public static void main(String[] args) {
        int n = 14;
        System.out.println(nmOfSteps(n));
    }
}


// input = 14
// output = 6
// explain = step 1 -> 14 is even, 14 / 2 = 7
//           step 2 -> 07 is odd,  7 - 1 = 6
//           step 3 ->  6 is even,  6 / 2 = 3
//           step 4 ->  3 is odd,   3 - 1 = 2
//           step 5 ->  2 is even,  2 / 2 = 1
//           step 6 ->  1 is odd,   1 - 1 = 0;

