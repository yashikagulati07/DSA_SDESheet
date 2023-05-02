
import java.util.Scanner;

public class i_KthSmallestInSortedMatrix {
    public static int kthsmallest(int[][] mat, int k){
        int n=mat.length;
        int low = mat[0][0];
        int high = mat[n-1][n-1];
        while(low<=high){
            int mid = low+(high-low)/2;
            int cnt = cntlessorequal(mat, mid);
            if(cnt<k){
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return low;
    }
    public static int cntlessorequal(int mat[][], int mid){
        int cnt=0;
        int row=0;
        int col=mat.length-1;
        while(row<mat.length && col>=0){
            if(mat[row][col] <= mid){
                cnt += col+1;
                row++;
            } else{
                col--;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;

        System.out.print( " ENter the elements : ");
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("ENter the no to search : ");
        int k = sc.nextInt();
        System.out.print("Kth smallest is : " + kthsmallest(arr,k));
        sc.close();

    }
}
