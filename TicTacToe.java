/*
/ MacchiaroliM
/ CS2
/ Jan 30 2018
/ Tic Tac Toe Main Class
*/
import java.util.Scanner;

public class TicTacToe
{
	public static void main (String [] args)
	{
		Board b = new Board();//For Testing Purposes To Be Added
		b.makeMove('X', 1, 0);//
		b.makeMove('X', 2, 1);//
		b.makeMove('X', 2, 2);//
		System.out.println(b);//
		System.out.println(b.gameWon());//
	}
}