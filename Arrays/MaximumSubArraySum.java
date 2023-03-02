package Arrays;

public class MaximumSubArraySum {
    public static void main(String[] args){
        int arr[] = {2,3,-8,7,-1,2,3};
        int n = arr.length;
        int res = arr[0];
        for(int i =0;i<n;i++){
            int curr =0;
            for(int j = i; j<n; j++){
                curr = curr+arr[j];
                res = Math.max(res,curr);
            }
        }
        System.out.print(res);
    }
}
