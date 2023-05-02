// 1. Left to Right
// 2. Top to Bottom
// 3. Right to Left and
// 4. Bottom to Top
// Solution steps
// We will use four loops to traverse in the four directions. Each loop for a single direction.
// Also, we will use four variables to indicate the start of the row index, end of the row index, the start of the column index and end of the column index.


import java.util.ArrayList;
public class j_SpiralTraversingAmatrix {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = r-1;
        int colEnd = c-1;
        ArrayList<Integer> arr = new ArrayList<>();
        while(rowStart <= rowEnd && colStart <= colEnd){
            int temprowStart = rowStart;
            for(int i = colStart ; i <= colEnd;i++){
                arr.add(matrix[temprowStart][i]);
            }
            rowStart++;
            int tempcolEnd = colEnd;
            for(int i = rowStart ; i <= rowEnd; i++){
                arr.add(matrix[i][tempcolEnd]);
            }
            colEnd--;
            int temprowEnd = rowEnd;
            for(int i = colEnd; i >= colStart; i--){
                if(rowStart > rowEnd){
                    break;
                }
                arr.add(matrix[temprowEnd][i]);
            }
            rowEnd--;
            int tempcolStart = colStart;
            for(int i = rowEnd; i >= rowStart; i--){
                if( colStart > colEnd){
                    break;
                }
                arr.add(matrix[i][tempcolStart]);
            }
            colStart++;
        }
        return arr;
    }

    public static void spiral(int m, int n, int a[][]){
        int i, k=0, l=0;
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
        while(k<m && l<n){
            // Print the first row from the remaining rows
            for(i=l; i<n; i++){
                System.out.println(a[k][i] + " ");
            }
            k++;        
        
            // Print the last col from the remaining col
            for(i=k; i<m; i++){
                System.out.println(a[i][n-1] + " ");
            }
            n--;

            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }

            // Print the first column from the remaining columns
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
        
    }
    public static void main(String[] args){
        int R = 4;
        int C = 4;
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
  
        // Function Call
        spiral(R, C, a);
    }
    
}
