package Array;

public class MaxDuplicateDistance {
    public static int max(int a,int b){
        return (a>b?a:b);
    }
    public static int array(int arr[],int n){
        int res=0;
        for(int i=0;i<n;i++){
            int search=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]==search){
                    res=max(res,j-i);
                }
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,4,5,6};
        int n=arr.length;
        System.out.println(array(arr,n));

    }
}
