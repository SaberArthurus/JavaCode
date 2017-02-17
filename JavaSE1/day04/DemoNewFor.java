package day04;

import java.util.*;

public class DemoNewFor {
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < array.length; ++ i) {
			System.out.print(" " + array[i]);
		}
		for (int ele : array) {
			System.out.print(" " + ele);
		}
	}
}