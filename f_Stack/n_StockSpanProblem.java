// 1. Traverse the price array
// 2. For each i in 0 to n:
//     a. Iterate j, while there are elements to the left and the 
//     b. price[j] is less than the current price.
//         i. Increment count and decrement j.
//     c.Set span[i] as count.
// 3. Return span array.


// span -> max number of consecutive days for whih price<= today's price
package m_Stack;
import java.util.Arrays;
import java.util.Stack;
public class n_StockSpanProblem {
    static void calSpan(int price[], int n, int S[]){
        S[0] = 1;
        for(int i=1; i<n; i++){
            S[i] = 1; // Initialize span Value;

            // Traverse left while the next element on left
            // is smaller than price[i]
            for(int j=i-1; (j>=0)&&(price[i]>=price[j]); i--){
                S[i]++;
            }
        }        
    }
    static void printArray(int arr[]){
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];
 
        // Fill the span values in array S[]
        calSpan(price, n, S);
        printArray(S);
    }


    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    
}
