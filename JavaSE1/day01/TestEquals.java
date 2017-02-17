package day01;

public class TestEquals {
	public static void main(String[] args) {
		Point p1 = new Point (1, 2);
		Point p2 = new Point (1, 2);
		if (p1.equals(p2)) {
			System.out.println("equals");
		}
	}
}