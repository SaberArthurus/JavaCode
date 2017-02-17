package snake;
import java.util.LinkedList;

public class Worm {
	private LinkedList<Node> nodes = 
								new LinkedList<Node>();
	private int dir;
	public static final int UP = -10;
	public static final int DOWN = 10;
	public static final int LEFT = -1;
	public static final int RIGHT = 1;
	public Worm() {
		nodes.add(new Node(3, 9));
		nodes.add(new Node(4, 9));
		nodes.add(new Node(5, 9));
		nodes.add(new Node(5, 10));
		nodes.add(new Node(5, 11));
		nodes.add(new Node(6, 11));
		nodes.add(new Node(7, 11));
		dir = RIGHT;
	}
	public Worm(LinkedList<Node> nodes) {
		this.nodes.clear();
		this.nodes.addAll(nodes);
	}

	public void step() {
		Node head = nodes.getFirst();
		int i =head.getI() + dir / 10;
		int j = head.getJ() + dir % 10;
		head = new Node(i, j);
		nodes.addFirst(head);
		nodes.removeLast();
	}
	public void step(int dir) {
		if (this.dir + dir == 0) {
			throw new RuntimeException("can't backward");
		}
		this.dir = dir;
		step();
	}
	public boolean contains(int i, int j) {
		return nodes.contains(new Node(i, j));
	}
	public String toString() {
		return nodes.toString();
	}
}