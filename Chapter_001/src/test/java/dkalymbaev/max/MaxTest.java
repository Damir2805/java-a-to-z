package dkalymbaev.triangle;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
* Testing of the maximal value of two or three digits.
*/

public class MaxTest {
	/**
	* defying numbers.
	*/
	int first = 5;
	int second = 8;
	@Test
	public int max(first, second) {
		assertThat(max(first, second) is(8));
	}
	/**
	* defying numbers.
	*/
	int first = 5;
	int second = 8;
	int third = 4;
	@Test
	public int max(first, second, third) {
		assertThat(max(max(first, second), third) is(8));
	}
}