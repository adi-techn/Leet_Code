public class lc_2257 {
     static char board[][];

     public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
          board = new char[m][n];
          for (int i = 0; i < guards.length; i++) {
               board[guards[i][0]][guards[i][1]] = 'G';
          }
          for (int i = 0; i < walls.length; i++) {
               board[walls[i][0]][walls[i][1]] = 'W';
          }

          for (int i = 0; i < m; i++) {
               for (int j = 0; j < n; j++) {
                    if (board[i][j] == 'G') {
                         mark(i, j);
                    }
               }
          }
          int c = 0;
          for (int i = 0; i < m; i++) {
               for (int j = 0; j < n; j++) {
                    if (board[i][j] == '\u0000') { // unicode value of null
                         c++;
                    }
               }
          }
          return c;
     }

     public static void mark(int i, int j) {
          for (int c = j - 1; c >= 0; c--) {
               if (board[i][c] == 'W' || board[i][c] == 'G') {
                    break;
               } else {
                    board[i][c] = '.';
               }
          }
          for (int c = j + 1; c < board[0].length; c++) {
               if (board[i][c] == 'W' || board[i][c] == 'G') {
                    break;
               } else {
                    board[i][c] = '.';
               }
          }
          for (int r = i - 1; r >= 0; r--) {
               if (board[r][j] == 'W' || board[r][j] == 'G') {
                    break;
               } else {
                    board[r][j] = '.';
               }
          }
          for (int r = i + 1; r < board.length; r++) {
               if (board[r][j] == 'W' || board[r][j] == 'G') {
                    break;
               } else {
                    board[r][j] = '.';
               }
          }
     }

     public static void main(String[] args) {
          int m=4,n=6;
          int guards[][]={{0,0},{1,1},{2,3}};
          int walls[][]={{0,1},{2,2},{1,4}};

          System.out.println(countUnguarded(m, n, guards, walls));
     }
}
