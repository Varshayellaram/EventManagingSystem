//Bubble sort technique
public class sorting_array {
    public static void main(String[] args){
        int[] arr = {3,1,8,4};
        int temp;
        for(int i=0;i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[j]<arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int element:arr){
            System.out.println(element);
        }
    }
}
