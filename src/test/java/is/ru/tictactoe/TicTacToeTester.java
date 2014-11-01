package is.ru.tictactoe;
//import static org.junit.Assert.assertEquals;
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
	
     
    @Test 
    public void TestClearBoard()
    {
        Board b = new Board();
        
        char board [][] = b.clearBoard();
        char tmp = '-';
        assertEquals(tmp,board[1][1]);
        assertEquals(tmp,board[1][2]);
        assertEquals(tmp,board[1][3]);
        assertEquals(tmp,board[2][1]);
        assertEquals(tmp,board[2][2]);
        assertEquals(tmp,board[2][3]);
        assertEquals(tmp,board[3][1]);
        assertEquals(tmp,board[3][2]);
        assertEquals(tmp,board[3][3]);        
    }

    @Test
    public void TestplaceMarker()
    {
        Board b = new Board();

        b.clearBoard();
        assertEquals(0,Board.placeMarker(1,1,1));
        assertEquals(-1,Board.placeMarker(1,1,1));
        assertEquals(-1,Board.placeMarker(1,1,2));
        assertEquals(0,Board.placeMarker(1,2,2));
        assertEquals(-1,Board.placeMarker(1,2,1));
        assertEquals(0,Board.placeMarker(1,3,1));

    }

    
}