package snake;
public class Node{
	private int i;
	private int j;
	public Node(){}
	public Node(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	public int getI(){ return i;}
	public int getJ(){ return j;}
	public void setI(int i) {this.i = i;}
	public void setJ(int j) {this.j = j;}
	public String toString() {
		return "[" + i + "," + j + "]";
	}
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Node) {
			Node o = (Node) obj;
			return this.i == o.i && this.j == o.j;
		}
		return false;

	}
	public int hashcode() {
		return (i << 16 | j);
	}

}