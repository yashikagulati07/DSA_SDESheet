import java.util.Scanner;
public class d_RowWithMaxNumOf1s {
    public static int findRow(int[][] mat){
        int max = 0;
        int r = 0;
        for(int i=0; i<mat.length; i++){
            int count = binarySearch(mat,i); // count of 1 in ith row
            if(count > max){
                max = count;
                r = i;
            }
        }
        return r;
    }

    public static int binarySearch(int[][] mat, int r){
        int low = 0;
        int high = mat[0].length-1;
        int fi1 = mat[0].length; // first index of 1
        while(low<=high){
            int mid = (low+high)/2;
            if(mat[r][mid] == 1){
                fi1 = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        int count = mat[0].length - fi1;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        System.out.print("Enter col :" );
        int m = sc.nextInt();
        int[][] mat = new int[n][m] ;
        System.out.print("Enter the elemets : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Row with max 1 : " + findRow(mat));
        sc.close();
    }
}
