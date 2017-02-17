package day01;
import java.io.*;
import java.util.*;

public class DemoFileDir{
	public static void main(String[] args) {
		File dir = new File("." + File.separator + "demo");
		if (!dir.exists()) {
			try {
				dir.mkdir();
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Can't Create Dir");
			}
		}
	}
}
