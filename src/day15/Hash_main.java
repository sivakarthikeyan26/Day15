package day15;

import java.util.Scanner;

public class Hash_main {
	public static Scanner sc = new Scanner(System.in);
	/**
	 * 
	 * @param args
	 * Main function to get the user's input and calling the find fuction to find duplicates.
	 */
	public static void main(String[] args) {
		System.out.println("Enter a sentence or a paragrah to count the occurance of each words");
		String str = sc.nextLine();
		Hash_func hf = new Hash_func();
		hf.find(str);
	}

}
