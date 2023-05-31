package m_Stack;

public class o_ValidSubstringOfParanthesis {
    static int findMaxLen(String S) {
        // code here
        int ans=0;
        int open=0;
        int close=0;
        int n=S.length();
        for(int i=0; i<n; i++){
            char ch = S.charAt(i);
            if(ch=='('){
                open++;
            }
            else{
                close++;
            }
            if(close==open){
                ans = Math.max(ans,open);
            }
            else if(close>open){
                close=open=0;
            }
        }
        close = open=0;
        for(int i = n-1; i >= 0; i--){        
                char x = S.charAt(i);
                if(x == '('){
                    open ++;
                }
                else {
                    close++;
                }
                if( close == open) {
                    ans = Math.max(ans, open);
                }
                else if(open > close) {
                    close = open = 0;
                }
            }
              
             return 2 * ans;
    }
    public static void main(String[] args) {
        String S = "()(())(";
        System.out.println(findMaxLen(S));
    }
}
