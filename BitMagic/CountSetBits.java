package BitMagic;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int a = sc.nextInt();
        int count =0;
        for(int i = 0; i<32; i++){
            if(((a>>i)&1)!=0){
                count++;
            }
        }
        System.out.print(count);
    }
}
