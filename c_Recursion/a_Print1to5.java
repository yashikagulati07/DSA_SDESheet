public class a_Print1to5 {

    public static void printnum(int n) {
        if(n==6){
            return;
        }
        System.out.println(n);
        printnum(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        printnum(n);
    }
    
}
