import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lc_916 {
     public static List<String> wordSubsets(String[] words1, String[] words2) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<words2.length;i++){
            HashMap<Character,Integer> temp=new HashMap<>();
            for(int j=0;j<words2[i].length();j++){
                char ch=words2[i].charAt(j);
                temp.put(ch,temp.getOrDefault(ch,0)+1);
            }
            for(char key:temp.keySet()){
                hm1.put(key, Math.max(hm1.getOrDefault(key, 0), temp.get(key)));
            }
        }
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<words1.length;i++){
            HashMap<Character,Integer> hm=new HashMap<>();
            for(int j=0;j<words1[i].length();j++){
                char ch=words1[i].charAt(j);
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
            boolean st=true;
            for(char key:hm1.keySet()){
                if(hm.getOrDefault(key,0)<hm1.get(key)){
                    st=false;
                    break;
                }
            }
            if(st){
                arr.add(words1[i]);
            }
        }
        return arr;
     }
     public static void main(String[] args) {
          String words1[]={"amazon","apple","facebook","google","leetcode"};
          String words2[]={"e","o"};
          System.out.println(wordSubsets(words1, words2));
     }
}
