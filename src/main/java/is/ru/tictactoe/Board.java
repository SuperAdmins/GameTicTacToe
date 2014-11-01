package is.ru.tictactoe;
import java.util.Scanner;


public class Board
{
	private static char board[][];
	private static int counter;

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
    		return 1;
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

    	if (isBoardFull() == 2)
    	{
    		return 2;
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
		return 2;
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

	public static int winConditions(char x_or_o)
	{
		if(board[1][1] == x_or_o && board[1][2] == x_or_o && board[1][3] == x_or_o) //row 1 H
		{
			return 1;
		}
		else if(board[2][1] == x_or_o && board[2][2] == x_or_o && board[3][3] == x_or_o) //row2 H
		{
			return 1;
		}
		else if(board[3][1] == x_or_o && board[3][2] == x_or_o && board[3][3] == x_or_o) //row 3 H
		{
			return 1;
		}
		else if(board[1][1] == x_or_o && board[2][1] == x_or_o && board[3][1] == x_or_o) //column 1 D
		{
			return 1;
		}
		else if(board[1][2] == x_or_o && board[2][2] == x_or_o && board[3][2] == x_or_o) //column 2 D
		{
			return 1;
		}
		else if(board[1][3] == x_or_o && board[2][3] == x_or_o && board[3][3] == x_or_o) //column 3 D
		{
			return 1;
		}
		else if(board[1][1] == x_or_o && board[2][2] == x_or_o && board[3][3] == x_or_o) //cross D R
		{
			return 1;
		}
		else if(board[3][1] == x_or_o && board[2][2] == x_or_o && board[1][3] == x_or_o) //cross U R
		{
			return 1;
		}
		return 0;
	}
}