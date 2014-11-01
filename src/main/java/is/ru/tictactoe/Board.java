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

	    public static int placeMarker(int tala1, int tala2, int player)
    {

    	if(board[tala1][tala2] == 'X' || board[tala1][tala2] == 'O')
    	{
    		return -1;
    	}
    	else if(player == 1)
    	{
    		board[tala1][tala2] = 'X';
    		return 0;
    	}
    	else if(player == 2)
    	{
    		board[tala1][tala2] = 'O';
    		return 0;
    	}

    	return 0;
    }

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