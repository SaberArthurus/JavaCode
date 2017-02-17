import java.util.*;

public class Demo2{
	public static void main(String[] args) {
		Circle c = new Circle();
		c.p = new Point(1, 2);
		c.r = 10;
		System.out.println("area of circle is " + c.Area());
		System.out.println("Point x is in c ? " + c.contains(new Point(2, 2)));
		System.out.println("Point x is in c ? " + c.contains(2, 2));


	}
}

class Point{
	int x, y;
	Point(int a, int b) {
		x = a;
		y = b;
	}
}
class Circle{
	Point p;
	int r;
	double Area(){
		return Math.PI * r * r;
	}
	boolean contains(Point rhs) {
		return (rhs.x - p.x) * (rhs.x - p.x) + (rhs.y - p.y) * (rhs.y - p.y) <= r * r;
	}
	boolean contains(int x, int y) {
		return (x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) <= r * r;
	}
}

class Rectangle {
	Point p;
	int w, h;
	double Area() {
		return w * h;
	}
	boolean contains(Point rhs) {
		return rhs.x >= p.x && rhs.x <= p.x + w && rhs.y >= p.y && rhs.y <= p.x + h;
	}
	boolean contains(int x, int y) {
		return x >= p.x && x <= p.x + w && y >= p.y && y <= p.y + h;
	}

}