public class lc_242{
     public static boolean anagram(String a,String b) {      //Frequency check
         int n=a.length(),m=b.length();
         int a1[]=new int[26],b1[]=new int[26];
         int i=0,j=0;
         while(i<n){
             int r=a.charAt(i)-'a';
             a1[r]+=1;
             i++;
         }
         while(j<m){
             int r=b.charAt(j)-'a';
             b1[r]+=1;
             j++;
         }
         for(int k=0;k<26;k++){
             if(a1[k]!=b1[k]){
                 return false;
             }
         }
         return true;
     }
     public static void main(String[] args) {
         System.out.println(anagram("rat", "car"));
     }
 }