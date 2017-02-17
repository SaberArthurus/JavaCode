package day01;
import java.util.*;
import java.io.*;

public class DemoDelFile {
	public static void main(String[] args) {
		File file = new File("data.dat");
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("Delete Success");
			}
		}
	}
}