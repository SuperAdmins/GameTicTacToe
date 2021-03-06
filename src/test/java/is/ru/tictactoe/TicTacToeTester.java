package is.ru.tictactoe;
import org.junit.Test;
import java.util.Scanner;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

public class TicTacToeTester{

	public static void main(String[] args) 
    {
		org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTester");

	}

    //Clears the board and inserts "-" in all slots
    @Test 
    public void TestClearBoard()
    {
        Board b = new Board();
        
        char board [][] = b.clearBoard();
        char tmp = '-';
        assertEquals(tmp,board[1][1]);//(Column, Row)
        assertEquals(tmp,board[1][2]);
        assertEquals(tmp,board[1][3]);
        assertEquals(tmp,board[2][1]);
        assertEquals(tmp,board[2][2]);
        assertEquals(tmp,board[2][3]);
        assertEquals(tmp,board[3][1]);
        assertEquals(tmp,board[3][2]);
        assertEquals(tmp,board[3][3]);        
    }

    //Tests the placeMarker function by inserting X or O into slots.
    //0 if the slot was empty and
    //1 if the slot was already occupied
    @Test
    public void TestplaceMarker()
    {
        Board b = new Board();
	//comment
        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,1,1)); //(Column, Row, Player)
        assertEquals(1,GameLogic.placeMarker(1,1,1));
        assertEquals(1,GameLogic.placeMarker(1,1,2));
        assertEquals(0,GameLogic.placeMarker(1,2,2));
        assertEquals(1,GameLogic.placeMarker(1,2,1));
        assertEquals(0,GameLogic.placeMarker(1,3,1));

    }

    //
    @Test 
    public void testisBoardFull()
    {
        Board b = new Board();
        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,1,1)); //(Column, Row, Player)
        assertEquals(0,GameLogic.placeMarker(1,2,2));
        assertEquals(0,GameLogic.placeMarker(1,3,1));
        assertEquals(0,GameLogic.placeMarker(2,1,2));
        assertEquals(0,GameLogic.placeMarker(2,2,1));
        assertEquals(0,GameLogic.placeMarker(2,3,2));
        assertEquals(0,GameLogic.placeMarker(3,1,2));
        assertEquals(0,GameLogic.placeMarker(3,2,1));
        assertEquals(2,GameLogic.placeMarker(3,3,2));
    }

    @Test
    public void testwinConditions()
    {
        Board b = new Board();
        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,1,1));
        assertEquals(0,GameLogic.placeMarker(1,2,1));
        assertEquals(0,GameLogic.placeMarker(1,3,1));
        assertEquals(1,GameLogic.winConditions('X'));//Row 1 player 1

        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,1,2));
        assertEquals(0,GameLogic.placeMarker(1,2,2));
        assertEquals(0,GameLogic.placeMarker(1,3,2));
        assertEquals(1,GameLogic.winConditions('O'));//Row 2 player 2
      
        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(2,1,1));
        assertEquals(0,GameLogic.placeMarker(2,2,1));
        assertEquals(0,GameLogic.placeMarker(2,3,1));
        assertEquals(1,GameLogic.winConditions('X'));//Row 2 player 1

        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(2,1,2));
        assertEquals(0,GameLogic.placeMarker(2,2,2));
        assertEquals(0,GameLogic.placeMarker(2,3,2));
        assertEquals(1,GameLogic.winConditions('O'));//Row 2 player 2
      
        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(3,1,1));
        assertEquals(0,GameLogic.placeMarker(3,2,1));
        assertEquals(0,GameLogic.placeMarker(3,3,1));
        assertEquals(1,GameLogic.winConditions('X'));//Row 3 player 1

        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(3,1,2));
        assertEquals(0,GameLogic.placeMarker(3,2,2));
        assertEquals(0,GameLogic.placeMarker(3,3,2));
        assertEquals(1,GameLogic.winConditions('O'));//Row 3 player 2

        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,1,1));
        assertEquals(0,GameLogic.placeMarker(2,1,1));
        assertEquals(0,GameLogic.placeMarker(3,1,1));
        assertEquals(1,GameLogic.winConditions('X'));//Column 1 player 1
      
        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,1,2));
        assertEquals(0,GameLogic.placeMarker(2,1,2));
        assertEquals(0,GameLogic.placeMarker(3,1,2));
        assertEquals(1,GameLogic.winConditions('O'));//Column 1 player 2
      
        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,2,1));
        assertEquals(0,GameLogic.placeMarker(2,2,1));
        assertEquals(0,GameLogic.placeMarker(3,2,1));
        assertEquals(1,GameLogic.winConditions('X'));//Column 2 player 1
      
        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,2,2));
        assertEquals(0,GameLogic.placeMarker(2,2,2));
        assertEquals(0,GameLogic.placeMarker(3,2,2));
        assertEquals(1,GameLogic.winConditions('O'));//Column 2 player 2
      
        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,3,1));
        assertEquals(0,GameLogic.placeMarker(2,3,1));
        assertEquals(0,GameLogic.placeMarker(3,3,1));
        assertEquals(1,GameLogic.winConditions('X'));//Column 3 player 1
      
        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,3,2));
        assertEquals(0,GameLogic.placeMarker(2,3,2));
        assertEquals(0,GameLogic.placeMarker(3,3,2));
        assertEquals(1,GameLogic.winConditions('O'));//Column 3 player 2

        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,1,1));
        assertEquals(0,GameLogic.placeMarker(2,2,1));
        assertEquals(0,GameLogic.placeMarker(3,3,1));
        assertEquals(1,GameLogic.winConditions('X'));//Cross Top left -> bottom right player 1
      
        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,1,2));
        assertEquals(0,GameLogic.placeMarker(2,2,2));
        assertEquals(0,GameLogic.placeMarker(3,3,2));
        assertEquals(1,GameLogic.winConditions('O'));//Cross Top left -> bottom right player 2
      
        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,3,1));
        assertEquals(0,GameLogic.placeMarker(2,2,1));
        assertEquals(0,GameLogic.winConditions('X'));
        assertEquals(0,GameLogic.placeMarker(3,1,1));
        assertEquals(1,GameLogic.winConditions('X'));//Cross Top right -> bottom left player 1
      
        b.clearBoard();
        assertEquals(0,GameLogic.placeMarker(1,3,2));
        assertEquals(0,GameLogic.placeMarker(2,2,2));
        assertEquals(0,GameLogic.winConditions('O'));
        assertEquals(0,GameLogic.placeMarker(3,1,2));
        assertEquals(1,GameLogic.winConditions('O'));//Cross Top right -> bottom left player 2

        
    }

    @Test
    public void testinputNumber()
    {
        String input = "3 2 1 -4 z % 5";
        Scanner s = new Scanner(input);
        assertEquals(3,s.nextInt());
        assertEquals(2,GameLogic.inputNumber(s));
        assertEquals(1,GameLogic.inputNumber(s));
        assertEquals(0,GameLogic.inputNumber(s));
        assertEquals(0,GameLogic.inputNumber(s));
        assertEquals(0,GameLogic.inputNumber(s));
        assertEquals(0,GameLogic.inputNumber(s));
    }

}
