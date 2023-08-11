package Matrix;

import java.util.Scanner;

public class Transpose {
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
        res = fun(arr);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(res[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }
    static int[][] fun(int arr[][]){
        int n = arr[0].length;
        int[][] res = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j = 0; j<n; j++){
                res[i][j] = arr[j][i];
            }
        }
        return res;
    }
}
