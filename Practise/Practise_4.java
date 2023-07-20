package Practise;
import java.util.*;
import java.io.*;
public class Practise_4 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please Enter the String: ");
    String s1 = sc.nextLine();
    String r = "";
    for(int i = 0; i< s1.length(); i++){
        char c = s1.charAt(i);
        if(c != ' '){
            r = r+c;
            }
        }
    System.out.print(r);
    }
}
