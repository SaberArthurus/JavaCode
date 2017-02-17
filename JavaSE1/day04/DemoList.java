package day04;

import java.util.*;

public class DemoList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; ++ i)
		if (i == 5)
			list.add(20);
		else list.add(i);

		System.out.println(list);
		List<Integer> sublist = list.subList(3, 8);
		System.out.println(sublist);
	}
}