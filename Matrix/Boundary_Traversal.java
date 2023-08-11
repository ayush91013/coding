package Matrix;
import java.util.*;
public class Boundary_Traversal {
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
    static void fun(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;
        if (m == 1) {
            for (int i = 0; i < n; i++) {
                System.out.println(arr[0][i]);
            }
        }
        else if (n == 1) {
            for (int i = 0; i < m; i++) {
                System.out.println(arr[i][0]);
            }
        }
        else{
            for (int i = 0; i < n; i++) {
                System.out.println(arr[0][i]);
            }
            for (int i = 1; i < m - 1; i++) {
                System.out.println(arr[i][n - 1]);
            }
            if (m % 2 == 0) {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.println(arr[m - 1][i]);
                }
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[m - 1][i]);
                }
            }
            for (int i = m - 2; i > 0; i--) {
                System.out.println(arr[i][0]);
            }
        }
    }
}
