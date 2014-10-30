package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTester{

	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTester");

	}
	@Test
    public void testMain() {
        String str2 = "Hello World!!";

        assertEquals("Hello World!!",TicTacToe.printHello(str2));
    }
     /*@Test 
     public void testFail(){
     	assertEquals(1,2);
     }*/
}