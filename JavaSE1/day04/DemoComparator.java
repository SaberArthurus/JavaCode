package day04;

import java.util.*;

public class DemoComparator {
	public static void main(String[] args) {
		Comparator c = new Comparator<Point>() {
			public int compare(Point o1, Point o2) {
				int r1 = o1.x * o1.x + o1.y * o1.y;
				int r2 = o2.x * o2.x + o2.y * o2.y;
				return r1 - r2;
			}
		};
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(1, 2));
		list.add(new Point(5, 3));
		list.add(new Point(2, 3));
		System.out.println(list);
		Collections.sort(list, c);
		System.out.println(list);
	}	
}

class Point {
	int x;
	int y;
	Point() {}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x +  "," + y + ")";
	}
}