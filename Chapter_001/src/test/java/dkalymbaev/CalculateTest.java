package dkalymbaev;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test
*/

public class CalculateTest {
	/**
	* test add
	*/
	@Test
	public viod whenExecuteMainThenPrintToConsole() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Calculate.main(null);
		assetThat(out.toString(), is('Hello World!\r\n'));
		
	}
	
	
}