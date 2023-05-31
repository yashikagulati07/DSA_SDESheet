// given a balanced expression, find if it contains duplicate parentheses or not. 
// A set of parenthesis are duplicate if the same subexpression is surrounded by multiple paranthesis.
// return a true if it contains duplicate else return false 



package m_Stack;

import java.util.Stack;

public class f_DuplicateParanthesis {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // closing paranthesis
            if(ch == ')'){
                int cnt = 0;
                while(!s.isEmpty() && s.peek() != '('){
                    s.pop();
                    cnt++;
                }
                if(cnt < 1){
                    return true; // duplicate exist
                } else{
                    s.pop();
                }
            }
            // opening paranthesis
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "((a + b) + (c + d))";
        System.out.println(isDuplicate(s));
    }
}
