public class second_small{
    public static void main(String[] args) {
        int[] arr = {1,2,1,56,45,6,3,2,89};
        int min=Integer.MAX_VALUE,smin=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            if(smin>arr[i] && arr[i]!=min){
                smin=arr[i];
            }
        }
        System.out.println(smin);
    }
}
