package Sbuilder;

import java.util.Scanner;

public class sb_01 {
	/*
	 * Write a java program which accept a sentence as parameter, than reverses
	 * sentence by using StringBuilder and checks if sentence is palindrome or not
	 * (without case sensitivity) Eg : input : I love Java Output:
	 * "Reversed sentence : avaJ evol I . It is not a palindrome"
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Gir bisiler");
		String str = scan.nextLine().toLowerCase();
		String rev = (new StringBuilder(str).reverse().toString());

		if (str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

scan.close();	}

}
