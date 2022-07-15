package day15;

public class Node {
	public String data;
	Node next;
	/**
	 * 
	 * @param word
	 * constructor to create a node.
	 */
	public Node(String word) {
		this.data = word;
		this.next = null;
	}
}
