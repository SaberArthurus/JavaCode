import java.util.*;

public class QuestionDemo{
	public static void main(String[] args) {
		String[] sa = {"A"};
		SingleChoice s = new SingleChoice("what is your name", sa);
		System.out.println("The SingleChoice check: " + s.check(0));
		String[] ma = {"A", "B"};
		MultiChoice m = new MultiChoice("what is your name", ma);
		int[] mar = {0, 2};
		System.out.println("The MultiChoice check: " + m.check(mar));
	}
}

class Question {
	String text;
	boolean check(int[] answers) {
		return true;
	}
}

class SingleChoice extends Question {
	String[] options;
	SingleChoice(String text, String[] options) {
		this.text = text;
		this.options = options;
	}
	boolean check(int answer){
		if (options.length != 1) 
			return false;
		if (options[0].charAt(0) - 'A' != answer) 
			return false;
		return true;
	}
}

class MultiChoice extends Question{
	String[] options;
	MultiChoice(String text, String[] options) {
		this.text = text;
		this.options = options;
	}
	boolean check(int[] answer) {
		if (options.length != answer.length) 
			return false;
		for (int i = 0; i < answer.length; ++ i) {
			if (answer[i] + 'A' != options[i].charAt(0)) 
				return false;
		}
		return true;
	}
}