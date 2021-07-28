class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int na1[] = new int[nums.length-1];
        int na2[] = new int[nums.length-1];
        for(int i=0;i<na1.length;i++){
            na1[i] = nums[i];
        }
        for(int i=0;i<na2.length;i++){
            na2[i] = nums[i+1];
        }
        int strg[] = new int[nums.length-1];
        Arrays.fill(strg,-1);
        int m1 = rob(na1,0,strg);
        int strg1[] = new int[nums.length-1];
        Arrays.fill(strg1,-1);
        int m2 = rob(na2,0,strg1);
        return Math.max(m1,m2);
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