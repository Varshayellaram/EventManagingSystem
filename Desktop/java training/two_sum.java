import java.util.Arrays;
public class two_sum {
    public static void main(String[] args){
        int[] arr = {4,2,6,1};
        Arrays.sort(arr);
        int target = 8;
        int low=0,high=3;
        while(low<high){
            if(arr[low]+arr[high]==target){
                System.out.println(low+" "+high+" "+arr[low]);
                break;
            }
            else if(arr[low]+arr[high]<target){
                low++;
            }
            else{
                high--;
            }
        }
    }
}
