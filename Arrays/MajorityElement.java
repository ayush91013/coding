package Arrays;

public class MajorityElement {
    public static void main(String[] args){
        int[] arr= {8,3,4,8,8,8};
//        //for printing all majority element indexes
//        int max_count = 0;
//        for(int i =0; i<arr.length; i++){
//            int count = 0;
//
//            for(int j =0; j<arr.length; j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if(count>arr.length/2){
//                System.out.print(i);
//                if(i != arr.length-1){
//                    System.out.print(" or ");
//                }
//                max_count = count;
//            }
//        }
//        if(max_count <= arr.length/2){
//            System.out.print("-1");
//        }
        System.out.print(findMajority(arr));
    }
    static int findMajority(int arr[]){
        int res = 0, count =1;
        for(int i=1; i<arr.length; i++){
            if(arr[res] == arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res = i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }
        }
        if(count<=arr.length/2){
            res=-1;
        }
        return arr[res];
    }
}
