import java.util.*;
public class lc_438 {
     public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> arr=new ArrayList<>();
        if(s.length()<p.length()){
            return arr;
        }

        int pcount[]=new int[26];
        int scount[]=new int[26];

        for(int i=0;i<p.length();i++){
            pcount[p.charAt(i)-'a']++;
            scount[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pcount, scount)) {
            arr.add(0);
        }

        for(int i=p.length();i<s.length();i++){
            scount[s.charAt(i)-'a']++;
            scount[s.charAt(i-p.length())-'a']--;

            if(Arrays.equals(pcount,scount)){
                arr.add(i-p.length()+1);
            }
        }
        return arr;
     }
     public static void main(String[] args) {
          System.out.println(findAnagrams("abab", "ab"));
     }
}
