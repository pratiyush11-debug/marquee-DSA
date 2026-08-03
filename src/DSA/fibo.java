package DSA;

public class fibo {
    public static int fibo(int n){
        if (n == 0 || n == 1) {
            return n;

        }
        return fibo(n - 1) + fibo(n  -2);
    }
    public static void main(String[] args) {
        int n=5;
        int first=0;


        int second=1;
        for(int i=1;i<=n;i++){
            int next=first+second;
            first=second;
            second=next;

        }


        System.out.println(first);
}}
