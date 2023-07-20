package Practise;
import java.util.*;
public class Practise_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First String: ");
        String s1 = sc.next();
        System.out.println("Please Enter Another String: ");
        String s2 = sc.next();
        Boolean a = Anagram(s1,s2);
        System.out.println(a);
    }
    static Boolean Anagram(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1!=n2){
            return false;
        }
        char[] c1 = new char[n1];
        char[] c2 = new char[n2];
        for(int i=0; i<n1; i++){
            c1[i] = s1.charAt(i);
        }
        for(int i=0; i<n2; i++){
            c2[i] = s2.charAt(i);
        }
        for(int i = 0; i<n1; i++){
            Boolean flag = true;
            for(int j = 0; j<n1; j++){
                if(c1[i] == c2[j]){
                    c1[i] = 0;
                    c2[j] = 0;
                    flag = false;
                }
            }
            if(flag == true){
                return false;
            }
        }
//        for(int i = 0; i<n1; i++){
//            if(c1[i] != 0 || c2[i] != 0){
//                return false;
//            }
//        }
        return true;
    }
}