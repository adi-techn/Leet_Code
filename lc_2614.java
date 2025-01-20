
public class lc_2614{
    public static int diagonalPrime(int[][] arr) {
        int max=0;
        int arrLen=(arr.length)*2;
        int diaMat[]=new int[arrLen];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j || i==arr.length-j-1){
                    diaMat[k]=arr[i][j];
                    k++;
                }
            }
        }
        for(int i=0;i<diaMat.length;i++){
            if(isPrimeOpt(diaMat[i]) && max<diaMat[i]){
                max=diaMat[i];
            }
        }
        return max;
    }
    public static boolean isPrimeOpt(int n){
        if(n==2){
            return true;
        }
        if(n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] grid={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalPrime(grid));
        
    }
}

