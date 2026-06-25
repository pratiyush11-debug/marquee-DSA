package Array_2D;
import java.util.Scanner;

public class printingInSpiralOrder_8 {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateSpiralMatrix(int n) {
        int arr[][] = new int[n][n];
        int topRow = 0;
        int bottomRow = n - 1;
        int leftCol = 0;
        int rightCol = n - 1;
        int curr = 1;
        //&& totalElement<r*c we are taking this condition in every loop because to avoid extra printing
        //  because condition is not satisfied if are not checking in every loop it is giving one extra number
        //which is repeated in our matrix
        while (curr <= n * n) {
            //topRow->leftCol to rightCol
            for (int j = leftCol; j <= rightCol && curr <= n * n; j++) {
                arr[topRow][j] = curr;
                curr++;
            }
            topRow++;
            //rightCol->topRow to bottomRow
            for (int i = topRow; i <= bottomRow && curr <= n * n; i++) {
                arr[i][rightCol] = curr;
                curr++;
            }
            rightCol--;
            //bottomRow->rightCol to leftCol
            for (int j = rightCol; j >= leftCol && curr <= n * n; j--) {
                arr[bottomRow][j] = curr;
                curr++;
            }
            bottomRow--;
            //leftCol ->bottomRow to topRow
            for (int i = bottomRow; i >= topRow && curr <= n * n; i--) {
                arr[i][leftCol] = curr;
                curr++;
            }
            leftCol++;
        }
        return arr;
    }


        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n inputs: ");
            int n = sc.nextInt();
            int matrix[][] = generateSpiralMatrix(n);
            printArray(matrix);


        }
    }

