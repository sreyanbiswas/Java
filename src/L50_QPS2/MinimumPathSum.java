class Solution {
    public int minPathSum(int[][] grid) {
        return minPathSum(grid,0,0,new int[grid.length][grid[0].length]);
    }
    public static int minPathSum(int grid[][],int r,int c,int strg[][]){
        if(r==grid.length-1 && c==grid[0].length-1){
            return grid[r][c];
        }
        int min = Integer.MAX_VALUE;
        if(strg[r][c]!=0)
            return strg[r][c];
        
        if(r!=grid.length-1)
            min = Math.min(min,minPathSum(grid,r+1,c,strg)+grid[r][c]);
        if(c!=grid[0].length-1)
            min = Math.min(min,minPathSum(grid,r,c+1,strg)+grid[r][c]);
        strg[r][c] = min;
        return min;
    }
}