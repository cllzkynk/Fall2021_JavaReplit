/**
 * 
 */
package list_Examples;

import java.util.Scanner;

/**
 * @author CELÝL
 */
public class List9 {

	/**
	 * Write a Java program to get a String from user as input and find the maximum
	 * occurring character in that string.(Ignore case sensitivity).
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string gir");
		String str = scan.nextLine();
		int maxharf = 0;
		char max_harf = str.charAt(0);
		int sayac = 0;

		for (int i = 0; i < str.length(); i++) {
			sayac = 0;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					sayac++;
				}

				if (sayac > maxharf) {
					maxharf = sayac;
					max_harf = str.charAt(i);
				}

			}

		}
		System.out.println("en cok tekrar eden harf ==> " + maxharf + " edet ile  ==> " + max_harf);

		scan.close();
	}

}
