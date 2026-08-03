package BackTracking;

import java.util.Scanner;

public class mazePathCount{

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int rows=sc.nextInt();
            int cols=sc.nextInt();
           int count= maze(1,1,rows,cols);
            System.out.println("the total number of ways is " + count);

        }
        private static int maze(int sr,int sc,int er,int ec){
            if(sr>ec || sc>er){
                return 0;
            }
            if(sr==er && sc==ec){

                return 1;
            }
            //go down
           int downWays= maze(sr+1,sc,er,ec);
            //do right
            int rightWays=maze(sr,sc+1,er,ec);
            int totalWays=downWays+rightWays;
            return totalWays;


        }
    }


