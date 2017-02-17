package day02;
import java.util.*;

public class DemoInteger {
	public static void main(String[] args) {
		DemoInteger demo = new DemoInteger();
		Integer i = new Integer(1);
		int a = i.intValue();
		Double d = Double.valueOf(2.2);
		String numStr = "124";
		int num = Integer.parseInt(numStr);
		say(num);
	}
	public static void say(Object obj) {
		System.out.println(obj);
	}
}