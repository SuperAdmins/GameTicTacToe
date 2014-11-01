package is.ru.tictactoe;

public class MainTest
{
	public static void main (String[] args) throws Exception
	{
	
		Board b = new Board();
		int numbPlayers = 1;
		boolean won = false;
	
		char board[][] = b.clearBoard();
		
		while(won != true)
		{
			int pmNumb = Board.placeMarker(1,1,1);
			pmNumb = Board.placeMarker(2,1,2);
			pmNumb = Board.placeMarker(1, 2, 1);
			pmNumb = Board.placeMarker(2, 2, 2);
			pmNumb = Board.placeMarker(1, 3, 2);
			won = true;
		}
		System.out.println("Player one won");
	}
	
}