package Array;

public class SubArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
