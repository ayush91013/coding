package Recursion;

public class JosephusProblem {
    static int fun(int n, int k){
        if(n==1)
            return 0;
        else
            return ( fun(n-1,k) +k)%n;
    }
// if loop starts from 0
    public static void main(String[] args) {
        System.out.println(fun(5,3));
    }
    // if starts from 1 than print (fun(5,3)+1);
}
