package day02;
import java.util.*;

public class TestStringBuilder {
	public static void main(String[] args ){
		StringBuilder builder = new StringBuilder();
		builder.append("Hello world");
		builder.insert(4, "!");
		builder.replace(1, 1, "ok");
		System.out.println(builder.toString());
	}
}
