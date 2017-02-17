package day04;

import java.util.*;

public class DemoComparable{
	public static void main(String[] args) {
		List<ComparablePoint> list = 
								new ArrayList<ComparablePoint>();;
		list.add(new ComparablePoint(1, 5));
		list.add(new ComparablePoint(3, 4));
		list.add(new ComparablePoint(2, 2));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

class ComparablePoint implements Comparable<ComparablePoint> {
	private int x;
	private int y;
	ComparablePoint() {}
	ComparablePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int compareTo(ComparablePoint o) {
		int r = x * x + y * y;
		int other = o.x * o.x  + o.y * o.y;
		return r - other;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}