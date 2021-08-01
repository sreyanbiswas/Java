class Solution {
    private int count=0;
    public int maxLength(List<String> arr) {
        
        maxLength(arr,0,"");
        return count;
    }
    private boolean isDistinct(String str){
        int []freq=new int [26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(freq[ch-'a']>0){
                return false;
            }
            freq[ch-'a']++;
        }
        return true;
    }
    public void maxLength(List<String>arr,int idx,String ans){
        if(isDistinct(ans)){
            if(ans.length()>count){
                count=ans.length();
            }
        }
        for(int i=idx;i<arr.size();i++){
            maxLength(arr,i+1,ans+arr.get(i));
        }
    }
}