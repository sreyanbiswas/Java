class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<2){
            return;
        }
        int p=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        int q=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[p]){
                q=i;
                break;
            }
        }
        if(p==0 && q==0){
            reverse(nums,0,nums.length-1);
            return;
        }
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
        if(p<nums.length-1){
             reverse(nums,p+1,nums.length-1);
             return;
        }
    }
    public static void reverse(int arr[],int left,int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}