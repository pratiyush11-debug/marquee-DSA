package Array;

public class geometricTriplet {
    public static void main(String[] args) {
        int arr[]={2,4,8,16,32};
        for(int j=1;j<arr.length;j++){
            int i=j-1;




        int n= arr.length;
        while(i>=0) {
            int k=j+1;
            while (k<n) {
                if(arr[j] *arr[j]==arr[i] * arr[k]){
                    System.out.println("(" + arr[i]+ " " +arr[j] + " "+arr[k] + ")");

                }
                k++;
            }
            i--;
        }

        }
    }
}
