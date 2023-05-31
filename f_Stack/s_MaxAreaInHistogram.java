// Given an array of integers height representing the histogram's bar height where 
// the width of each bar is 1, return the area of the largest rectangle in the histogram 


// Time complexity -> O(n)
package m_Stack;

import java.util.Stack;

public class s_MaxAreaInHistogram {
    public static void maxArea(int a[]){
        int maxarea = 0;
        int nsr[] = new int[a.length];
        int nsl[] = new int[a.length];

        //next smaller right = O(n)
        Stack<Integer> s = new Stack<>();
        for(int i=a.length-1; i>=0; i--){
            while(!s.isEmpty() && a[s.peek()] >= a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = a.length;
            } else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // next smaller left =  O(n)
        s = new Stack<>();
        for(int i=0; i<a.length; i++){
            while(!s.isEmpty() && a[s.peek()] >= a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            } else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // curr area calculate : width = j - 1 - 1 = nsr[i] - nsl[i] - 1 = O(n)
        for(int i=0; i<a.length; i++){
            int height = a[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxarea = Math.max(maxarea, currArea);
        }
        System.out.println("Max area : " + maxarea);

    }
    public static void main(String[] args) {
        int a[] = {2,1,5,6,2,3};
        maxArea(a);
    }
}
