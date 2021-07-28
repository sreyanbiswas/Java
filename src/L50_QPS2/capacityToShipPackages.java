class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        for(int val:weights){
            sum += val;
        }
        int lo = 0;
        int hi = sum;
        int finalAns=0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(possible(weights,mid,days)){
                finalAns = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return finalAns;
    }
    public static boolean possible(int arr[],int mid,int days){
        int tot = arr.length;
        int sn=0;
        int wt=0;
        int d=0;
        while(sn<tot){
            if(wt+arr[sn]<=mid){
                wt = wt+arr[sn];
                sn++;
            }else{
                d++;
                wt=0;
                if(d==days){
                    return false;
                }
            }
        }
        return true;
    }
}