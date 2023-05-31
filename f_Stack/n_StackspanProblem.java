package m_Stack;

import java.util.Stack;

public class n_StackspanProblem {
    static int[] calSpan(int price[], int n){
        Stack<Integer> st = new Stack<>();
        int span[] = new int[n];
        st.push(0);
        span[0] = 1;
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && price[st.peek()]<=price[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }
            else{
                span[i] = i-st.peek();
            }
            st.push(i);
        }
        return span;

    }
    public static void main(String[] args) {
		int price[] = new int[]{90, 40, 20, 30, 80, 60, 100};
		int span[] = calSpan(price, price.length);
		for(int s : span){
		    System.out.print(s+" ");
		}
	}
}
