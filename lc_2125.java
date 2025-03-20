public class lc_2125{
     public static int numberOfBeams(String[] bank){
          int count=0,prev=0;
          for(int i=0;i<bank.length;i++){
               int curr = 0;
               for (int j=0;j<bank[i].length();j++) {
                    if(bank[i].charAt(j)=='1') {
                         curr++;
                    }
               }
               if(curr==0) 
                    continue;
               count+=prev*curr;
               prev=curr;
          }
          return count;
     }
     public static void main(String[] args) {
          String bank[]={"011001","000000","010100","001000"};
          System.out.println(numberOfBeams(bank));
     }
}
