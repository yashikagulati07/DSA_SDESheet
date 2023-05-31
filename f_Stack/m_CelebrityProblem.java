package m_Stack;


public class m_CelebrityProblem {
    static int celebrity(int m[][]){
        int V = m.length;
        int[] in = new int[V];
        int[] out = new int[V];
        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                if(m[i][j] == 1){
                    out[i]++;
                    in[j]++;
                }
            }
        }
        for(int i=0; i<V; i++){
            if(in[i]==V-1 && out[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int m[][] = {{0,1},
                     {1,0}};
        
        System.out.println(celebrity(m));
    }
}
