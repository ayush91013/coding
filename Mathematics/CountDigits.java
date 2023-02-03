package Mathematics;
import java.util.*;
public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("Please Enter The Number: ");
        int n = sc.nextInt();
        count = 0;
        while(n != 0){
            count = count + 1;
            n = n/10;
        }
        System.out.print(count);
    }
}
