package Recursion;

public class Sum_N_Using_Recursion {
//    static int fun(int n){
//        if(n==1)
//            return 1;
//        return n+fun(n-1);
//    }

    // k>=1
    static int fun(int n, int k){
        if(n==1)
            return k;
        return k+fun(n-1,k+1);
    }

    public static void main(String[] args) {
        System.out.println(fun(10,1));
    }
}
