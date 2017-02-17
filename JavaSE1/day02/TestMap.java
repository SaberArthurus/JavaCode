package day02;

import java.util.*;

public class TestMap {
	public static void main(String[] args) {
		HashMap users = new HashMap();

		users.put("Tom", new User("Tom", "123", 5));
		users.put("Jerry", new User("Jerry", "123", 6));
		users.put("Andy", new User("Andy", "456", 5));
		users.put("Andy", new User("Andy", "456", 7));
		System.out.println(users);

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("Users:");
			String name = s.nextLine();
			System.out.print("Passward:");
			String pwd = s.nextLine();
			if (!users.containsKey(name)) {
				System.out.println("No registeration");
				continue;
			}

			User user = (User)users.get(name);
			if (user.pwd.equals(pwd)) {
				System.out.println("Welcome "  + user.name + " age:" + user.age);
				break;
			}
		}
	}
}

class User {
	String name, pwd;
	int age;
	public User(String name, String pwd, int age) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}
	public String toString() {
		return name +  ":" + age;
	}
}