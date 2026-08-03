package BackTracking;

import java.util.Scanner;

public class fourDirectionMazePath {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        boolean[][] isVisited=new boolean[rows][cols];
        print(0,0,rows-1,cols-1,"",isVisited);

    }
    public static void print(int sr,int sc,int er,int ec,String s,boolean[][] isVisited){
        if(sr<0 ||sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]==true) return;//very imp
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc]=true;
        print(sr,sc+1,er,ec,s+"R",isVisited);
        print(sr+1,sc,er,ec,s+"D",isVisited);
        print(sr,sc-1,er,ec,s+"L",isVisited);
        print(sr-1,sc,er,ec,s+"U",isVisited);
        isVisited[sr][sc]=false;





    }
}
