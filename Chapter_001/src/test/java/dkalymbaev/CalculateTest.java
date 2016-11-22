package dkalymbaev;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;

/**
 * Test.
 */

public class CalculateTest {
	/**
	 * test add.
	 * @return result of testing.
	 */
	public viod whenExecuteMainThenPrintToConsole() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Calculate.main(null);
		assetThat(out.toString(), is("Hello World!\r\n"));
	}
}