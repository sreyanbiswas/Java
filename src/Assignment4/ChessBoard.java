import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = chess_board(0,0,n,n);
        
        chess_board(0,0,n,n,"");
        System.out.println();
        System.out.println(ans);
    }
    public static void chess_board(int cr, int cc, int er, int ec, String ans) {

		if (cr == er - 1 && cc == ec - 1) {
			System.out.print(ans + "{" + cr + "-" + cc + "} ");
			return;
		}

		if (cr >= er || cc >= ec) {
			return;
		}

		chess_board(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
		chess_board(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");

		if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {

			for (int moves = 1; moves < ec; moves++)

				chess_board(cr, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}R");

			for (int moves = 1; moves < er; moves++)

				chess_board(cr + moves, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");

		}

		// Bishop

		if (cr == cc || cr + cc == er - 1) {

			for (int moves = 1; moves < er; moves++) {

				chess_board(cr + moves, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}B");

			}

		}

	}

	public static int chess_board(int cr, int cc, int er, int ec) {

		if (cr == er - 1 && cc == ec - 1) {
			return 1;
		}

		if (cr >= er || cc >= ec) {
			return 0;
		}

		int cnt = 0;
		cnt += chess_board(cr + 2, cc + 1, er, ec);
		cnt += chess_board(cr + 1, cc + 2, er, ec);

		if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {
			for (int moves = 1; moves < ec; moves++)
				cnt += chess_board(cr, cc + moves, er, ec);

			for (int moves = 1; moves < er; moves++)
				cnt += chess_board(cr + moves, cc, er, ec);

		}

		if (cr == cc || (cr + cc == er - 1)) {
			for (int moves = 1; moves < er; moves++) {
				cnt += chess_board(cr + moves, cc + moves, er, ec);

			}

		}

		return cnt;
	}
}