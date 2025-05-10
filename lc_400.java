public class lc_400 {
     public static int findNthDigit(int n) {
          // StringBuilder sb=new StringBuilder();
          // for(int i=1;i<=n;i++){
          //     sb.append(i);
          // }
          // int x=sb.charAt(n-1)-'0';
          // return x;
  
          int digitlen=1;
          long count=9;
          int st=1;
  
          while(n>digitlen*count){
              n-=digitlen*count;
              digitlen++;
              count*=10;
              st*=10;
          }
  
          st+=(n-1)/digitlen;
          String str=Integer.toString(st);
  
          return str.charAt((n-1)%digitlen)-'0';
     }
     public static void main(String[] args) {
          System.out.println(findNthDigit(11));
     }
}
