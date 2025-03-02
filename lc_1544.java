import java.util.Stack;

public class lc_1544{
     public static String makeGood(String s) {
        if(s.length()==0){
            return s;
        }
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));
        int i=1;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(!stack.isEmpty()&&(Math.abs(ch-stack.peek())==32)){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
          i++;
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
     }
     public static void main(String[] args) {
          System.out.println(makeGood("mC"));
     }
}
//('A'<=ch && ch<='Z')&&('a'<=stack.peek() && stack.peek()<='z')||('a'<=ch && ch<='z')&&('A'<=stack.peek() && stack.peek()<='Z')