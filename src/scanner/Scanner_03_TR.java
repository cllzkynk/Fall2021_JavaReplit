/**
 * 
 */
package scanner;

import java.util.Scanner;

/**
 * @author CEL�L Kullan�c�dan dikd�rtgenin kenar uzunluklar�n� al�n ve
 *         dikd�rtgenin alan�n� ve �evresini konsola yazd�ran bir program yaz�n.
 * 
 *         �rnek ��kt�:
 * 
 *         Alan: 32
 * 
 *         �evre: 24
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
