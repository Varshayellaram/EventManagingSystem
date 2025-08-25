//we can also do this simply by reverse loop
//using two pointer approach
public class reverse_array {
    public static void main(String[] args){
        int[] arr = {12,32,1,54,3};
        int i=0,j=arr.length-1,temp;
        while(i<=j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        for(int element:arr){
            System.out.println(element);
        }
    }
}
