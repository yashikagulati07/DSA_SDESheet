
public class h_PowerOf {

    static int powerOf(int x, int p){
        if(p==0){
            return 1;
        }
        return x*powerOf(x,p-1);
    }
    public static void main(String[] args) {
        int x = 3;
        int p = 3;
        System.out.println(powerOf(x,p));
    }
}
