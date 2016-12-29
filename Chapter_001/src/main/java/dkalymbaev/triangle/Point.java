package dkalymbaev.triangle;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
* Realises calculation of a distance between two points.
*/

public class Point {
	/**
	* This class defines point placement on area
	*/
	public double x;
	public double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double distanceTo(Point point) {
		/**
		* This method calculates a distance between two points.
		*/
		return Math.sqrt(Math.pow(point.y - this.y, 2) + Math.pow(point.x - this.x, 2));
	}
}