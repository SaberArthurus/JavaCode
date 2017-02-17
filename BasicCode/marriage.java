import java.util.*;

public class marriage{
	public static void main(String[] args) {
		Person tong = new Person("Tong", 'W', 32);
		Person bai = new Person("Bai", 'M', 23);
		tong.marry(bai);
	}
}

class Person{
	String id;
	String	name = null;
	char	sex;
	int	age = 0;
	boolean	married = false;
	Person mate;
	Person(String name, char sex, int age) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	void marry(Person rhs) {
		this.mate = rhs;
		rhs.mate = this;
		this.married = rhs.married = true;
		System.out.println("Success");
	}
}