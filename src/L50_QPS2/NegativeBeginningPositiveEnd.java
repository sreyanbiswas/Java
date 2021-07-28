import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = { -12, 11, -13, -5,
                   6, -7, 5, -3, 11 };
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(arr[left]<0 && arr[right]<0){
                left++;
            }else if(arr[left]>0 && arr[right]>0){
                right--;
            }else if(arr[left]>0 && arr[right]<0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }else{
                left++;
                right--;
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}