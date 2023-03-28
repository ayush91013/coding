package Searching;

public class SquareRoot {
//    static int fun(int x){
//        int i=1;
//        while(i*i <= x){
//            i++;
//        }
//        return (i-1);
//    }
    static int fun(int x){
        int low = 1, high =x,ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            int sqrt = mid*mid;
            if(sqrt == x){
                return mid;
            }
            else if(sqrt>x){
                high = mid-1;
            }
            else{
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
        public static void main(String[] args){
        System.out.println(fun(15));
    }
}
