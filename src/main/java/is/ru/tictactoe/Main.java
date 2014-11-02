package is.ru.tictactoe;
import java.util.Scanner;

import java.util.Scanner;

public class Main
{
 public static void main (String[] args) throws Exception
 {
  Scanner sc = new Scanner(System.in);
  Board b = new Board();
  int player = 1;
  int test = 0;
 
  //char board[][] = b.clearBoard();
  b.clearBoard();
  b.PrintTheBoard();
  
  while(GameLogic.winConditions('X') != 1 && GameLogic.winConditions('O') != 1 && test != 2)
  {
    int x = 0;
	  int y = 0;
   System.out.println("Input A Number Between 1-3");
   while (x == 0){
		System.out.println("Player " + player + " Input a row number");
    x = GameLogic.inputNumber(sc);
   }
   while(y == 0){
	   System.out.println("Player " + player + " Input a column number");
    y = GameLogic.inputNumber(sc);
   }
       if(player == 1)
       {
       	test = GameLogic.placeMarker(x,y,1);
        if (test == 0){
        	
        player = 2;
        /*GameLogic.placeMarker(x,y,1);
        player = 2;*/
    	}
       }
       else
       {
       	test = GameLogic.placeMarker(x,y,2);
        if (test == 0){
            player = 1;
        /*GameLogic.placeMarker(x,y,2);
        player = 1;*/
    	}
       }
     b.PrintTheBoard();
  }

  if(GameLogic.winConditions('X') == 1)
  {
   System.out.println("Player one won");
  }
  else if(GameLogic.winConditions('O') == 1)
  {
   System.out.println("Player two won");
  }
  else
  {
   System.out.println("It's a TIE!");
  }
 }
}