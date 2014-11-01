package is.ru.tictactoe;
import java.util.Scanner;

public class GameLogic 
{
	//Accepts a variable that is either X or O, to check if that player has won.
	public static int winConditions(char x_or_o)
	{
		if(Board.board[1][1] == x_or_o && Board.board[1][2] == x_or_o && Board.board[1][3] == x_or_o) //row 1 H
		{
			return 1;
		}
		else if(Board.board[2][1] == x_or_o && Board.board[2][2] == x_or_o && Board.board[2][3] == x_or_o) //row2 H
		{
			return 1;
		}
		else if(Board.board[3][1] == x_or_o && Board.board[3][2] == x_or_o && Board.board[3][3] == x_or_o) //row 3 H
		{
			return 1;
		}
		else if(Board.board[1][1] == x_or_o && Board.board[2][1] == x_or_o && Board.board[3][1] == x_or_o) //column 1 D
		{
			return 1;
		}
		else if(Board.board[1][2] == x_or_o && Board.board[2][2] == x_or_o && Board.board[3][2] == x_or_o) //column 2 D
		{
			return 1;
		}
		else if(Board.board[1][3] == x_or_o && Board.board[2][3] == x_or_o && Board.board[3][3] == x_or_o) //column 3 D
		{
			return 1;
		}
		else if(Board.board[1][1] == x_or_o && Board.board[2][2] == x_or_o && Board.board[3][3] == x_or_o) //cross D R
		{
			return 1;
		}
		else if(Board.board[3][1] == x_or_o && Board.board[2][2] == x_or_o && Board.board[1][3] == x_or_o) //cross U R
		{
			return 1;
		}
		return 0;
	}

	//Inserts the symbol in the correct slot,returns 0 if insertion was a success. 
	//Returns 1 if there is X or O, already in the slot.
	//Finally returns 2 if the slots are all full
	public static int placeMarker(int tala1, int tala2, int player)
    {

    	if(Board.board[tala1][tala2] == 'X' || Board.board[tala1][tala2] == 'O')
    	{
    		System.out.println("Please choose another number");
    		return 1;
    	}
    	else if(player == 1)
    	{
    		Board.board[tala1][tala2] = 'X';
    	}
    	else if(player == 2)
    	{
    		Board.board[tala1][tala2] = 'O';
    		
    	}

    	if (Board.isBoardFull() == 2)
    	{
    		return 2;
    	}
    	return 0;
    }
}