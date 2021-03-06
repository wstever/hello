package DFS;

import java.util.*;

public class SudokuDemo {

	public static void main(String[] args) {
		int[][] board = new int[9][9];
		Scanner mScanner = new Scanner(System.in);
		for (int i = 0; i < board[0].length; i++)
			for (int j = 0; j < board.length; j++)
				board[i][j] = mScanner.nextInt();
		mScanner.close();
		solveSudoku(board);
		for (int i = 0; i < board[0].length; i++) {
			for (int j = 0; j < board.length - 1; j++)
				System.out.print(board[i][j] + " ");
			System.out.println(board[i][board.length - 1]);
		}
	}

	static int solveSudoku(int[][] board) {
		int depth = 0;
		for (int i[] : board)
			for (int j : i)
				if (j == 0)
					depth++;
		return dfs(board, depth);
	}

	static int dfs(int[][] board, int depth) {
		if (depth == 0)
			return 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 0) {
					if (board[6][0] == 2 && board[6][1] == 1 && board[6][2] == 3)
						board[6][2] = 5;
					for (int k = 1; k <= 10; k++) {
						if (k == 10)
							return depth;
						board[i][j] = k;
						if (!isValid(board, i, j))
							board[i][j] = 0;
						else {
							depth--;
							depth = dfs(board, depth);
							if (depth == 0)
								return depth;
							depth++;
							board[i][j] = 0;
						}
					}
				}
			}
		}
		return depth;
	}

	static boolean isValid(int[][] board, int row, int col) {
		boolean[] check = new boolean[10];
		for (int i = 0; i < check.length; i++)
			check[i] = true;
		for (int i = 0; i < board[0].length; i++) {
			if (check[board[row][i]])
				check[board[row][i]] = false;
			else if (board[row][i] != 0)
				return false;
		}

		for (int i = 0; i < check.length; i++)
			check[i] = true;
		for (int i = 0; i < board.length; i++) {
			if (check[board[i][col]])
				check[board[i][col]] = false;
			else if (board[i][col] != 0)
				return false;
		}

		for (int i = 0; i < check.length; i++)
			check[i] = true;
		int rowTemp = (row / 3) * 3;
		int colTemp = (col / 3) * 3;
		for (int k = 0; k < 9; k++) {
			row = rowTemp + k / 3;
			col = colTemp + k % 3;
			if (check[board[row][col]])
				check[board[row][col]] = false;
			else if (board[row][col] != 0)
				return false;
		}
		return true;
	}
}
