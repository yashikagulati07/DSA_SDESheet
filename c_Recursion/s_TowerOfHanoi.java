
public class s_TowerOfHanoi {
    // three towers -> a,b,c
    // a = source, b = helper, c = destination
    public static void towerOfHanoi(int n, String src, String helper, String dest){

        if(n==1){
            System.out.println("Tranfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);// n-1 ke lie source of helper tk krna hai means iss step ke lie helper will be the destination
        System.out.println("Tranfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n=2;
        towerOfHanoi(n, "S", "H", "D");
    }
    
}
