import java.util.*;
public class Main {
	public static int count=0;
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boardpath(0,n,m,"");
		System.out.println();
		System.out.print(count);
    }
	public static void boardpath(int curr, int end, int faces,String ans){

        if(curr == end){

            System.out.print(ans+" ");
			count++;
			return;
        }

        for(int dice = 1;dice <= faces && dice + curr <= end;dice++){
           boardpath(curr + dice,end,faces,ans+dice);
        }
    }
}