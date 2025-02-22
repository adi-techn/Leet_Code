import java.util.Stack;

public class lc_394 {
     public static String decode(String str) {
        Stack<Integer> count= new Stack<>();   // Stack to store repetition counts
        Stack<String> result= new Stack<>();   // Stack to store intermediate decoded results
        String currStr="";  
        int k=0;  

        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch>='1' && ch<='9'){  
                k=k*10+(ch-'0');
            } 
            else if(ch=='[') {  
                count.push(k);  // Push current repeat count
                result.push(currStr);  // Push current string
                k=0;  
                currStr="";  // Reset for new segment
            } 
            else if(ch==']'){  
                StringBuilder sb = new StringBuilder();
                int repeatCount = count.pop();
                for (int j= 0;j< repeatCount;j++) {
                    sb.append(currStr);
                }

                // Append to previous string
                currStr= result.pop()+sb.toString();
            } 
            else{  
                currStr+=ch;  // Append character normally
            }
        }

        return currStr;
    }
    public static void main(String[] args) {
        System.out.println(decode("3[a2[cv]]l"));
        // System.out.println(decode("2[cv]l"));
    }
}
