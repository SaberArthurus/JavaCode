package day03;

import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		List list  = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			it.remove();
			System.out.println(element);
		}
		it = list.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			//it.remove();
			System.out.println(element);
		}
		System.out.println(list);
		System.out.println(it);
	}
}
/*
		list.add("One");
		list.add("Three");
		list.clear();
		// list.size();
		// list.isEmpty();
		// list.contains(p);
		// list.remove(p);
		// Object[] array = list.toArray();
*/