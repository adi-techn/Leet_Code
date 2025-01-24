public class lc_2559{
     public static void countVowel(String[] s,int q[][]){
          int ans[]=new int[q.length];
          for(int i=0;i<q.length;i++){
               int si=q[i][0],ei=q[i][1];
               while(si<=ei){
                    String str=s[si];
                    if(isVowel(str.charAt(0))&&isVowel(str.charAt(str.length()-1)))
                         ans[i]++;
                    si++;
               }
          }
          for(int i=0;i<ans.length;i++){
               System.out.print(ans[i]+" ");
          }
     }
     public static boolean isVowel(char c){
          return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
     }
     public static void main(String[] args) {
          String s[]={"aba","bcb","ece","aa","e"};
          int q[][]={{0,2},{1,4},{1,1}};
          countVowel(s, q);
     }
}