
public class lc_1945{
     public static int sumOfdigits(String s,int k){
         String str="";
         for(int i=0;i<s.length();i++){
             str+=(s.charAt(i)-'a')+1;
         }
         
         while(k!=0){
             int sum=0;
             for(int i=0;i<str.length();i++){
                 int r=(str.charAt(i)-48);
                 sum+=r;
             }
             str="";
             str+=sum;
             k--;
         }
         int n=0;
         for(int i=0;i<str.length();i++){
             int r=str.charAt(i)-48;
             n=(n*10)+r;
             
         }
         return n;
     }
     public static void main(String[] args) {
         String s="iiii";
         System.out.println(sumOfdigits(s, 1));
     }
 }
 
 
 