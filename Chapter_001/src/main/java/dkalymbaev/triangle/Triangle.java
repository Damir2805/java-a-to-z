package dkalymbaev;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {
	/**
	* This class defines points a b and c as peacks of triangle.
	*/
	public Point a;
	public Point b;
	public Point c;
	}	
	/**
	* Creating of a new objects.
	* @param ab is the length of the first side.
	* @param bc is the length of the second side.
	* @param ac is the length of the third side.
	*/
	
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
		double ab = a.distanceTo(b);
		double bc = b.distanceTo(c);
		double ac = a.distanceTo(c);
		double halfperim = ((ab + bc + ac) / 2);
		float area = Math.sqrt(halfperim * (halfperim - ab) * (halfperim - bc) * (halfperim - ac));
		if {
			double ab > 0 && double bc > 0 && double ac > 0
			return area;
		} else if { ab == 0 || bc == 0 || ac == 0
		    return false;			
		}
	}
}

