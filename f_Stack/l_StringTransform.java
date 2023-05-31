package m_Stack;

public class l_StringTransform {
    String transform(String S) 
    {
        // code here
        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i=1;i<S.length();i++)
        {
            char ch = Character.toLowerCase(S.charAt(i-1));
            char ch2 = Character.toLowerCase(S.charAt(i));
            if(ch==ch2)
            {
                count++;
            }
            else
            {
                sb.append(count);
                sb.append(ch);
                count=1;
            }
        }
        sb.append(count);
        sb.append(Character.toLowerCase(S.charAt(S.length()-1)));
        return sb.toString();
    }
}
