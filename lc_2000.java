public class lc_2000{
     public static String ReversePrefix(String str,char ch){
         int n=0;
         for(int i=0;i<str.length();i++){
             if(ch==str.charAt(i)){
                 n=i;
                 break;
             }
         }
         if(n!=0){
             String s="";
             for(int i=n;i>=0;i--){
                 s+=str.charAt(i);
             }
             for(int i=n+1;i<str.length();i++){
                 s+=str.charAt(i);
             }
             return s;
         }
         return str;
     }
     public static void main(String[] args) {
         String str="abcdefd";
         System.out.println(ReversePrefix(str, 'd'));
     }
 }