import java.util.*;
public class Main {
	public static int total=0;
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		NQueen(new boolean[n][n],0,0,0,n,"");
		System.out.println();
		System.out.println(total);
    }
	public static void NQueen(boolean board[][],int row,int col,int qpsf,int tq,String ans){
		if(tq==qpsf){
			System.out.print(ans+" ");
			total++;
			return;
		}
		if(col==board[0].length){
			row++;
			col=0;
		}
		if(row==board.length){
			return;
		}
		if(isItSafe(board,row,col)){
			board[row][col]=true;
			NQueen(board,row+1,0,qpsf+1,tq,ans+"{"+(row+1)+"-"+(col+1)+"} ");
			board[row][col]=false;
		}
		NQueen(board,row,col+1,qpsf,tq,ans);
	}
	public static boolean isItSafe(boolean board[][],int row,int col){
		int r = row-1;
		int c = col;
		while(r>=0){
			if(board[r][c]){
				return false;
			}
			r--;
		}
		r = row;
		c = col-1;
		while(c>=0){
			if(board[r][c]){
				return false;
			}
			c--;
		}
		r = row-1;
		c = col-1;
		while(r>=0 && c>=0){
			if(board[r][c]){
				return false;
			}
			r--;
			c--;
		}
		r = row-1;
		c = col+1;
		while(r>=0 && c<board[0].length){
			if(board[r][c]){
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
}