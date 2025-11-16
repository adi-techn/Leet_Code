import java.util.ArrayList;

public class lc_1492 {
     public static int kthFactor(int n, int k) {
          ArrayList<Integer> factor = new ArrayList<>();

          for (int i = 1; i <= n; i++) {
               if (n % i == 0) {
                    factor.add(i);
               }
          }
          // System.out.println(factor);
          return factor.size() >= k ? factor.get(k - 1) : -1;
     }

     public static void main(String[] args) {
          System.out.println(kthFactor(12, 3));
     }
}
