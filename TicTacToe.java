/*
/ MacchiaroliM
/ CS2
/ Feb 06 2018
/ Tic Tac Toe Main Class
*/
import java.util.Scanner;

public class TicTacToe
{
	public static void main (String [] args)
	{
		System.out.println("Tic - Tac - Toe");
		System.out.println("Version 1.2");
		System.out.println("================");
		int row;
		int col;
		int turn = 0;
		boolean won = false;
		char piece = 'X';
		Board b = new Board();//create Board
		Scanner input = new Scanner(System.in);
		do{
			System.out.print("Please enter the desired Row for " + piece + " (1-3): ");
			row = input.nextInt()-1;
			System.out.print("Please enter the desired Column for " + piece + " (1-3): ");
			col = input.nextInt()-1;
			if((b.isValidMove(row, col) == true)&&(b.isEmpty(row, col))) {
				b.makeMove(piece, row, col);
				System.out.println(b);
				if(piece == 'X') {
					piece = 'O';
				}else {
					piece = 'X';
				}
				won = b.gameWon();
				turn++;
			}else if(b.isValidMove(row, col) == false) {
				System.out.println("Move Not Valid.");
			}else {
				System.out.println("Selected space is already taken.");
			}
		}while((won == false)&&(turn<9));
		if(won == true) {
			if(piece == 'X') {
				piece = 'O';
			}else {
				piece = 'X';
			}
			System.out.println("###################");
			System.out.println("# CONGRATULATIONS #");
			System.out.println("# Player: " + piece +"       #");
			System.out.println("# Won in: " + turn-- +" turns #");
			System.out.println("###################");
		}else {
			System.out.println("########################################");
			System.out.println("# WINNER: NONE                         #");
			System.out.println("# Strange Game,                        #");
			System.out.println("# The only winning move is not to play #");
			System.out.println("########################################");
		}
	}
}