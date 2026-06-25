package Array_2D;

import java.util.Scanner;

public class prefixSum2DArray_8 {
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void prfix_sum(int matrix[][]){
        int r=matrix.length;
        int c= matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]=matrix[i][j]+matrix[i][j-1];
            }

        }
    }
    static int findSum(int [][] matrix,int l1,int r1,int l2,int r2){
        int sum=0;
        prfix_sum(matrix);
        for(int i=l1;i<=l2;i++) {
            if (r1 >= 1) {


                sum+=matrix[i][r2] - matrix[i][r1 - 1];
            } else {
                sum += matrix[i][r2];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // Scanner sc = new Scanner(System.in);
        System.out.println("enter row: ");
        int r=sc.nextInt();
        System.out.println("enter column: ");
        int c=sc.nextInt();
        int [][] arr= new int[r][c];



        System.out.println("give input of the Array: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        System.out.println("rectangularSum is "+   findSum(arr,l1,r1,l2,r2));





    }
}
