// NAIVE APPROACH -->> O(n^2)

package m_Stack;
public class p_SmallestNoOnLeft {
    public static void findPrevSmall(int[] arr){
        if(arr==null || arr.length==0){
            return;
        }
        for(int i=0; i<arr.length; i++){
            int prev=-1;
            for(int j=i-1; j>=0; j--){
                if(arr[j]<arr[i]){
                    prev=arr[j];
                    break;
                }
            }
            System.out.print(prev + " ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { 2, 5, 3, 7, 8, 1, 9 };
        findPrevSmall(arr);
    }
}
