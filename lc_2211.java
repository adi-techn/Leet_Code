import java.util.Stack;

public class lc_2211 {
     public static int countCollisions(String dir) {
        Stack<Character> s=new Stack<>();
        s.push(dir.charAt(0));

        int col=0;
        for(int i=1;i<dir.length();i++){
            char ch=dir.charAt(i);
            if(!s.isEmpty() && ch=='L' && s.peek()=='R'){
                col+=2;
                s.pop();
                while (!s.isEmpty() && s.peek() == 'R') {
                    col++;
                    s.pop();
                }
                s.push('S');
            }
            else if(!s.isEmpty() && ch=='L' && s.peek()=='S'){
                col++;
                s.push('S');
            }else if(!s.isEmpty() && s.peek()=='R' && ch=='S'){
                col++;
                s.pop();
                while (!s.isEmpty() && s.peek() == 'R') {
                    col++;
                    s.pop();
                }
                s.push('S');
            }
            else{
                s.push(ch);
            }
        }
        return col;
     }
     public static void main(String[] args) {
          String cars="LLRR";
          System.out.println(countCollisions(cars));
     }
}
