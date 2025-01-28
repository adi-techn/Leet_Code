public class lc_2042{
     public static boolean numberAscending(String str) {
         int arr[]=new int[str.length()/2];
         int j=0;
         for(int i=0;i<str.length()-1;i++){
             if('0'<=str.charAt(i) && str.charAt(i)<='9'){
                 arr[j]=str.charAt(i)-'0';
                 if('0'<=str.charAt(i+1) && str.charAt(i+1)<='9'){
                     arr[j]=arr[j]*10+(str.charAt(i+1)-'0');
                     i++;
                 }
                 j++;
             }
         }
         for(int i=0;i<arr.length-1;i++){
             if(arr[i+1]==0 && i!=0){
                 continue;
             }
             if(arr[i]>=arr[i+1]){
                 return false;
             }
         }
         return true;
     }
     public static void main(String[] args) {
         System.out.println(numberAscending("hello 5 x 5"));
     }
 }