public class lc_125{
     public static boolean strPalindrome(String str){
         String s=str.toLowerCase();
         String newStr="";
         for(int i=0;i<s.length();i++){
             if((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='0'&& s.charAt(i)<='9')){
                 newStr+=s.charAt(i);
             }
         }
         for(int i=0;i<newStr.length()/2;i++){
             int n=newStr.length();
             if(newStr.charAt(i)!=newStr.charAt(n-1-i)){
                 return false;
             }
         }
         return true;
     }
     public static void main(String[] args) {
         String str=" ";
         System.out.println(strPalindrome(str));
     }
 }
 