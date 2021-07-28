import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {5, 20, 3, 2, 50, 80};
        int n = 78;
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        boolean flag=false;
        while(i<j){
            int t = arr[j]-arr[i];
            if(t==n){
                System.out.println(arr[i]+" "+arr[j]);
                flag=true;
                break;
            }else if(t<n){
                i++;
            }else{
                j--;
            }
        }
        if(!flag){
            System.out.println("No Pair");
        }
    }
}