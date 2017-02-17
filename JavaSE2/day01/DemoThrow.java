package day01;
import java.text.*;
import java.util.*;

public class DemoThrow {
	public static void main(String[] args) {
		/*
		String result = getGirlFriend("GirlGod");
		System.out.println(result);
		*/
		try {
			Date today = StringToDate("2013-AA-20");
		}catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static String getGirlFriend(String name) {
		if ("Girl".equals(name))
			return "OK";
		else if ("S".equals(name))
			return "OK";
		else if ("T".equals(name))
			return "No";
		else throw new RuntimeException("Wrong choice");
	}

	public static Date StringToDate(String str) 
						throws ParseException{
		SimpleDateFormat format = 
						new SimpleDateFormat("yyyy-mm-dd");
		Date date = format.parse(str);
		return date;
	}
}