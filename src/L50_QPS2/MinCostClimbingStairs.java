class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int c1[] = new int[cost.length-1];
        for(int i=0;i<c1.length;i++){
            c1[i] = cost[i+1];
        }
        int i1 = minCost(cost,0,new int[cost.length]);
        int i2 = minCost(c1,0,new int[c1.length]);
        return Math.min(i1,i2);
    }
    public int minCost(int arr[],int vidx,int strg[]){
        if(vidx>=arr.length){
            return 0;
        }
        if(strg[vidx]!=0){
            return strg[vidx];
        }
        int s1 = minCost(arr,vidx+1,strg)+arr[vidx];
        int s2 = minCost(arr,vidx+2,strg)+arr[vidx];
        int ans = Math.min(s1,s2);
        strg[vidx] = ans;
        return ans;
    }
}