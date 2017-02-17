import java.util.*;

public class ShapeDemo{
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(new Point(1, 2), 10, 20);
		System.out.println("The area of rect is " + rect.area());
		System.out.println("The rect contains (11, 21) ? " + rect.contains(11, 21));
	}
}

class  Point{
	int x, y;
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double distance(int x, int y) {
		return Math.sqrt((this.x - x) * (this.x - x) + 
			(this.y - y) * (this.y - y));
	}
	public double distance() {
		return this.distance(0, 0);
	}
	public double distance(Point p) {
		return this.distance(p.x, p.y);
	}
}

abstract class Shape {
	protected Point location;
	public abstract boolean contains(int x, int y);
	public boolean conatins(Point p) {
		return this.contains(p.x, p.y);
	}
	public abstract double area();
}

class Rectangle extends Shape{
	private int w, h;
	public Rectangle() {}
	public Rectangle(Point location, int w, int h) {
		this.location = location;
		this.w = w;
		this.h = h;
	}
	public Rectangle(int x, int y, int w, int h) {
		this(new Point(x, y), w, h);
	}
	public double area() {
		return w * h;
	}
	public boolean contains(int x, int y) {
		int a = x - location.x;
		int b = y - location.y;
		return a >= 0 && b >= 0 && a <= w && b <= h;
	}
}