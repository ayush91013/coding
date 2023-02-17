package Recursion;

import java.awt.*;

public class Fibonacci {
    // n>=0 Fibonacci Series = 0,1,1,2,3,5........
    static int Fib(int n){
//        if(n==0){
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
        if(n<=1){
            return n;
        }
        return Fib(n-1)+Fib(n-2);
    }

    public static void main(String[] args) {
        int c = Fib(5);
        System.out.println(c);
    }
}
