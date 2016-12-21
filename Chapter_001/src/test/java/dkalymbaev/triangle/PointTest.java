package dkalymbaev.triangle;

import org.junit.Test;
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
	final Space12 = point1.distanceTo(point2);
	@Test
	public void distsnceToTest() {
		assertThat(Space12, is(4d));
	}
}