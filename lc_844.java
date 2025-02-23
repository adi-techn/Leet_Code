import java.util.Stack;
public class lc_844{
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> S=new Stack<>();
        Stack<Character> T=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#' && S.isEmpty()){
                continue;
            }
            else if(ch=='#'){
                S.pop();
            }
            else{
                S.push(ch);
            }
        }
        String str1="";
        while (!S.isEmpty()) {
            str1+=S.pop();
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ch=='#' && T.isEmpty()){
                continue;
            }
            else if(ch=='#'){
                T.pop();
            }
            else{
                T.push(ch);
            }
        }
        String str2="";
        while (!T.isEmpty()) {
            str2+=T.pop();
        }
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        System.out.println(backspaceCompare("a##c","#a#c"));
    }
}