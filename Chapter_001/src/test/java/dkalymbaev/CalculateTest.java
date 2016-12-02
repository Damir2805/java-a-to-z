package dkalymbaev;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;


/**
 * Test.
 * @author Damir Kalymbaev.
 * @version $Id$.
 * @since 0.1.
 */

public class CalculateTest {
	/**
	 * test add.
	 */
	 class Test
	 public void whenExecuteMainThenPrintToConsole() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Calculate.main(null);
		assertThat(out.toString(), is("Hello World!\r\n"));
	}
}