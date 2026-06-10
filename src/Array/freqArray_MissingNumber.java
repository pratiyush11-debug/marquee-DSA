package Array;
import java.util.*;
public class freqArray_MissingNumber {
    public static void missing(int arr[],int n) {
        n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                System.out.println(i);
                break;
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={0,2,3};
        int n=arr.length;
        missing(arr,n);
//        int temp[]=new int[n];
//        for(int i=0;i<n;i++){
//            temp[arr[i]]++;
//        }
//        int res[]=new int [n];
//        int k=0;
//        for(int i=0;i<n;i++){
//            if(temp[i]==0){
//                res[k]=temp[i];
//                k++;
//            }
//        }
//        for(int i=0;i<n;i++) {
//
//
//            System.out.println(res[i]);
//        }



    }
}
