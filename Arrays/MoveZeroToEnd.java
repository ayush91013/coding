package Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {8,5,0,10,0,20};
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                for(int j= i+1; j<arr.length; j++){
                    if(arr[j] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
        //System.out.print(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+ arr[6]+ arr[7]);
    }
}
