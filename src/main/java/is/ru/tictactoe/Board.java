package is.ru.tictactoe;
import java.util.Scanner;


public class Board
{
	public static char board[][];

	public Board()
	{
		board = new char[4][4];	
	}


	/*public static int mode(String num)
	{
		System.out.println("**********************");
		
		System.out.println("     "+"Tic Tac Toe");
		
		System.out.println("**********************");
		
		System.out.println("For one player mode enter: 1");
		
		System.out.println("For two player mode enter: 2");
		
		int mode = Integer.parseInt(num);
		
		return mode;
	}*/


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

    // Checks if the board is full. If it full 2 is returned else 0 is returned
	public static int isBoardFull()
	{
		for(int i = 1; i < 4; i++)
		{
			for(int j = 1; j < 4; j++)
			{
				if(board[i][j] == '-')
				{
					return 0;
				}
			}
		}
		return 2;
	}

	//Prints the contents of the board
    public void PrintTheBoard()
	{
		
		System.out.println("        "+"_______");
		
		for(int i = 1; i < 4; i ++)
		{
			System.out.print("        "+"|");
			
			for(int j = 1; j < 4; j++)
			{
				System.out.print(board[i][j] + "|");
				
			}
			System.out.println();
		}
		
		System.out.println("        "+"_______");

	}
}