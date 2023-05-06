
public class KeyPadCombinations {

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};

    public static void printcomb(String str, int idx, String comb){
        if(idx == str.length()){
            System.out.println(comb);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i=0; i<mapping.length(); i++){
            printcomb(str, idx+1, comb+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printcomb(str, 0, "");
    }
    
}
