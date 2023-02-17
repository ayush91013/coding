package Recursion;

public class Practise_1 {
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
        fun(n-1);
    }

    public static void main(String[] args) {
        fun(3);
    }
}
