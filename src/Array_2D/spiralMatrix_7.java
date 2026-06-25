package Array_2D;

import java.util.Scanner;

public class spiralMatrix_7 {
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void spiralOrder(int arr[][],int r,int c){
        int topRow=0;
        int bottomRow=r-1;
        int leftCol=0;
        int rightCol=c-1;
        int totalElement=0;
        //&& totalElement<r*c we are taking this condition in every loop because to avoid extra printing
        //  because condition is not satisfied if are not checking in every loop it is giving one extra number
        //which is repeated in our matrix
        while(totalElement<r*c){
            //topRow->leftCol to rightCol
            for(int j=leftCol;j<=rightCol && totalElement<r*c;j++){
                System.out.print(arr[topRow][j] + " ");
                totalElement++;
            }
            topRow++;
            //rightCol->topRow to bottomRow
            for(int i=topRow;i<=bottomRow && totalElement<r*c;i++){
                System.out.print(arr[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;
            //bottomRow->rightCol to leftCol
            for(int j=rightCol;j>=leftCol && totalElement<r*c;j--){
                System.out.print(arr[bottomRow][j]+ " ");
                totalElement++;
            }
            bottomRow--;
            //leftCol ->bottomRow to topRow
            for(int i=bottomRow;i>=topRow && totalElement<r*c;i--){
                System.out.print( arr[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row: ");
        int r=sc.nextInt();
        System.out.println("enter column: ");
        int c= sc.nextInt();
        int matrix[][]= new int[r][c];
        int total=r*c;
        System.out.println("enter "+ total + " values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();

            }
        }
        System.out.println("printing input matrix");
        printArray(matrix);

        System.out.println("spiral order");
        spiralOrder(matrix,r,c);



    }
}
