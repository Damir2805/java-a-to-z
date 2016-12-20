package dkalymbaev;

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
	public void calcTriangleArea {
		Point point = new Point1(0, 0);
		Point point = new Point2(0, 4);
		Point point = new Point3(3, 0);
		Triangle triangle = new Triangle(Point1, Point2, Point3);
		assertThat(Triangle.area(), closeTo(6, error));
	}
}