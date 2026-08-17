package BackTracking;

public class knightConfiguration {
    public boolean helper(int [][] grid,int row,int col,int num){
         int n=grid.length;
         if(grid[row][col]==n*n-1) return true;
         int i;
         int j;
         //2 up 1 right
        i=row-2;
        j=col+1;
        if(i>=0 && j<n){
            if(grid[i][j]==num+1) return helper(grid,i,j,num+1);
        }
        //2 up 1 left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0){
            if(grid[i][j]==num+1) return helper(grid,i,j,num+1);

        }
        // 1 up 2 right
        i=row-1;
        j=col+2;
        if(i>=0 && j<n){
            if(grid[i][j]==num+1) return helper(grid,i,j,num+1);
        }
        // 1 up 2 left
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0){
            if(grid[i][j]==num+1) return helper(grid,i,j,num+1);
        }
        //2 down 1 right
        i=row+2;
        j=col+1;
        if(i<n && j<n){
            if(grid[i][j]==num+1) return helper(grid,i,j,num+1);
        }
        // 2 down 1 left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 ){
            if(grid[i][j]==num+1) return helper(grid,i,j,num+1);
        }
        //1 down 2 right
        i=row+1;
        j=col+2;
        if(i<n && j<n ){
            if(grid[i][j]==num+1) return helper(grid,i,j,num+1);
        }
        // 1 down 2 left
        i=row+1;
        j=col-2;
        if(i<n && j>=0){
            if(grid[i][j]==num+1) return helper(grid,i,j,num+1);
        }
        return false;
    }

    public boolean checkValidGrid(int [][] grid){
        if(grid[0][0]!=0) return false;
        return helper(grid,0,0,0);
    }
    public static void main(String[] args) {

        int[][] grid = {
                {0, 3, 6},
                {5, 8, 1},
                {2, 7, 4}
        };

        knightConfiguration obj = new knightConfiguration();

        boolean ans = obj.checkValidGrid(grid);

        System.out.println(ans);
    }
}
