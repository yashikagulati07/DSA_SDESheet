package m_Stack;

import java.util.Stack;

public class f_ParenthesisChecker {
    public static boolean ispar(String x) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<x.length(); i++){
            char ch=x.charAt(i);
            //opening condition
            if(ch=='{'||ch=='['||ch=='('){
                st.push(ch);
            }
            else if(!st.isEmpty() && st.peek()=='(' && ch==')'){
                st.pop();
            }
            else if(!st.isEmpty() && st.peek()=='[' && ch==']'){
                st.pop();
            }
            else if(!st.isEmpty() && st.peek()=='{' && ch=='}'){
                st.pop();
            }else{
                return false;
            }
        }
        if(st.size()==0)return true;
        return false;
    }
    
    public static void main(String[] args) {
        String x = "[({})]";
        if(ispar(x)){
            System.out.println("Balanced");
        } else{
            System.out.println("Not Balanced");
        }
    }

}
