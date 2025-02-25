import java.util.Stack;
public class lc_1006{
    public static int clumsyFact(int n) {
        Stack<Integer> s=new Stack<>();
        int c=1;
        s.push(n--);
        while(n>0){
            if(c==1){
                s.push(s.pop()*n);
            }
            else if(c==2){
                s.push(s.pop()/(n));
            }
            else if(c==3){
                s.push(n);
            }
            else if(c==4){
                s.push(-n);
            }
            n--;
            c=(c%4)+1;
        }
        int ans=0;
        while(!s.isEmpty()){
            ans+=s.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(clumsyFact(10));
    }
}