package Arrays;

public class LongestEvenOddSubArrays {
    public static void main(String[] args){
        int arr[] = {10,12,14,7,8};
        int n = arr.length;
        int res = 0;
        for(int i =0; i<n; i++){
            int curr =1;
            for(int j = i+1; j<n; j++){
                if((arr[j]%2==0 && arr[j-1] !=0) || (arr[j]%2!=0 && arr[j-1] ==0))
                {
                    curr++;
                }
                else{
                    break;
                }
            }
            res = Math.max(curr,res);
        }
        System.out.print(res);
    }
}
