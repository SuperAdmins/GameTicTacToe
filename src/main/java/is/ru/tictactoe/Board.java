package is.ru.tictactoe;
import java.util.Scanner;


public class Board
{
	private static char board[][];
	private static int counter;

	public Board()
	{
		board = new char[4][4];	
		counter = 0;
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

	    public static int placeMarker(int tala1, int tala2, int player)
    {

    	if(board[tala1][tala2] == 'X' || board[tala1][tala2] == 'O')
    	{
    		return -1;
    	}
    	else if(player == 1)
    	{
    		board[tala1][tala2] = 'X';
    	}
    	else if(player == 2)
    	{
    		board[tala1][tala2] = 'O';
    		
    	}
		counter++;

    	if (counter == 9)
    	{
    		return -2;
    	}
    	return 0;
    }

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
		return -1;

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