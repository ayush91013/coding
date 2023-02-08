package Mathematics;

import java.util.Scanner;

public class IterativePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int x = sc.nextInt();
        System.out.println("Please Enter the Power: ");
        int n = sc.nextInt();
        int c = Power(x,n);
        System.out.println(c);
    }
    public static int Power(int a, int b){
        int res = 1;
        while(b>0){
            if(b%2 != 0)
                res = res * a;
            a = a*a;
            b = b/2;
        }
        return res;
    }
}
