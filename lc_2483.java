public class lc_2483{
     public static int penalty(String customers){
         int penalty=0,max=0,hour=-1;
         for(int i=0;i<customers.length();i++){
             if(customers.charAt(i)=='Y'){
                 penalty++;
             }
             else{
                 penalty--;
             }
             if(max<penalty){
                 max=penalty;
                 hour=i;
             }
         }
         return hour+1;
     }
     public static void main(String[] args) {
         String s="YYYY";
         System.out.println(penalty(s));
     }
 }
 