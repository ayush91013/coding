package Matrix;

import java.util.Scanner;

public class AntiClock90 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] res = new int[n][n];
        fun(arr);
    }
    static void fun(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        for(int i = n-1; i>=0; i--){
            for(int j = 0; j<m; j++){
                System.out.print(arr[j][i]+ " ");
            }
            System.out.print("\n");
        }
    }
}
