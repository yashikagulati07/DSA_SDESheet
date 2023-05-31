package m_Stack;
import java.util.*;
public class j_MinAtEveryPop {
    public static Stack<Integer> _push(int arr[], int n){
        Stack<Integer> s = new Stack<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            min = Math.min(min, arr[i]);
            s.push(min);
        }
        return s;
    }
    public static void minAtPop(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        _push(null, 0);
    }
}
