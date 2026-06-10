package Array_2D;

import java.util.Scanner;

public class TranposeOfMatrix_5 {

        static void printArray(int arr[][]){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        static void reverse(int arr[]){
           int  i=0;
            int n=arr.length;
          int  j=n-1;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

            }
        }
        static void rotateMatrix90degreee(int arr[][],int n){
            InplaceTranspose(arr, n, n);
            for(int i=0;i<n;i++){
                reverse(arr[i]);

            }
        }
        // inplace transpose is only for square matrix otherwise if we use swap in any other matrix it will give
    //wrong output.
        static void InplaceTranspose(int arr[][],int r,int c){
            for(int i=0;i<c;i++){
                for(int j=i;j<r;j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;

                }
            }
        }
        public static int[][] Transpose(int a[][],int r,int c){
            int ans[][]=new int[c][r];
            for(int i=0;i<c;i++){
                for(int j=0;j<r;j++){
                    ans[i][j]=a[j][i];
                }
            }
            return ans;

        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("give r: ");
        int  r=sc.nextInt();
        System.out.println("give c: ");
        int c=sc.nextInt();
        int totalElements=r*c;

        System.out.println("Enter" + totalElements + " Elements");


        int a[][]= new int[r][c];

        System.out.println("give input of first array: ");
        for(int i=0;i<r;i++ ){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Input Matrix");
        printArray(a);
        int n=a.length;
        System.out.println("matrix after rotation is");
        rotateMatrix90degreee(a,n);
        printArray(a);
//        System.out.println("output after Transpose");
//        InplaceTranspose(a,r,c);
//        printArray(a);
//       int ans[][]= Transpose(a,r,c);
//        System.out.println("Output of the matrix  after Transpose is: ");
//      printArray(ans);




    }

}
