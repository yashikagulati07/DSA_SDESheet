package m_Stack;

import java.util.Stack;

public class k_ReverseTheEquation {
    String reverseEqn(String S){
       Stack<String>st=new Stack<>();
       String ans="";
       for(int i=0;i<S.length();i++){
           char ch=S.charAt(i);
           if(ch!='+' && ch!='-' && ch!='*' && ch!='/'){
               ans+=ch;
           }else{
               st.push(ans);
               st.push(Character.toString(ch));
               ans="";
           }
       }
       st.push(ans);
       String res="";
       while(!st.isEmpty()){
           res+=st.pop();
       }
       return res;
    }
}
