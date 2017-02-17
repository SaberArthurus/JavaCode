package day04;
import java.util.*;

public class DemoSet{
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String element = it.next();
			System.out.print(element + " ");
		}
	}
}