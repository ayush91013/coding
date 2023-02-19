package Recursion;

public class Permutation_String {
    static void fun(String str,int i){
        if(str.length()-1==i){
            System.out.println(str);
        }
        else{
            for(int j=i; j<str.length();j++){
                str = fun2(str,i,j);
                fun(str, i+1);
                str = fun2(str,i,j);
            }
        }
    }
    static String fun2(String a, int i, int j){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "ABCD";
        fun(str,0);
    }
}
