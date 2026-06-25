package Array;

import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int arr[]=new int[5];
        System.out.print("Give input of the array: ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("the input of the array is: ");

        for(int i=0;i<5;i++) {
            if (arr[i] % 2 != 0) {


                System.out.print(arr[i] + " ");
            }
        }

    }
}
