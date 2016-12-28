package dkalymbaev.triangle;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
* Testing of distance between two points.
*/

public class PointTest {
	/**
	* Defining two points
	*/
	final Point point1 = new Point(0, 1);
	final Point point2 = new Point(0, 5);
	@Test
	public void calcDistanceBetweenTwoPoints() {
		final double space = point1.distanceTo(point2);
		assertThat(space, is(4d));
	}
}