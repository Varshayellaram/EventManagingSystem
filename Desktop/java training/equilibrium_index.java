public class equilibrium_index {
    public static void main(String[] args){
        int[] arr = {12,2,4,8};
        int lsum=0, rsum=0, i=1 , equi_index=-1;

        while(i<arr.length){
            lsum+=arr[i-1];
            int j=i+1;
            while(j<arr.length){
                rsum += arr[j];
                if(rsum>lsum){
                    break;
                }
                j++;
            }
            if(lsum==rsum){
                equi_index = i;
                i=arr.length;
            }
            else{
                i++;
                rsum=0;
            }
        }
        if(equi_index!=-1){
            System.out.println(equi_index);
        }
        else{
            System.out.println(-1);
        }
    }
}
