package L23_Leetcode;

public class Backtracking {

	public static void main(String[] args) {

		// QueenCombinationBoxRespect(new boolean[4], 0, 2, 0, "");
		// coinChange(new int[] { 2, 3, 5, 6 }, 0, 10, "");

		// QueenCombinationBoxRespect2D(new boolean[2][3], 0, 0, 2, 0, "");

		// NQueen(new boolean[4][4], 0, 0, 4, 0, "");

		// char[][] board = { { 'o', 'x', 'o', 'o' }, { 'o', 'o', 'o', 'o' }, { 'o',
		// 'x', 'o', 'o' },
		// { 'o', 'o', 'x', 'o' } };

		// blockedMaze(board, 0, 0, "", new boolean[board.length][board[0].length]);

		// NQueen2(new boolean[4][4], 0, "");

	}
	
	public static void QueenPermutation(boolean boxes[], int qpsf, int tq, String ans) {

		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < boxes.length; i++) {
			if (boxes[i] == false) {
				boxes[i] = true;
				QueenPermutation(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i);
				boxes[i] = false;
			}
		}
	}
	
	public static void QueenCombination(boolean boxes[], int qpsf, int tq, String ans, int lastBoxUsed) {

		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}

		for (int i = lastBoxUsed + 1; i < boxes.length; i++) {
			boxes[i] = true;
			QueenCombination(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i, i);
			boxes[i] = false;
		}
	}
	
	public static void CoinChange(int denom[], int amount, String ans, int lastdenomUsed) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = lastdenomUsed; i < denom.length; i++) {
			if (amount >= denom[i]) {
				CoinChange(denom, amount - denom[i], ans + denom[i], i);
			}
		}
	}

	public static void CoinChangeP(int denom[], int amount, String ans) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < denom.length; i++) {
			if (amount >= denom[i]) {
				CoinChangeP(denom, amount - denom[i], ans + denom[i]);
			}
		}
	}

	public static void QueenCombinationBoxRespect(boolean[] board, int col, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board.length) {
			return;
		}

		// place
		board[col] = true;
		QueenCombinationBoxRespect(board, col + 1, tq, qpsf + 1, ans + " b" + col);
		board[col] = false;

		// not place
		QueenCombinationBoxRespect(board, col + 1, tq, qpsf, ans);
	}

	public static void coinChange(int[] denom, int idx, int amount, String ans) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		if (idx == denom.length || amount < 0) {
			return;
		}

		// exclude
		coinChange(denom, idx + 1, amount, ans);
		// include
		coinChange(denom, idx, amount - denom[idx], ans + denom[idx]);

	}

	public static void QueenCombinationBoxRespect2D(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board[0].length) {
			row++;
			col = 0;
		}

		if (row == board.length) {
			return;
		}

		// place
		board[row][col] = true;
		QueenCombinationBoxRespect2D(board, row, col + 1, tq, qpsf + 1, ans + "[" + row + "-" + col + "]");
		board[row][col] = false;

		// not place
		QueenCombinationBoxRespect2D(board, row, col + 1, tq, qpsf, ans);
	}

	static int count = 0;

	public static void NQueen(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			System.out.println(++count + " : " + ans);
			return;
		}

		if (col == board[0].length) {
			row++;
			col = 0;
		}

		if (row == board.length) {
			return;
		}

		// place
		// if (isItSafeToPlaceQueen(board, row, col)) {
		if (isItSafeToPlaceKnight(board, row, col)) {
			board[row][col] = true;
			NQueen(board, row, col + 1, tq, qpsf + 1, ans + "[" + row + "-" + col + "]");
			board[row][col] = false;
		}

		// not place
		NQueen(board, row, col + 1, tq, qpsf, ans);
	}

	public static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col) {

		// vertically up
		int r = row - 1;
		int c = col;

		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}

		// horizontally left
		r = row;
		c = col - 1;

		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}
			c--;
		}

		// diagonally left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		// diagonally right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		return true;

	}

	public static boolean isItSafeToPlaceKnight(boolean[][] board, int row, int col) {

		int[] rowArr = { -1, -2, -2, -1 };
		int[] colArr = { 2, 1, -1, -2 };

		for (int i = 0; i < rowArr.length; i++) {

			int nr = row + rowArr[i];
			int nc = col + colArr[i];

			if (nr >= 0 && nr < board.length && nc >= 0 && nc < board[0].length) {

				if (board[nr][nc]) {
					return false;
				}
			}

		}

		return true;

	}

	public static void NQueen2(boolean[][] board, int row, String ans) {

		if (row == board.length) {
			System.out.println(++count + " " + ans);
			return;
		}

		for (int col = 0; col < board[0].length; col++) {

			if (isItSafeToPlaceQueen(board, row, col)) {
				board[row][col] = true;
				NQueen2(board, row + 1, ans + "[" + row + "-" + col + "] ");
				board[row][col] = false;
			}
		}

	}

	public static void blockedMaze(char[][] board, int row, int col, String ans, boolean[][] visited) {

		if (row == board.length - 1 && col == board[0].length - 1) {
			System.out.println(ans);
			return;
		}

		if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] == 'x'
				|| visited[row][col]) {
			return;
		}

		visited[row][col] = true;

		blockedMaze(board, row - 1, col, ans + "T", visited);
		blockedMaze(board, row, col - 1, ans + "L", visited);
		blockedMaze(board, row + 1, col, ans + "D", visited);
		blockedMaze(board, row, col + 1, ans + "R", visited);

		visited[row][col] = false;
	}

}
