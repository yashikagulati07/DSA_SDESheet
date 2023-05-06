

import java.util.HashSet;

public class q_PrintUniqueSubsequence {

    public static void subseq(String str, int idx, String newStr, HashSet<String> set){
        // base case
        if(idx == str.length()) {
            if(set.contains(newStr)) {
            return;
            }
            set.add(newStr);
            System.out.println(newStr);
            return;
            }
        char currChar = str.charAt(idx);
        // option 1 -> to be
        subseq(str, idx+1, newStr + currChar, set);
        // option 2 -> not to be 
        subseq(str, idx+1, newStr, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subseq(str, 0, "", set);
    }
    
}
