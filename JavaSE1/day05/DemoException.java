package day05;
import java.util.*;


public class DemoException {
	public static void main(String[] args) 
		throws Exception{
			UserManager mgr = new UserManager();
			Scanner s = new Scanner(System.in);
			while (true) {
				try {
					System.out.println("1 Registered 2 Login :");
					String cmd = s.nextLine();
					if ("1".equals(cmd)) {
						System.out.print("email:");
						String email = s.nextLine();
						System.out.print("pwd:");
						String pwd = s.nextLine();
						User u = mgr.reg(email, pwd);
						System.out.println("Registered Success " + u);
					} else if ("2".euqlas(cmd)) {
						System.out.print("email:");
						String email = s.nextLine();
						System.out.print("pwd:");
						String pwd = s.nextLine();
						User u = mgr.login(email, pwd);
						System.out.println("Registered Login " + u);
					}else {
						System.out.println("Unknow Opcode");
					}
				} catch (UserExistException e) {
					e.printStackTrace();
				} catch (EmailOrPwdException e) {
					e.printStackTrace();
				}
			}
	}
}

class User{
	int id;
	String email;
	String pwd;
	public User() {}
	public User(int id, String email, String pwd) {
		this.id = id;
		this.email = email;
		this.pwd = pwd;
	}
	public String toString() {
		return id +  "," + "email";
	}
	public boolean equals(Object obj) {
		if (obj == null){
			return false;
		}
		if (this == obj)
			return true;
		if (obj instanceof User) {
			User o = (User) obj;
			return id == o.id;
		}
		return false;
	}
	public int hashCode() {return id;}
}


class UserManager {
	private Map<String, User> users =
								new HashMap<String, User>();
	private int id = 1;
	public User reg(String email, String pwd)
		throws UserExistException {
		if (users.containsKey(email)) {
			throw new UserExistException("hava registered " + email);
		}
		User newguy = new User(id++, email, pwd);
		users.put(email, newguy);
		return newguy;
	}
	public User login(String email, String pwd)
		throws EmailOrPwdException {
		if (! users.containsKey(email)) {
			throw new EmailOrPwdException("No this User");
		}
		User u = users.get(email);
		if (!u.pwd.equals(pwd)) {
			throw new EmailOrPwdException("Wrong passward");
		}
		return u;
	}
}

class UserExistException 
	extends Exception {
		public UserExistException(String message) {
			super(message);
		}

}

class EmailOrPwdException 
	extends Exception {
		public EmailOrPwdException(String message) {
			super(message);
		}
}

