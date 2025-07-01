import java.util.HashMap;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int num;
    int freq;

    public Pair(int num,int freq){
        this.num=num;
        this.freq=freq;
    }

    @Override
    public int compareTo(Pair p2){
        return p2.freq-this.freq;
    }
}
public class lc_347 {
     public static int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int key:hm.keySet()){
            pq.add(new Pair(key,hm.get(key)));
        }
        int i=0;
        while(k!=0){
            int n=pq.remove().num;
            res[i++]=n;
            k--;
        }
        return res;
     }
     public static void main(String[] args) {
          int num[]={1,1,1,2,2,3};
          int k=2;
          for(int x:topKFrequent(num, k)){
               System.out.print(x+" ");
          }
     }
}
