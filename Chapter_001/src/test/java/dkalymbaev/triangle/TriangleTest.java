package dkalymbaev.triangle;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
* Created by Damir Kalymbaev.
*/

public class TriangleTest {
	/**
	* Testing of a method of calculation of a triangle's area
	*/
	@Test
	public void calcTriangleArea() {
		Point point1 = new Point(0, 0);
		Point point2 = new Point(0, 4);
		Point point3 = new Point(3, 0);
		Triangle triangle = new Triangle(point1, point2, point3);
		assertThat(triangle.area(), closeTo(6, 0.01));
	}
}