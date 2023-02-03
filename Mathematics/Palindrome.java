package Mathematics;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int a = sc.nextInt();
        Boolean result = Palin(a);
        System.out.print(result);
    }
    public static boolean Palin(int n){
        int rev = 0;
        int temp = n;
        while(temp != 0){
            int c = temp%10;
            rev = rev*10 + c;
            temp = temp/10;
        }
        return(rev==n);
    }
}
