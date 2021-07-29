import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]+", ");
				}
				}else{
					for(int j=arr[i].length-1;j>=0;j--){
						System.out.print(arr[i][j]+", ");
					}
				}
			}
			System.out.print("END");
		}
    }