import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class lc_3318 {
     static class Pair implements Comparable<Pair> {
          int n;
          int freq;

          public Pair(int n, int freq) {
               this.n = n;
               this.freq = freq;
          }

          @Override
          public int compareTo(Pair p2) {
               if (p2.freq == this.freq) {
                    return p2.n - this.n;
               } else {
                    return p2.freq - this.freq;
               }
          }
     }

     public static int[] findXSum(int[] nums, int k, int x) {
          List<Integer> arr = new ArrayList<>();
          for (int n : nums) {
               arr.add(n);
          }

          int ans[] = new int[nums.length - k + 1];

          for (int i = 0; i < nums.length - k + 1; i++) {
               ans[i] = xsum(arr.subList(i, i + k), x);
          }

          return ans;
     }

     public static int xsum(List<Integer> arr, int x) {
          HashMap<Integer, Integer> hm = new HashMap<>();
          int sum = 0;

          for (int n : arr) {
               hm.put(n, hm.getOrDefault(n, 0) + 1);
          }

          if (hm.size() < x) {
               for (int n : arr) {
                    sum += n;
               }
               return sum;
          }

          PriorityQueue<Pair> pq = new PriorityQueue<>();
          for (int key : hm.keySet()) {
               pq.add(new Pair(key, hm.get(key)));
          }

          for (int i = 0; i < x; i++) {
               // System.out.println(pq.poll().n);
               Pair p = pq.poll();
               sum += (p.n * p.freq);
          }
          return sum;
     }

     public static void main(String[] args) {
          int nums[] = { 1, 1, 2, 2, 3, 4, 2, 3 };
          int k = 6, x = 2;
          for (int n : findXSum(nums, k, x)) {
               System.out.print(n + " ");
          }
     }
}
