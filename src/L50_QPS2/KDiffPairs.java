class Solution {
    public int findPairs(int[] arr, int k) {
        HashSet<String> set = new HashSet<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])==k){
                    if(!set.contains(arr[i]+"-"+arr[j]) || !set.contains(arr[j]+"-"+arr[i])){
                        count++;
                        set.add(arr[i]+"-"+arr[j]);
                        set.add(arr[j]+"-"+arr[i]);
                    }
                }
            }
        }
        return count;
    }
}