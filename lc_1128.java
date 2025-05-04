public class lc_1128 {
     public static int numEquivDominoPairs(int[][] dominoes) {
          int count=0;
          int freq[]=new int[100];
          for(int i=0;i<dominoes.length;i++){
              int a = Math.min(dominoes[i][0], dominoes[i][1]);
              int b = Math.max(dominoes[i][0], dominoes[i][1]);
              int key=a*10+b;
              count+=freq[key];
              freq[key]++;
          }
          return count;
     }
     public static void main(String[] args) {
          int arr[][]={{1,2},{2,1},{3,4},{5,6}};
          System.out.println(numEquivDominoPairs(arr));
     }
}
