public class lc_2729{
     public static boolean fascinating_num(int num){
          String str=num+"";
          int freq[]=new int[10];
          for(int i=2;i<=3;i++){
               str+=(num*i);
          }
          for(int i=0;i<str.length();i++){
               freq[str.charAt(i)-'0']+=1;
               System.out.println(str.charAt(i)+" "+freq[str.charAt(i)-'0']);
               if(freq[str.charAt(i)-'0']>1 || str.charAt(i)=='0')
                    return false;
          }
          return true;
     }
     public static void main(String[] args) {
          System.out.println(fascinating_num(100));
     }
}
