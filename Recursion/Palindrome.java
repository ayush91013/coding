package Recursion;

public class Palindrome {
    static  Boolean fun(char str[], int n, int e){
        if(n==e)
            return true;
        if(str[n] != str[e]) {
            return false;
        }
        if(n<e)
            return (fun(str, n+1, e-1));
        return true;
    }

    public static void main(String[] args) {
        char[] ch = {'m','a','l','a','y','a','l','a','m'};
        System.out.println(fun(ch,0,ch.length-1));
    }
}
