import java.util.Stack;
public class lc_2390{
    public static String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));
        int i=1;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='*'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
            i++;
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(removeStars("erase*****"));
    }
}