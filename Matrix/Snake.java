package Matrix;
import java.util.Scanner;
public class Snake {
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
        for(int i = 0; i<m; i++){
            if(i%2 == 0){
                for(int j = 0; j<n; j++){
                    System.out.println(arr[i][j]);
                }
            }
            else{
                for(int j = n-1; j>=0; j--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
