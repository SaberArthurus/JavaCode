package day01;

import java.util.*;

public class DemoReadReg{
	public static void main(String[] args) {
		Point p = read();
		System.out.println(p);
	}
	public static Point read(){
		Scanner console = new Scanner(System.in);
		String rule = "\\d+,\\s*\\d+";
		while (true){
			System.out.print("Input:");
			String location = console.nextLine();
			if (location.matches(rule)) {
				return parse(location);
			}
			System.out.println("Not match rule");
		}
	}
	public static Point parse(String location){
		String[] data = location.split(",\\s*");
		int x = Integer.parseInt(data[0]);
		int y = Integer.parseInt(data[1]);
		return new Point(x, y);
	}
}


class Point {
	private int x;
	private int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point(){}
	public String toString() {
		return "(" + x +"," + y + ")";
	}
}