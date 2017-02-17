import java.util.*;
public class Test02{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		Random rnd = new Random(n);
		int seed = rnd.nextInt(10);
		System.out.println(seed);
	}
}