import java.util.*;
public class Test01{
	public static void main(String[] args) {
		char key = 'a';
		String str = "adhfgijkjgahgjkfabijgr";
		int [] arr = count(key, str);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] count(char key, String str){
		int [] count ={};
		for (int i = 0; i < str.length(); ++ i){
			char c = str.charAt(i);
			if (c == key) {
				count = Arrays.copyOf(count, count.length + 1);
			}	count[count.length - 1] = i;
		}
		return count;
	}
}