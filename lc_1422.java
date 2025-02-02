public class lc_1422{
     public static int maxScore(String s){
          int l=0,max=0;
          for(int i=0;i<s.length()-1;i++){
               if(s.charAt(i)=='0'){
                    l++;
               }
               int r=0;
               for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)=='1'){
                         r++;
                    }
               }
               if(l+r>max){
                    max=l+r;
               }
          }
          return max;
     }
     public static void main(String[] args) {
          System.out.println(maxScore("1111"));
     }
}