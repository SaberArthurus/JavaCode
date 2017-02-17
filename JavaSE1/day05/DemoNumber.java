package day05;
import java.text.DecimalFormat;
import java.util.*;

public class DemoNumber {
	public static void main(String[] args) 
		throws Exception {
			String s = "5.6%";
			DecimalFormat fmt = new DecimalFormat("0.##%");
			double d = fmt.parse(s).doubleValue();
			System.out.println(d);

			double x = 0.0755555;
			System.out.println(fmt.format(x));
		}
}