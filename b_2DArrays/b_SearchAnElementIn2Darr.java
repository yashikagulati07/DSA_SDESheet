import java.util.Scanner;
public class b_SearchAnElementIn2Darr {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter col : ");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
        System.out.print("Enter the elements: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the num to find : ");
        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] == x){
                    System.out.println("The number is present at : " + i +" "+ j);
                }
                
            }
        }
        sc.close();

    }
}
