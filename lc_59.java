
public class lc_59{
    public static int[][] spiralMatrix2(int n){
        int spMat[][]=new int[n][n];
        int strow=0;
        int stcol=0;
        int endrow=n-1;
        int endcol=n-1;
        int num=1;
        while(strow<=endrow && stcol<=endcol){
            
            //top boundary
            for(int j=stcol;j<=endcol;j++){
                spMat[strow][j]=num++;
            }
            
            //right
            for(int i=strow+1;i<=endrow;i++){
                spMat[i][endcol]=num++;
            }
            //bottom
            for(int j=endcol-1;j>=stcol;j--){
                if(strow==endrow){
                    break;
                }
                spMat[endrow][j]=num++;
            }
            //left
            for(int i=endrow-1;i>=strow+1;i--){
                if(stcol==endcol){
                    break;
                }
                spMat[i][stcol]=num++;
            }
            strow++;stcol++;endcol--;endrow--;
        }
        return spMat;
    }
    public static void main(String[] args) {
        int n = 3;
        spiralMatrix2(n);
    }
}

