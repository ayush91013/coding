package Recursion;

public class RopeCut {
    static int fun(int n, int a, int b, int c){
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        int res1 = Math.max(fun(n-a,a,b,c),fun(n-b,a,b,c));
        int res = Math.max(res1,fun(n-c,a,b,c));
        if(res==-1)
            return -1;
        return res+1;
    }

    public static void main(String[] args) {
        System.out.println(fun(12,11,9,12));
    }
}
