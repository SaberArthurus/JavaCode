package day02;

import java.util.*;
import java.util.regex.*;

public class TestRegex {
	public static void main(String[] args) {
		String regStr = "[a-zA-Z_0-9]+@[a-zA-Z0-9]+(\\.com|\\.cn|\\.net)";
		Pattern pattern = Pattern.compile(regStr);
		String mailStr = "fanchuang@yahoo.com";
		Matcher matcher = pattern.matcher(mailStr);
		while (matcher.find()) {
			System.out.printf("%d %d%n", matcher.start(), matcher.end());
		}
		String info = "hello!world!java!";
		String[] array = info.split("!");
		System.out.println(Arrays.toString(array));
		info = "fajkdfjA192473593q4fakadfk423597";
		String str = info.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(str);
	}
}
