package be.ac.umons.odl;

public class Rectangle extends ConvexPolygon {
	public Rectangle(Point a, Point b) {
		super(
			new Point[]{a, new Point(a.getX(), b.getY()), b, new Point(b.getX(), a.getY())});
	}

	public int perimeter(Point A, Point B) {
		return 2*(Math.abs(A.getX()-B.getX()))+2*Math.abs(A.getY()-B.getY());
	}

	public int area(Point A, Point B) {
		return Math.abs(A.getX()-B.getX())*Math.abs(A.getY()-B.getY());
	}
}
