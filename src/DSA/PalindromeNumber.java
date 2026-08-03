package DSA;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();

        int rev=0;
        int n=n1;
        while(n>0){
            int rem =n%10;

            n=n/10;
            rev=rev*10+rem;



        }
        if(rev==n1){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
