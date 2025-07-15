public class lc_880 {
     public static String decodeAtIndex(String str, int k) {
        long size=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='2' && ch<='9'){
                size*=(ch-'0');
            }else{
                size++;
            }
        }
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            k%=size;
            
            if(k==0 && Character.isLetter(ch)){
                return Character.toString(ch);
            }
            if(ch>='2' && ch<='9'){
                size/=ch-'0';
            }else{
                size--;
            }
        }
        return "";
     }
     public static void main(String[] args) {
          String str="leet2code3";
          int k=10;
          System.out.println(decodeAtIndex(str, k));
     }
}
