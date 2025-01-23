
public class lc_2500{
    public static int deleteGreatestValue(int[][] grid) {
        int sum=0;
        int rowMax=0;
        int colSize=grid[0].length;
        if(colSize==1){
            int max= Integer.MIN_VALUE;
            for(int i=0;i<grid.length;i++){
                if(max<grid[i][colSize-1]){
                    max=grid[i][colSize-1];
                }
            }
            return max;
        }
        while(colSize>1){
        for(int i=0;i<grid.length;i++){
            int max= Integer.MIN_VALUE;
            int c=0;
            for(int j=0;j<colSize;j++){
                if(max<grid[i][j]){
                    max=grid[i][j];
                    c=j;
                }
            }
            
            if(max==grid[i][c] && colSize>1){
                
                for(int j=c;j<colSize-1;j++){
                    grid[i][c]=grid[i][++c];
                    
                }
            }
            if(rowMax<max){
                rowMax=max;
            }
        }
        colSize--;
        sum+=rowMax;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] grid={{9,81},{33,17}};
        System.out.println(deleteGreatestValue(grid));;
    }
}
