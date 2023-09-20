package Matrix;

import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j =0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        fun(arr);
    }
    static void fun(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        int top = 0, left = 0, bottom = m-1 ,right = n-1;
        while(top<=bottom && left <= right){
            for(int i = left; i<=right; i++){
                System.out.println(arr[top][i]);
            }
            top++;
            for(int i = top; i<=bottom; i++){
                System.out.println(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i = right; i>=left; i--){
                    System.out.println(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom; i>=top; i--){
                    System.out.println(arr[i][left]);
                }
                left++;
            }
        }
    }
}
