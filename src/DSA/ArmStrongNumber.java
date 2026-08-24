package DSA;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig*dig*dig;
            n=n/10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("ArmStrongNumber");
        }else{
            System.out.println("Not ArmStrong No");
        }

    }
}
