public class lc_744{
     public static char search(char[] letters,char target) {
         int n=letters.length;
         char least=letters[0];
         for(int i=0;i<n;i++){
             if(letters[i]>target){
                 least=letters[i];
                 break;
             }
         }
 
         return least;
     }
     public static void main(String[] args) {
         char arr[]={'x','x','y','y'};
         System.out.println(search(arr,'z'));
     }
 }