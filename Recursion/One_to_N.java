package Recursion;

public class One_to_N {
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        fun(5);
    }
}
