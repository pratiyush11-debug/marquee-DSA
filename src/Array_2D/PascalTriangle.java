package Array_2D;

import java.util.Scanner;

public class PascalTriangle {
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] pascal(int n){
        int ans[][]= new int[n][];
        for(int i=0;i<n;i++){
            //assigning size in loop because it is not constant.
            ans[i]=new int[i+1];
            //first aur last element sabme one hai..notice pattern!!
            ans[i][0]=ans[i][i]=1;
            // 1 se  start kiya kyuki first column humne fill kardiya hai aur less than i tak ja rha kyuki last
            //elemnt bhi humne fill kar diya hai 1 sarei row ki.
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];

            }

        }
        return ans;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans[][]=pascal(n);
        System.out.println("pascal's triangle of "+ n + " n size  is: ");
        printArray(ans);
    }
}
