package Arrays;

public class TrappingRainWater {
    public static void main(String[] args){
        int[] arr = {3,0,1,2,5};
        int n = arr.length;
//        int min = Math.min(arr[0], arr[n-1]);
//        int count = 0;
//        for(int i = 1; i<n-1; i++){
//            count = count + min - arr[i];
//        }
        int count = 0;
        for(int i = 1; i<n-1; i++){
            int lmax = arr[i];
            for(int j = 0; j<i; j++){
                lmax = Math.max(lmax,arr[j]);
            }
            int rmax = arr[i];
            for(int k = i+1; k<n; k++){
                rmax = Math.max(rmax,arr[k]);
            }
            count = count + Math.min(rmax, lmax)- arr[i];
        }
        System.out.print(count);
    }
}
