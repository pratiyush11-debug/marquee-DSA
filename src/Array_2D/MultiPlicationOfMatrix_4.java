package Array_2D;

import java.util.Scanner;

public class MultiPlicationOfMatrix_4 {
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void multiply(int a[][],int r1,int c1,int b[][],int r2,int  c2){
        if(c1!=r2){
            System.out.println("Multiplication of Matrices Not Possible.\n Dimension is Wrong");
            return;
        }
        int mul[][]= new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                //c1 or r2 kuch bhi le sakte hai
                //aur yeh itne times hi chalega kyuki itne baar multiply karke plus karna hai;
                for(int k=0;k<c1;k++){
                    //k isiliye liya hai kyuki wese hi 0,1,2,3 tak hi vary karega woh matrix
                    //if you know you know!!
                    mul[i][j]= mul[i][j]+(a[i][k]*b[k][j]);
                    //mul[i][j]+=(a[i][k]*b[k][j]);

                }
            }
        }
        System.out.println("multiplication of 2 matrices is: ");
        printArray(mul);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("give r1: ");
        int  r1=sc.nextInt();
        System.out.println("give c1: ");
        int c1=sc.nextInt();
        System.out.println("give r2: ");
        int  r2=sc.nextInt();
        System.out.println("give c2: ");
        int  c2=sc.nextInt();
        int a[][]= new int[r1][c1];
        int b[][]= new int[r2][c2];
        System.out.println("give input of first array: ");
        for(int i=0;i<r1;i++ ){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("give input of second array: ");
        for(int i=0;i<r2;i++ ){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        multiply(a,r1,c1,b,r2,c2);

    }
}
