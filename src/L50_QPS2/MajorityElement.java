class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans=0;
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int nf = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],nf);
        }
        for(int key:map.keySet()){
           if(map.get(key)>n/2)
               ans = key;
        }
        return ans;
    }
}