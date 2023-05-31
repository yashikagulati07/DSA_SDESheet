package m_Stack;
import java.util.Stack;
public class q_reverseWordsInString {
    public static String reverseWords(String S){
        Stack<String> s = new Stack<String>();
        String temp = "";
        String ans = "";
        for (int i =0; i<S.length(); i++){
            if(S.charAt(i)=='.'){
                s.push(temp);
                temp = "";
                temp = temp +'.';
                s.push(temp);
                temp = "";
            }    
            else
                temp = S.charAt(i)+temp ;
        }
        s.push(temp);
        temp = "";
        while(!s.isEmpty()){
            ans = s.pop()+ans;
        }
        return  ans;
    }
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        System.out.println(reverseWords(S));
    }
    
}
