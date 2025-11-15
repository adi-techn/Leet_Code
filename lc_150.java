import java.util.Stack;

public class lc_150 {
     public static int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();

        for(String ch:tokens){
            int n1,n2;

            if(s.size()>=2 && (ch.equals("+") || ch.equals("-") || ch.equals("/") || ch.equals("*"))){
                n2=s.pop();
                n1=s.pop();
                
                if(ch.equals("+")){
                    s.push(n1+n2);
                }else if(ch.equals("-")){
                    s.push(n1-n2);
                }else if(ch.equals("*")){
                    s.push(n1*n2);
                }else if(ch.equals("/") && n2!=0){
                    s.push(n1/n2);
                }
            }
            else{
                int num=0;
                int sign=1;
                for(int i=0;i<ch.length();i++){
                    char c=ch.charAt(i);
                    if(c=='-'){
                        sign*=-1;
                        continue;
                    }
                    num=(num*10+(c-'0'));
                }
                s.push(sign*num);
            }
        }
        
        return s.isEmpty()?0:s.pop();
    }
     public static void main(String[] args) {
          String token[]={"2","1","+","3","*"};
          System.out.println(evalRPN(token));
     }
}
