package day05;
import java.text.SimpleDateFormat;
import java.util.*;

public class DemoDate{
	public static void main(String[] args) 
	throws Exception{
		String d = "2015-05-17";
		SimpleDateFormat fms = new SimpleDateFormat("yyyy-MM-dd");
		Date date = fms.parse(d);
		Date spec = SpecialDay(date, 3);
		String s = fms.format(spec);
		System.out.println("Date:" + s);
	}
	public static Date SpecialDay(Date proc, int exp) {
		Calendar cal = new GregorianCalendar();
		cal.setTime(proc);
		cal.add(Calendar.MONTH, exp);
		cal.add(Calendar.WEEK_OF_YEAR, -2);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		return cal.getTime();
	}
}