package day01;
import java.io.*;
import java.util.*;

public class DemoFile{
	public static void main(String[] args) {
		File file = new File("." + File.separator + "data.dat");
		if (!file.exists()) {
			try {
				file.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
				System.out.println("Can't Create FIle");
			}
		}
	}
}
