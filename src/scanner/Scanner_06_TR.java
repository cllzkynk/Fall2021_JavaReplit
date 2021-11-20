/**
 * 
 */
package scanner;

import java.util.Scanner;

/**
 * @author CELÝL Kullanýcýdan bir Float deðer girmesini isteyin, bu sayýyý short
 *         deðiþken tipine dönüþtürün ve konsolda yazdýrýn.
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
