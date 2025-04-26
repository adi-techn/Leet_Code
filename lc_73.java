import java.util.*;

public class lc_73{
    public static void setZeroes(int[][] matrix) {
        List<List<Integer>> arr=new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    List<Integer> arr1=new ArrayList<>();
                    arr1.add(i);
                    arr1.add(j);
                    arr.add(arr1);
                }
            }
        }
        int k=0;
        while(k<arr.size()){
            int i=arr.get(k).get(0);
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=0;
            }
            int c=arr.get(k).get(1);
            for(int j=0;j<matrix.length;j++){
                matrix[j][c]=0;
            }
            k++;
        }
    }
    public static void main(String[] args) {
        int mat[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(mat);

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
