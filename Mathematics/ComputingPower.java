package Mathematics;

import java.util.Scanner;

public class ComputingPower {
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
        if(b==0){
            return 1;
        }
        int temp = Power(a,b/2);
        temp = temp * temp;
        if(b%2==0){
            return temp;
        }
        else
            return temp*a;
    }
}
