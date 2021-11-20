/**
 * 
 */
package scanner;

import java.util.Scanner;

/**
 * @author CELÝL Kullanýcýdan dikdörtgenin kenar uzunluklarýný alýn ve
 *         dikdörtgenin alanýný ve çevresini konsola yazdýran bir program yazýn.
 * 
 *         Örnek Çýktý:
 * 
 *         Alan: 32
 * 
 *         Çevre: 24
 */
public class Scanner_03_TR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lutfen mevzu bahis dikdortgenin\nkenar uzunlugunu giriniz : ");
		double kenar1 = input.nextDouble();
		System.out.print("Diger kenar : ");
		double kenar2 = input.nextDouble();

		System.out.println("\nKenarlari girilen dikdortgenin;\nAlani   : " + (kenar1 * kenar2) + "\nCevresi : "
				+ (kenar1 + kenar2) * 2);

		input.close();
	}

}
