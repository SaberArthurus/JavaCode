package day01;

public class Point extends Object{
	private int x;
	private int y;

	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x=" + x + ",y=" + y;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point other = (Point)obj;
			if (this.x == other.x && this.y == other.y)
				return true;
		}
		return false;
	}

}