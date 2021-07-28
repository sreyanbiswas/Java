class Solution {
    public int rob(int[] nums) {
        int strg[] = new int[nums.length];
        Arrays.fill(strg,-1);
        return rob(nums,0,strg);
    }
    public static int rob(int arr[],int vidx,int strg[]){
        if(vidx>=arr.length){
            return 0;
        }
        if(strg[vidx]!=-1){
            return strg[vidx];
        }
        int i = rob(arr,vidx+2,strg)+arr[vidx];
        int e = rob(arr,vidx+1,strg);
        int ans = Math.max(i,e);
        strg[vidx] = ans;
        return ans;
    }
}