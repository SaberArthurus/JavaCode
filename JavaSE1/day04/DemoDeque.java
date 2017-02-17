package day04;

import java.util.*;

/*
	stack
	Deque:w
		push
		pop
		peek
*/

public class DemoDeque {
	public static void main(String[] args) {
		Deque<String>  deque = new LinkedList<String>();
		deque.push("A");
		deque.push("B");
		deque.push("C");
		System.out.println(deque);
		System.out.println(deque.peek());
		String element = null;
		while ( (element = deque.peek()) != null ) {
			System.out.println(element);
			deque.pop();
		}
	}
}