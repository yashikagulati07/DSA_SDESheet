// next greater element of some element x in an array is the
// first greater element that is to the right of x in the same array

//      0, 1, 2, 3, 4
// [] = 6, 8, 0, 1, 3
// ou = 8,-1, 1, 3, -1

// forward travel krni ki jgh back se kru taaki saare right side elements mai analyse kr chuki hu 
// jb tk stack khali na ho jae and stack[top] <= a[i], tbtk mai element ko htati rahu jb tk isse koi bda ele na mille 
// agr stack khali ho jaega, then return 1;
// agr khali nai hua toh nextgreater = sbse upr wala element

// O(n )
package m_Stack;

import java.util.Stack;

public class r_nextGreaterElement {

    public static void nextgreater(int a[], int n){
        Stack<Integer> s = new Stack<>();
        int nextgreat[] = new int[a.length];
        for(int i=n-1; i>=0; i--){            
            while(!s.isEmpty() && a[i] >= a[s.peek()] ){
                s.pop();
            }
            if(s.isEmpty()){
                nextgreat[i] = -1;
            }
            else{
                nextgreat[i] = a[s.peek()];
            }
            s.push(i);
        }
        for(int i=0; i<nextgreat.length; i++){
            System.out.print(nextgreat[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {6, 8, 0, 1, 3};
        int n = a.length;
        nextgreater(a, n);
    }
}
