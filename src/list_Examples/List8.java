/**
 * 
 */
package list_Examples;

import java.util.Scanner;

/**
 * @author CEL?L
 */
public class List8 {

	/**
	 * Write a java program which accept a sentence as parameter, than reverses
	 * sentence by using StringBuilder and checks if sentence is palindrome or not
	 * (without case sensitivity).Use StringBuilder.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Gir bisiler");
		String str=scan.nextLine().toLowerCase();
		String rev=(new StringBuilder(str).reverse().toString());

		
		
		if (str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
