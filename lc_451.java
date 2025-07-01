import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    char ch;
    int freq;

    public Pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }

    @Override
    public int compareTo(Pair p2){
        return this.freq-p2.freq;
    }
}
public class lc_451 {
     public static String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(char key:hm.keySet()){
            pq.add(new Pair(key,hm.get(key)));
        }
        StringBuilder sb=new StringBuilder("");
        while(!pq.isEmpty()){
            int f=pq.peek().freq;
            char ch=pq.peek().ch;
            while(f!=0){
                sb.append(ch);
                f--;
            }
            pq.remove();
        }
        return sb.toString();
     }
     public static void main(String[] args) {
          String s="tree";
          System.out.println(frequencySort(s));
     }
}
