package Arrays;

public class MaximumConsecutive1 {
    public static void main(String[] args){
        int[] arr = {0,1,1,1,1,1,0,1,1,1,0,1};

        int count1=0;
        for(int i = 0 ; i<arr.length; i++){
            int count = 0;
            if(arr[i] == 1) {
                for (int j = i; j < arr.length; j++) {
                    if(arr[j]==1){
                        count++;
                    }
                    else{
                        break;

                    }
                }
                if(count1!=count){
                    count1 = Math.max(count1,count);
                }
            }
        }
        System.out.println(count1);
    }
}
