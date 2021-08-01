class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                boolean ans = exist(board,0,word,i,j,new boolean[board.length][board[0].length]);
                if(ans)
                    return true;
            }
        }
        return false;
    }
    public static boolean exist(char arr[][],int vidx,String word,int cr,int cc,boolean visited[][]){
        if(vidx==word.length()){
            return true;
        }
        if(cr<0 || cr>=arr.length || cc<0 || cc>=arr[0].length || visited[cr][cc] || arr[cr][cc]!=word.charAt(vidx)){
            return false;
        }
        visited[cr][cc] = true;
        boolean opt1 = exist(arr,vidx+1,word,cr-1,cc,visited);
        boolean opt2 = exist(arr,vidx+1,word,cr+1,cc,visited);
        boolean opt3 = exist(arr,vidx+1,word,cr,cc-1,visited);
        boolean opt4 = exist(arr,vidx+1,word,cr,cc+1,visited);
        visited[cr][cc] = false;
        return opt1 || opt2|| opt3 || opt4;
    }
}