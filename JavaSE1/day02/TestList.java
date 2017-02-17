package day02;

import java.util.*;

public class TestList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList listb = new ArrayList();
		list.add(1);
		list.add(2);
		list.add("OK");
		listb.add(4);
		listb.add(2);
		list.removeAll(listb);
		System.out.println(list);
	}
}