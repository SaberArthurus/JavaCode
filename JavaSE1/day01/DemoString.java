package day01;
import java.util.*;

public class DemoString{
	public static void main(String[] args) {
		String info = "我爱中国";
		byte[] array = info.getBytes("UTF-8");
		System.out.println(Arrays.toString(array));
		System.out.println(info);
	}
}