package m_Stack;

import java.util.Stack;

public class p_SmallestOnLeft {
    public static void findprevsmall(int arr[]){
        if(arr==null || arr.length==0){
            return;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty()){
                if(st.peek()<arr[i]){
                    System.out.print(st.peek() + " ");
                    break;
                } else{
                    st.pop();
                }
            }
            if(st.isEmpty()){
                System.out.print(-1 + " ");
            }
            st.push(arr[i]);
        }        
    }
    public static void main(String[] args)
    {
        int[] arr = { 2, 5, 3, 7, 8, 1, 9 };
        findprevsmall(arr);
    }
    
}
