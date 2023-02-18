package Recursion;

public class TowerOfHanoi {
    static void fun(int n,char a,char b,char c){
        if(n==0)
            return;
        fun(n-1,a,c,b);
        System.out.println("Move disc "+ n+ " from "+ a + " to "+ c);
        fun(n-1,b,a,c);
    }

    public static void main(String[] args) {
        fun(3,'A','B','C');
    }
}
