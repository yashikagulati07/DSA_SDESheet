// package a_Arrays;

public class k_FindDupInNplus1Array {

    public static int findDup(int arr[]){
        for(int i=0; i<arr.length; i++){
            int index = Math.abs(arr[i]);
            if(arr[index] < 0){
                return index;
            }
            arr[index] = - arr[index];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,3,2,3,5};
        System.out.println(findDup(arr));
    }
}
