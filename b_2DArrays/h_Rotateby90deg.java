
import java.util.Scanner;

public class h_Rotateby90deg {

    static void rotate(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=arr.length-1; j>=0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        rotate(arr);
        sc.close();
        
    }
    
}
