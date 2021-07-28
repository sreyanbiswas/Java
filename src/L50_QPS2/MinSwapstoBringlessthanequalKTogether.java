import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 7, 9, 5, 8, 7, 4};
        int k=5;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                count++;
            }
        }
        int bad=0;
        for(int i=0;i<count;i++){
            if(arr[i]>k){
                bad++;
            }
        }
        int ans=bad;
        for(int i=0,j=count;j<arr.length;i++,j++){
            if(arr[i]>k){
                bad--;
            }
            if(arr[j]>k){
                bad++;
            }
            ans = Math.min(ans,bad);
        }
        System.out.println(ans);
    }
}