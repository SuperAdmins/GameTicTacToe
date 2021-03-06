package is.ru.tictactoe;
import java.util.Scanner;


public class Board
{
	public static char board[][];

	public Board()
	{
		board = new char[4][4];	
	}

	//Clears the board and inserts a "-" symbol in its place
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