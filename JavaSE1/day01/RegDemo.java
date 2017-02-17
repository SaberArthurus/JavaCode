
import java.util.*;
import java.util.regex.*;
public class RegDemo{
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		while (true) {
			System.out.printf("%nEnter your regex: ");
			Pattern pattern = Pattern.compile(scanner.nextLine());
			System.out.printf("Enter input string to search: ");
			Matcher matcher = pattern.matcher(scanner.nextLine());
			boolean found = false;
			while (matcher.find()) {
				System.out.printf("Found \"%s\" starting with index %d ending index %d.%n", 
					matcher.group(), matcher.start(), matcher.end());
				found = true;
			}
			if (!found) {
				System.out.printf("No match found. %n");
			}
		}
	}
}