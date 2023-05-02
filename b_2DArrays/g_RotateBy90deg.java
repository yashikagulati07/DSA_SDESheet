
import java.util.Scanner;

public class g_RotateBy90deg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        System.out.print("Enter col :" );
        int m = sc.nextInt();
        int[][] arr = new int[n][m] ;
        System.out.print("Enter the elemets : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // transpose 
        for(int i=0; i<n; i++){
            for(int j=i; j<m; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //reverse all the rows 
        for(int i=0; i<n; i++){
            int leftidx = 0;
            int rightidx = arr[i].length-1;
            while(leftidx<rightidx){
                int temp = arr[i][leftidx];
                arr[i][leftidx] =arr[i][rightidx];
                arr[i][rightidx] = temp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
