import java.util.Scanner;

public class HelloWorld{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("input your name");
		String name = console.nextLine();
		System.out.print("HelloWorld " + name);
	}
}