import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int top=0;
		int bottom = arr.length-1;
		int left=0;
		int right=arr[bottom].length-1;
		int dir=1;
		while(left<=right && top<=bottom){
			if(dir==1){
				for(int i=top;i<=bottom;i++){
					System.out.print(arr[i][left]+", ");
				}
				dir=2;
				left++;
			}
			if(dir==2){
				for(int i=left;i<=right;i++){
					System.out.print(arr[bottom][i]+", ");
				}
				dir=3;
				bottom--;
			}
			if(dir==3){
				for(int i=bottom;i>=top;i--){
					System.out.print(arr[i][right]+", ");
				}
				dir=4;
				right--;
			}
			if(dir==4){
				for(int i=right;i>=left;i--){
					System.out.print(arr[top][i]+", ");
				}
				dir=1;
				top++;
			}
		}
		System.out.print("END");
    }
}