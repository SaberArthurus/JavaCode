package day01;
import java.util.*;

public class DemoException {
	public static void main(String[] args) {
		try{
			String info = "Hello";
			System.out.println("THe 10th character is: " + info.charAt(9));
			System.out.println("Length:" + info.length());
			
		} catch (NullPointerException e) {
			System.out.println("This string is null");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("This is string is short");
		} catch (Exception e) {
			System.out.println("Catch unknown error");
		}
	}
}