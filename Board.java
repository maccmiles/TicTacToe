/*
/ MacchiaroliM
/ CS2
/ Jan 30 2018
/ Tic Tac Toe Board class
*/

public class Board
{
	public static final int SIZE = 3;
	private char board [][] = new char[SIZE][SIZE]; 

	public Board()
	{	
		for (int r=0; r<SIZE; r++) {//fill with spaces
			for (int c=0; c<SIZE; c++) {
				board[r][c] = ' ';
			}
		}
	}
	
	public String toString()
	{
		String ans = "";
		for(int r=0; r<SIZE; r++) {
			ans = ans + "|";//begin
			for (int c=0; c<SIZE; c++) {
				ans = ans + board[r][c]; //Build one line of string
			}
			ans = ans + "|\n";//new line
		}
		return ans;
	}

	public void makeMove (char c, int row, int col)
	{
		board[row][col] = c;
	}

	public boolean isEmpty (int row, int col)
	{
		if(board[row][col] == ' ') {
		return true;
		}
		else {
			return false;
		}
	}

	public boolean isValidMove (int row, int col)
	{
		if(((row >= 0)&&(col >= 0))&&((row <= SIZE)&&(col <= SIZE))) {
		return true;
		}else {
			return false;
		}
	}

	public boolean gameWon()
	{
		for(int r=0; r<SIZE; r++) {//Check Rows
				if((board[r][0] != ' ')&&(board[r][0] == board[r][1])&&(board[r][0] == board[r][2])) {//Check if row is same
					return true;
					}
				if((board[0][r] != ' ')&&(board[0][r] == board[1][r])&&(board[0][r] == board[2][r])) {//Check if col same
					return true;
					}
				if(((board[0][0] != ' ')&&(board[0][0] == board[1][1])&&(board[0][0] == board[2][2]))||((board[2][0] != ' ')&&(board[0][2] == board[1][1])&&(board[0][2] == board[2][0]))) {//Check if cross win
					return true;
					}
				}
		return false;
		
	}
}