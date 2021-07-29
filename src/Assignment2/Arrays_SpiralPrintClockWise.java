import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int top = 0;
		int bottom = arr.length-1;
		int left=0;
		int right=arr[top].length-1;
		int dir=1;
		int count=(bottom+1)*(right+1);
		while(left<=right && top<=bottom){
			if(count>0){
			if(dir==1){
				for(int i=left;i<=right;i++){
					System.out.print(arr[top][i]+", ");
					count--;
				}
				top++;
				dir=2;
			}
			}
			if(count>0){
			if(dir==2){
				for(int i=top;i<=bottom;i++){
					System.out.print(arr[i][right]+", ");
					count--;
				}
				right--;
				dir=3;
			}
			}
			if(count>0){
			if(dir==3){
				for(int i=right;i>=left;i--){
					System.out.print(arr[bottom][i]+", ");
					count--;
				}
				bottom--;
				dir=4;
			}
			}
			if(count>0){
			if(dir==4){
				for(int i=bottom;i>=top;i--){
					System.out.print(arr[i][left]+", ");
					count--;
				}
				left++;
				dir=1;
			}
			}
		}
		System.out.print("END");
    }
}