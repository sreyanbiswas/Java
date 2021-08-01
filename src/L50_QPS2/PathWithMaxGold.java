class Solution {
    public int getMaximumGold(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int ans = maxGold(grid,i,j,new boolean[grid.length][grid[0].length]);
                if(ans>max)
                    max=ans;
            }
        }
        return max;
    }
    public static int maxGold(int arr[][],int cr,int cc,boolean visited[][]){
        if(cr<0 || cr>=arr.length || cc<0 || cc>=arr[0].length || visited[cr][cc] || arr[cr][cc]==0){
            return 0;
        }
        int ans=0;
        visited[cr][cc] = true;
        int opt1 = maxGold(arr,cr-1,cc,visited)+arr[cr][cc];
        int opt2 = maxGold(arr,cr+1,cc,visited)+arr[cr][cc];
        int opt3 = maxGold(arr,cr,cc-1,visited)+arr[cr][cc];
        int opt4 = maxGold(arr,cr,cc+1,visited)+arr[cr][cc];
        visited[cr][cc] = false;
        ans = Math.max(opt1,Math.max(opt2,Math.max(opt3,opt4)));
        return ans;
    }
}