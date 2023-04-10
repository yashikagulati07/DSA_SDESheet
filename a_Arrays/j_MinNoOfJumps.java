// package a_Arrays;

public class j_MinNoOfJumps {
    public static int minJumps(int arr[]){
        int n = arr.length;
        int jump =0;
        int position = 0;
        int destination = 0;
        for(int i=0; i<n-1; i++){
            destination = Math.max(destination, arr[i]+i);
            if(position == i){
                position = destination;
                jump++;
            }
        }
        return jump;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        int cnt = minJumps(arr);
        System.out.println(cnt);

    }
}
