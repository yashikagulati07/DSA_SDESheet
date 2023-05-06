
public class o_PrintAllSubsequence {
    public static void subseq(String str, int idx, String newStr){
        // base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        // option 1 -> to be
        subseq(str, idx+1, newStr + currChar);
        // option 2 -> not to be 
        subseq(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str = "abc";
        subseq(str,0,"");
    }
}
