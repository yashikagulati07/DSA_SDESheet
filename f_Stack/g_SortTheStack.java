package m_Stack;
import java.util.Stack;

public class g_SortTheStack {
    public static Stack<Integer> sortStack(Stack<Integer> s)
	{
		//add code here.
		int n = s.size();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
		    arr[i] = s.pop();
		}
		java.util.Arrays.sort(arr);
		for(int i=0;i<n; i++){
		    s.add(arr[i]);
		}
		return s;
	}
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(4);
        s.push(3);
        s.push(2);
        sortStack(s);
        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
        
        
    }
    
}
