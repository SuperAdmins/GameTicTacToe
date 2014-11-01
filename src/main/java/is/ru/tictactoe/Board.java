package is.ru.tictactoe;
import java.util.Scanner;


public class Board
{
	private static char board[][];

	public Board()
	{
		board = new char[4][4];	
	}


public int mode()
	{
		System.out.println("**********************");
		
		System.out.println("     "+"Tic Tac Toe");
		
		System.out.println("**********************");
		
		System.out.println("For one player mode enter: 1");
		
		System.out.println("For two player mode enter: 2");
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		return num;
	}


	public char[][] clearBoard()
	{
		for(int i = 1; i < 4; i++)
		{
			for(int j = 1; j < 4; j++)
			{
				board[i][j] = '-';
			}
		}
		return board;
	}
}