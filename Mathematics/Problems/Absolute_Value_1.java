package Mathematics.Problems;

import java.util.Scanner;

public class Absolute_Value_1 {
    public static int absolute(int I) {
        // code here
        if ( I < 0){
            return -I;
        }
        else{
            return I;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = absolute(n);
        System.out.print(b);
    }
}
