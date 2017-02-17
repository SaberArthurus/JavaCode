package day04;

/*
	Queue API
	  offer
	  poll
	  peek
*/
import java.util.*;
public class DemoQueue {
	public static void main(String[] args) {
		Queue<String> queue  = new LinkedList<String>();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		System.out.println(queue);
		String element = null;
		while ((element = queue.peek()) != null) {
			System.out.println(element);
			break;
		}
	}
}