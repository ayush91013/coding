package BitMagic;

class Solution{

    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){

        if(n == 0) return 0;
        int x = 0;
        while((1 <<x) <= n){ x++;}

        int shift = x-1;

        int a = shift * (1 << (shift-1));
        int b = n+1 -(1 << shift);
        return a+b+countSetBits(b-1);


    }
    public static void main(String args[]){
        System.out.println(countSetBits(9));
    }
}