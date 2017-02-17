package day01;

public class MyArrayList{
	public static void main(String[] args) {
		ArrayList array = new ArrayList(20);
		int i;
		for (i = 0; i < 10; ++ i) {
			System.out.println("Add: " + array.add(new cat()));
			System.out.println("Size " + array.size());
		}
		cat ele = new cat();
		cat rhs = new cat();
		//System.out.println(ele.equlas(rhs));
		for (i = 0; i < 10; ++ i) {
			System.out.println("Remove: " + array.remove(new cat()));
			System.out.println("Size " + array.size());
		}

	}
}

class cat{
	int color;
	String name;
	cat() {
		color = 0;
		name = "cat";
	}
	public boolean equals(Object obj){
		if (obj == null)
			return false;
		if (obj instanceof cat) {
			cat other = (cat) obj;
			return other.color == color;
		}
		return false;
	}
}
class ArrayList{
	private int size;
	private Object[] elementData;
	public ArrayList(int number) {
		this.elementData = new Object[number];
	}
	public ArrayList() {
		this(10);
	}
	public boolean add(Object o) {
		elementData[size++] = o;
		return true;
	}
	public boolean remove(Object o) {
		int index = this.indexOf(o);
		if (index == -1) 
			return false;
		for (int i = index + 1; i < size; ++ i)
			elementData[i - 1] = elementData[i];
		elementData[--size] = null;
		return true;
	}
	public int size(){
		return size;
	}
	public int indexOf(Object o) {
		if (o == null) {
			for (int i = 0; i < size; ++ i)
			if (elementData[i] == null) 
				return i;
		}else {
			for (int i = 0; i < size; ++ i) {
			 	if (o.equals(elementData[i]))
			 		return i;
			}
		}

		return -1;
	}
}