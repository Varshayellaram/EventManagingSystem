import java.io.*;
import java.util.*;
class Result{
    public static long countInversions(List<Integer> arr){
        int[] array = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            array[i]=arr.get(i);
        }
        return mergeSortAndCount(array,0,array.length-1);
    }
    private static long mergeSortAndCount(int[] arr, int left,int right){
        long count =0;
        if(left<right){
            int mid = (left+right)/2;
            count+=mergeSortAndCount(arr, left, mid);
            count+=mergeSortAndCount(arr, mid+1, right);
            count+=mergeAndCount(arr, left, mid,right);
        }
        return count;
    }

    private static long mergeAndCount(int[] arr, int left, int mid, int right){
        int[] leftArr = Arrays.copyOfRange(arr, left, mid+1);
        int[] rightArr = Arrays.copyOfRange(arr, mid+1, right+1);

        int i=0,j=0,k=left;
        long swaps =0;

        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i]<=rightArr[j]){
                arr[k++]=leftArr[i++];
            }
            else{
                arr[k++]=rightArr[j++];
                swaps+=(mid+1)-(left-i);
            }
        }
        while (i<leftArr.length) arr[k++]=leftArr[i++];
        while(j<rightArr.length) arr[k++]=rightArr[j++];
        return swaps;


        
    }
}

