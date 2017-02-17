import java.util.*;

public class TimeDemo{
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new MyTask(), 0, 1000 / 30);
	}
}

class MyTask extends TimerTask{
	private char[] chs = {'-', '\\', '|', '/'};
	private int i = 0;
	public void run() {
		System.out.println(chs[i++ % chs.length]);
	}
}
