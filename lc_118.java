import java.util.ArrayList;
import java.util.List;

public class lc_118 {
     public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int num = 1; 
            for (int j = 0; j <= i; j++) {
                row.add(num);
                num = num * (i - j) / (j + 1); 
            }
            triangle.add(row);
        }
        return triangle;
     }
     public static void main(String[] args) {
          System.out.println(generate(5));
     }
}
