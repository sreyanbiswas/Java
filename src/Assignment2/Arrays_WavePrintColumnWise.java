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
		for(int col=0;col<arr[0].length;col++){
			if(col%2==0){
				for(int row=0;row<arr.length;row++){
					System.out.print(arr[row][col]+", ");
				}
			}else{
				for(int row=arr.length-1;row>=0;row--){
					System.out.print(arr[row][col]+", ");
				}
			}
		}
		System.out.print("END");
    }
}