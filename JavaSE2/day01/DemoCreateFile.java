package day01;
import java.util.*;
import java.io.*;

public class DemoCreateFile {
	public static void main(String[] args) {
		File dir = new File(".");
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File file: files) {
				if (file.isFile()) {
					System.out.println("file:" + file.getName());
				}else {
					System.out.println("Dir:" + file.getName());
				}
			}
		}

	}
}