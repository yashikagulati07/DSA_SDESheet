// Time Complexity -> O(n+n) -> O(2n) -> O(n)

public class n_MoveXtoTheEndOfTheString {

    public static void moveToEnd(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveToEnd(str, idx+1, count, newString);
        } else{
            newString += currChar;
            moveToEnd(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveToEnd(str, 0, 0, "");
    }
    
}
