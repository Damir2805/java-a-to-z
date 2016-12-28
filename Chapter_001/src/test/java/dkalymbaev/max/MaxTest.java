package dkalymbaev.max;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.core.Is.is;
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
	public void max2() {
		Max max2 = new Max();
		assertThat(max2.max(first, second), is(8));
	}
    /**
	* defying numbers.
	*/
	int forth = 5;
	int fifth = 8;
	int third = 4;
	@Test
	public void max3() {
	Max max3 = new Max();
        assertThat(max3.max(max3.max(forth, fifth), third), is(8));
	}
}