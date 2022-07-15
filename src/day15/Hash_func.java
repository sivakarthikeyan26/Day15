package day15;

import java.util.ArrayList;

public class Hash_func {
	Node head;
	Node temp;
	ArrayList<Node> list = new ArrayList<Node>();
	@SuppressWarnings("rawtypes")
	ArrayList arr = new ArrayList();
	int c = 0;
	/**
	 * 
	 * @param s
	 * Function to add each word in the sentence or paragraph to the hashmap.
	 */
	@SuppressWarnings("unchecked")
	public void find(String s) {
		String[] words = s.split(" ");
		for (String word : words) {
			arr.add(word);
			if (list.size() == 0) {
				Node newnode = new Node(word);
				list.add(newnode);

			} else if (list.size() != 0) {
				
				c = 0;
				for (Node node : list) {
					head = node;
					if (word.equals(node.data)) {
						c += 1;
						Node temp = head;
						while (temp.next != null) {
							temp = temp.next;
						}
						Node newnode = new Node(word);
						temp.next = newnode;
						break;
					}
				}
				if (c == 0) {
					Node newnode = new Node(word);
					head = newnode;
					list.add(head);
				}
			}

		}
		display();
	}
	/**
	 * Function to display the Hashmap.
	 */
	public void display() {
		int count = 0;
		for (Node node : list) {
			count = 0;
			System.out.println();
			Node temp = node;
			while (temp.next != null) {
				count += 1;
				temp = temp.next;
			}
			if (temp.next == null) {
				count += 1;
				System.out.print(temp.data + " : " + count);
				if(count>1) {
					removeDuplicates(temp.data,count-1);
				}
			}
		}
	}
	/**
	 * 
	 * @param s
	 * @param count
	 * Function to remove the duplicates in the sentence/paragraph.
	 */
	public void removeDuplicates(String s, int count) {
		
		while(count!=0) {
			System.out.println(count);
		for (int i=0; i<arr.size(); i++) {
			if(arr.get(i).equals(s)) {
				System.out.println("removed");
				arr.remove(i);
				break;
			}
		}
		count=count-1;
		}
		System.out.println(arr);
	}
}
