package Practise;
import java.util.*;
public class Practise_1 {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Value of m: ");
        int m = sc.nextInt();
        System.out.println("Please Enter The Value of n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int sol = minPathSum(matrix);
        System.out.println(sol);
    }
    public static int minPathSum(int[][] grid){
        if(grid==null || grid.length==0){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[m];
        dp[0] = grid[0][0];
        for(int i =1; i<m;i++){
            dp[i] = dp[i-1] + grid[i][0];
        }
        for(int j=1; j<n; j++){
            for(int i=0; i<m; i++){
                if( i != 0 && j!= 0){
                    dp[i] = grid[i][j] + Math.min(dp[i-1],dp[i]);
                }
                else{
                    dp[i] += grid[i][j];
                }
            }
        }
        return dp[m-1];
    }
}
