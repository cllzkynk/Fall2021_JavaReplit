/**
 * 
 */
package scanner;

import java.util.Scanner;

/**
 * @author CEL�L Kullan�c�dan bir Float de�er girmesini isteyin, bu say�y� short
 *         de�i�ken tipine d�n��t�r�n ve konsolda yazd�r�n.
 */
public class Scanner_06_TR {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("gir bakalim bir sayi ");
		float f = input.nextFloat();

		int i = (int) f;
		short s = (short) i;

		System.out.println("Short  ==>" + s);
		input.close();

	}

}
