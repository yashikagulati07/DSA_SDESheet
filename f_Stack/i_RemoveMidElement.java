package m_Stack;
import java.util.*;
public class i_RemoveMidElement {
    public static void removeMid(Stack<Integer> s, int n){
        int mid = (n+1)/2;
        mid = mid-1;
        s.remove(mid);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        int size = s.size();
        removeMid(s, size);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
