
public class lc_344{
     public static void rev_str(char[] s){
         for(int i=0;i<s.length/2;i++){
             char temp;
             temp=s[i];
             s[i]=s[s.length-1-i];
             s[s.length-1-i]=temp;
         }
     }
     public static void main(String[] args) {
         char[] s={'h','e','l','l','o'};
         rev_str(s);
         for(int i=0;i<s.length;i++){
             System.out.print(s[i]+" ");
         }
     }
 }
 
 
 