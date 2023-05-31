package m_Stack;
import java.util.Stack;
public class h_EvaluatePostFixExpression {
    public static int operation(int v1, int v2, char ch){
        if(ch=='+'){ return v1+v2;}
            else if (ch=='-'){ return v1-v2;}
            else if(ch =='*'){return v1*v2; }
            else { return v1/v2; }
    }
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);       
            if(ch=='+' || ch=='-' || ch =='*' || ch == '/'){
                int v2=s.pop();
                int v1=s.pop();
                int ans = operation(v1,v2,ch);
                s.push(ans);
            }
            else {
                s.push(ch-'0');
            }
        }
        int ans1 = s.pop();
    return ans1;
    }
    public static void main(String[] args) {
        String s = "231*+9-";
        System.out.println(evaluatePostFix(s));
    }
}
