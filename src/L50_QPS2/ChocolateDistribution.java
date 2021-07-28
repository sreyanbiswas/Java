import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        for(int i=0;i+m-1<arr.length;i++){
            int min = arr[i];
            int max = arr[i+m-1];
            min_diff = Math.min(min_diff,(max-min));
        }
        System.out.println(min_diff);
    }
}