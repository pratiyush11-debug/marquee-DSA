package Array_2D;

import java.util.Scanner;

public class inputArray_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        System.out.println("the output of the array is: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
