import java.util.*;
public class Main {
    static int count=0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NKinght(new boolean[n][n],0,n,0,0,"");
        System.out.println();
        System.out.println(count);
    }
    public static void NKinght(boolean board[][],int kpsf,int tk,int row,int col,String ans){
        if(kpsf==tk){
            System.out.print(ans+" ");
            count++;
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
            board[row][col] = true;
            NKinght(board,kpsf+1,tk,row,col+1,ans+"{"+row+"-"+col+"} ");
            board[row][col] = false;
        }
        NKinght(board,kpsf,tk,row,col+1,ans);
    }
    public static boolean isItSafe(boolean board[][],int row,int col){
        int rowArr[] = {-1,-2,-2,-1};
        int colArr[] = {2,1,-1,-2};
        for(int i=0;i<4;i++){
            int rl = row+rowArr[i];
            int cl = col+colArr[i];
            if(rl>=0 && rl<board.length && cl>=0 && cl<board[0].length){
                if(board[rl][cl]){
                    return false;
                }
            }
        }
        return true;
    }
}