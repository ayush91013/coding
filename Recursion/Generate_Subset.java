package Recursion;
import java.lang.String;
public class Generate_Subset {
    static void fun(String s,String curr, int i){
        if(i==s.length()){
            System.out.println(curr+ " ");
            return;
        }
        fun(s,curr,i+1);
        fun(s,curr+s.charAt(i),i+1);
    }

    public static void main(String[] args) {
        fun("abc", "",0);
    }
}
