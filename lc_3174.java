import java.util.Stack;

public class lc_3174 {
     public static String clearDigit(String s){
          Stack<Character> S=new Stack<>();
          for(int i=0;i<s.length();i++){
               if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                    S.pop();
               }
               else{
                    S.push(s.charAt(i));
               }
          }
          //Alternative way to reverse string...(Gives best time complexity)
          StringBuilder sb = new StringBuilder();
          while(!S.isEmpty()) {
               sb.append(S.pop());
          }
          return sb.reverse().toString();

          //return reverse(str);
     }
     public static String reverse(String s){
          String str="";
          for(int i=s.length()-1;i>=0;i--){
               str+=s.charAt(i);
          }
          return str;
     }
     public static void main(String[] args) {
          System.out.println(clearDigit("ab6"));
     }
}
