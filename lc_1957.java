public class lc_1957{
     public static String makeFancyString(String str){
         int arr[]=new int[str.length()];
         int k=0;
         String s="";
         for(int i=0;i<str.length()-2;i++){
             int c=1;
             if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)){
                 c=3;
             }
             if(c==3){
                 arr[k]=i;
                 k++;
             }
         }
         int m=0;
         for(int j=0;j<str.length();j++){
             if(m<k && arr[m]==j){
                 m++;
                 continue;
             }
             s+=str.charAt(j);
         }
         return s;
     }
     public static void main(String[] args) {
         System.out.println(makeFancyString("aaabbaaaa"));
     }
 }
 
 //         StringBuilder sb = new StringBuilder();
 //         int count = 1;
         
 //         sb.append(str.charAt(0)); // Always include the first character
 
 //         for (int i = 1; i < str.length(); i++) {
 //             if (str.charAt(i) == str.charAt(i - 1)) {
 //                 count++;
 //             } else {
 //                 count = 1; // Reset count for new character
 //             }
 
 //             if (count < 3) { // Allow at most 2 occurrences
 //                 sb.append(str.charAt(i));
 //             }
 //         }
 
 //         return sb.toString();