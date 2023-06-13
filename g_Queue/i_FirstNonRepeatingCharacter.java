
import java.util.LinkedList;
import java.util.Queue;

public class i_FirstNonRepeatingCharacter {
    public static String FirstChar(String a){
        int freq[] = new int[26];
        String res = "";
        Queue<Character> q = new LinkedList<>();
        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek() - 'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                res+='#';
            } else{
                res+= q.peek();
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String a = "aabc";
        System.out.println(FirstChar(a));
    }
    
}
